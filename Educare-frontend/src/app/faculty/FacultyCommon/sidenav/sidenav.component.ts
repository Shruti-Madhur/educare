import { NavbarCommunicationService } from './../../Services/navbar-communication.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sidenav',
  templateUrl: './sidenav.component.html',
  styleUrls: ['./sidenav.component.css']
})
export class SidenavComponent implements OnInit {

  courseExpansion : any;
  examExpansion : any;
  researchExpansion : any;

  constructor(private navComService: NavbarCommunicationService) { }

  ngOnInit(): void {
    this.courseExpansion=this.navComService.course;
    this.examExpansion=this.navComService.exam;
    this.researchExpansion=this.navComService.research;

  }

  coursePanel(){
    this.courseExpansion = !this.courseExpansion;
    this.navComService.setCourseExpansion(this.courseExpansion);

    if(this.examExpansion){
      this.examExpansion = !this.examExpansion;
      this.navComService.setExamExpansion(this.examExpansion);
    }

    if(this.researchExpansion){
      this.researchExpansion = !this.researchExpansion;
      this.navComService.setResearchExpansion(this.researchExpansion);
    }

    console.log("CoursePanel: Course:"+this.courseExpansion);
    console.log("CoursePanel: Exam: "+this.examExpansion);

  }

  examPanel(){
    this.examExpansion = !this.examExpansion;
    this.navComService.setExamExpansion(this.examExpansion);

    if(this.courseExpansion){
      this.courseExpansion = !this.courseExpansion;
      this.navComService.setCourseExpansion(this.courseExpansion);
    }

    if(this.researchExpansion){
      this.researchExpansion = !this.researchExpansion;
      this.navComService.setResearchExpansion(this.researchExpansion);
    }
  
    console.log("ExamPanel: Course:"+this.courseExpansion);
    console.log("ExamPanel: Exam: "+this.examExpansion);

  }

  researchPanel(){
    this.researchExpansion = !this.researchExpansion;
    this.navComService.setResearchExpansion(this.researchExpansion);

    if(this.courseExpansion){
      this.courseExpansion = !this.courseExpansion;
      this.navComService.setCourseExpansion(this.courseExpansion);
    }

    if(this.examExpansion){
      this.examExpansion = !this.examExpansion;
      this.navComService.setExamExpansion(this.examExpansion);
    }
   
  }

  othersControl(){
    if(this.navComService.getCourseExpansion()){
      this.navComService.setCourseExpansion(!this.navComService.getCourseExpansion());
    }
    
    if(this.navComService.getExamExpansion()){
      this.navComService.setExamExpansion(!this.navComService.getExamExpansion());
    }

    if(this.navComService.getResearchExpansion()){
      this.navComService.setResearchExpansion(!this.navComService.getResearchExpansion());
    }

  }

}
