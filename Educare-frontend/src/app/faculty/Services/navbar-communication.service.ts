import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NavbarCommunicationService {

  course! : boolean;
  exam! : boolean;
  research! : boolean;

  constructor() { }

  setCourseExpansion(value: any){
    this.course=value;
  }

  setExamExpansion(value: any){
    this.exam=value;
  }

  setResearchExpansion(value: any){
    this.research=value;
  }

  getCourseExpansion(){
    return this.course;
  }

  getExamExpansion(){
    return this.exam;
  }

  getResearchExpansion(){
    return this.research;
  }

}
