import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ResearchInterest } from '../FacultyResearch/research-interest/research-interest';
import { ResearchInterestServiceService } from '../FacultyResearch/research-interest/research-interest-service.service';
import { ResearchProject } from '../FacultyResearch/research-project/research-project';
import { ResearchProjectServiceService } from '../FacultyResearch/research-project/research-project-service.service';
import { ResearchSupervision } from '../FacultyResearch/research-supervision/research-supervision';
import { ResearchSupervisionServiceService } from '../FacultyResearch/research-supervision/research-supervision-service.service';

@Component({
  selector: 'app-view-faculty',
  templateUrl: './view-faculty.component.html',
  styleUrls: ['./view-faculty.component.css']
})
export class ViewFacultyComponent implements OnInit {

  idR: string;
  idS: string;
  idI: string;
  
  researchSupervision: ResearchSupervision;
  researchInterest: ResearchInterest;
  researchProject: ResearchProject;
 

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private researchSupervisionService: ResearchSupervisionServiceService,
    private researchInterestService: ResearchInterestServiceService,
    private researchServiceService: ResearchProjectServiceService,
 
  ) {}

  ngOnInit() {
    this.researchSupervision = new ResearchSupervision();
    this.researchInterest = new ResearchInterest();
    this.researchProject = new ResearchProject();
    

   

 
    this.idR = this.route.snapshot.params['id'];

    this.researchServiceService.get(this.idR).subscribe(
      (data) => {
        console.log(data);
        this.researchProject = data;
      },
      (error) => console.log(error)
    );

    this.idS = this.route.snapshot.params['id'];

    this.researchSupervisionService.get(this.idS).subscribe(
      (data) => {
        console.log(data);
        this.researchSupervision = data;
      },
      (error) => console.log(error)
    );


    this.idI = this.route.snapshot.params['id'];

    this.researchInterestService.get(this.idI).subscribe(
      (data) => {
        console.log(data);
        this.researchInterest = data;
      },
      (error) => console.log(error)
    );
  }
}
