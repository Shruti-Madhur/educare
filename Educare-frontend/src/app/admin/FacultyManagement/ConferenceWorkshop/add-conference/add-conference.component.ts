import { Conference } from './../conference';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ConferenceServiceService } from '../conference-service.service';

@Component({
  selector: 'app-add-conference',
  templateUrl: './add-conference.component.html',
  styleUrls: ['./add-conference.component.css']
})
export class AddConferenceComponent implements OnInit {

  
  conference: Conference = new Conference();
  submitted = false;
  
  constructor(private conferenceService: ConferenceServiceService, 
              private router: Router) { }

  ngOnInit() {
    
    
  }

  newConference(): void {
    this.submitted = false;
    this.conference = new Conference();
  }

  save() {
    this.conferenceService
      .create(this.conference).subscribe(data => {
        console.log(data);
        this.conference = new Conference();
        console.log(this.conference);
        this.gotoList();
      },
      error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    
    this.save();
  }
  gotoList() {
    this.router.navigate(['/admin/fac-manage/view-conference']);
  }
 

}
