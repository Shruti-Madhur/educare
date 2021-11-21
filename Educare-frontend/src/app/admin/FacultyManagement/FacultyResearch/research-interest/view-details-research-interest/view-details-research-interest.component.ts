import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ResearchInterest } from '../research-interest';
import { ResearchInterestServiceService } from '../research-interest-service.service';

@Component({
  selector: 'app-view-details-research-interest',
  templateUrl: './view-details-research-interest.component.html',
  styleUrls: ['./view-details-research-interest.component.css']
})
export class ViewDetailsResearchInterestComponent implements OnInit {

 
  id: string;
  research: ResearchInterest;

  constructor(private route: ActivatedRoute, private router: Router,
              private researchSupervisionService: ResearchInterestServiceService) { }

  ngOnInit() {
    this.research = new ResearchInterest();

    this.id = this.route.snapshot.params['id'];

    this.researchSupervisionService.get(this.id)
      .subscribe(data => {
        console.log(data);
        this.research = data;
      }, error => console.log(error));
  }

  list(){
    this.router.navigate(['/admin/fac-manage/view-researchInterest']);
  }
  updateLink(){
    this.router.navigate(['/admin/fac-manage/edit-researchInterest/' + this.research.id]);
  }

}


