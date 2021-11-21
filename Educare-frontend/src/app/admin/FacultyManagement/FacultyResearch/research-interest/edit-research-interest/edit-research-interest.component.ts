import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ResearchInterest } from '../research-interest';
import { ResearchInterestServiceService } from '../research-interest-service.service';

@Component({
  selector: 'app-edit-research-interest',
  templateUrl: './edit-research-interest.component.html',
  styleUrls: ['./edit-research-interest.component.css']
})
export class EditResearchInterestComponent implements OnInit {
  id: string;
  research: ResearchInterest;

  constructor(private route: ActivatedRoute, private router: Router,
              private researchService: ResearchInterestServiceService) { }

  ngOnInit() {
    this.research = new ResearchInterest();

    this.id = this.route.snapshot.params['id'];

    this.researchService.get(this.id)
      .subscribe(data => {
        console.log(data);
        this.research = data;
      }, error => console.log(error));
  }

  updateResearch(){
    
    this.researchService.update(this.id, this.research).subscribe(
      data => {
        console.log(data);
        this.research = new ResearchInterest();
        this.list();
      }, error => console.log(error)
    );
  }

  onSubmit(){
    this.updateResearch();
  }
  list(){
    this.router.navigate(['/admin/fac-manage/view-researchInterest']);
  }

}
