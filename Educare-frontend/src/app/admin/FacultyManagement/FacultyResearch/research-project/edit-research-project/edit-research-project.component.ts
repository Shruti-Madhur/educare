import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ResearchProject } from '../research-project';
import { ResearchProjectServiceService } from '../research-project-service.service';

@Component({
  selector: 'app-edit-research-project',
  templateUrl: './edit-research-project.component.html',
  styleUrls: ['./edit-research-project.component.css']
})
export class EditResearchProjectComponent implements OnInit {

  id: string;
  research: ResearchProject;

  constructor(private route: ActivatedRoute, private router: Router,
              private researchService: ResearchProjectServiceService) { }

  ngOnInit() {
    this.research = new ResearchProject();

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
        this.research = new ResearchProject();
        this.list();
      }, error => console.log(error)
    );
  }

  onSubmit(){
    this.updateResearch();
  }
  list(){
    this.router.navigate(['/admin/fac-manage/view-researchProject']);
  }

}
