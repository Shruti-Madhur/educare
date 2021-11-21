import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ResearchSupervision } from '../research-supervision';
import { ResearchSupervisionServiceService } from '../research-supervision-service.service';

@Component({
  selector: 'app-edit-research-supervision',
  templateUrl: './edit-research-supervision.component.html',
  styleUrls: ['./edit-research-supervision.component.css']
})
export class EditResearchSupervisionComponent implements OnInit {
  id: string;
  research: ResearchSupervision;

  constructor(private route: ActivatedRoute, private router: Router,
              private researchService: ResearchSupervisionServiceService) { }

  ngOnInit() {
    this.research = new ResearchSupervision();

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
        this.research = new ResearchSupervision();
        this.list();
      }, error => console.log(error)
    );
  }

  onSubmit(){
    this.updateResearch();
  }
  list(){
    this.router.navigate(['/admin/fac-manage/view-researchSupervision']);
  }

}