import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ResearchProject } from '../research-project';
import { ResearchProjectServiceService } from '../research-project-service.service';

@Component({
  selector: 'app-view-details-research-project',
  templateUrl: './view-details-research-project.component.html',
  styleUrls: ['./view-details-research-project.component.css']
})
export class ViewDetailsResearchProjectComponent implements OnInit {

  id: string;
  research: ResearchProject;

  constructor(private route: ActivatedRoute, private router: Router,
              private researchSupervisionService: ResearchProjectServiceService) { }

  ngOnInit() {
    this.research = new ResearchProject();

    this.id = this.route.snapshot.params['id'];

    this.researchSupervisionService.get(this.id)
      .subscribe(data => {
        console.log(data);
        this.research = data;
      }, error => console.log(error));
  }

  list(){
    this.router.navigate(['/admin/fac-manage/view-researchProject']);
  }
  updateLink(){
    this.router.navigate(['/admin/fac-manage/edit-researchProject/' + this.research.id]);
  }

}
