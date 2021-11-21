import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ResearchSupervision } from '../research-supervision';
import { ResearchSupervisionServiceService } from '../research-supervision-service.service';
@Component({
  selector: 'app-add-research-supervision',
  templateUrl: './add-research-supervision.component.html',
  styleUrls: ['./add-research-supervision.component.css']
})
export class AddResearchSupervisionComponent implements OnInit {

  research: ResearchSupervision = new ResearchSupervision();
  submitted = false;
  
  constructor(private researchService: ResearchSupervisionServiceService, 
              private router: Router) { }

  ngOnInit() {
    
    
  }

  newResearch(): void {
    this.submitted = false;
    this.research = new ResearchSupervision();
  }

  save() {
    this.researchService
      .create(this.research).subscribe(data => {
        console.log(data);
        this.research = new ResearchSupervision();
        console.log(this.research);
        this.gotoList();
      },
      error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    
    this.save();
  }
  gotoList() {
    this.router.navigate(['/admin/fac-manage/view-researchSupervision']);
  }
 

}


