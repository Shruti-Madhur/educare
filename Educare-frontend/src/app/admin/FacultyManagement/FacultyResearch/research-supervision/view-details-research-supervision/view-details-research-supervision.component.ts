import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ResearchSupervision } from '../research-supervision';
import { ResearchSupervisionServiceService } from '../research-supervision-service.service';

@Component({
  selector: 'app-view-details-research-supervision',
  templateUrl: './view-details-research-supervision.component.html',
  styleUrls: ['./view-details-research-supervision.component.css']
})
export class ViewDetailsResearchSupervisionComponent implements OnInit {

  id: string;
  research: ResearchSupervision;

  constructor(private route: ActivatedRoute, private router: Router,
              private researchSupervisionService: ResearchSupervisionServiceService) { }

  ngOnInit() {
    this.research = new ResearchSupervision();

    this.id = this.route.snapshot.params['id'];

    this.researchSupervisionService.get(this.id)
      .subscribe(data => {
        console.log(data);
        this.research = data;
      }, error => console.log(error));
  }

  list(){
    this.router.navigate(['/admin/fac-manage/view-researchSupervision']);
  }
  updateLink() {
    this.router.navigate(['/admin/fac-manage/edit-researchSupervision/'+ this.research.id]);
  }

}