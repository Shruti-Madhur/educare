import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ResearchProject } from '../research-project';
import { ResearchProjectServiceService } from '../research-project-service.service';

@Component({
  selector: 'app-add-research-project',
  templateUrl: './add-research-project.component.html',
  styleUrls: ['./add-research-project.component.css']
})
export class AddResearchProjectComponent implements OnInit {
  research: ResearchProject = new ResearchProject();
  submitted = false;

  constructor(private researchService: ResearchProjectServiceService,
              private router: Router) { }

  ngOnInit() {
  }

  new(): void {
    this.submitted = false;
    this.research = new ResearchProject();
  }

  save() {
    this.researchService
      .create(this.research).subscribe(data => {
        console.log(data);
        this.research = new ResearchProject();
        console.log(this.research);
     this.list();
      },
      error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    
    this.save();
  }
  list(){
    this.router.navigate(['/admin/fac-manage/view-researchProject']);
  }
 

}

