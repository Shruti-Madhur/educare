import { ConferenceServiceService } from './../conference-service.service';
import { Conference } from './../conference';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-edit-conference',
  templateUrl: './edit-conference.component.html',
  styleUrls: ['./edit-conference.component.css']
})
export class EditConferenceComponent implements OnInit {

  id: string;
  conference: Conference;

  constructor(private route: ActivatedRoute, private router: Router,
              private conferenceService: ConferenceServiceService) { }

  ngOnInit() {
    this.conference = new Conference();

    this.id = this.route.snapshot.params['id'];

    this.conferenceService.get(this.id)
      .subscribe(data => {
        console.log(data);
        this.conference = data;
      }, error => console.log(error));
  }

  update(){
    
    this.conferenceService.update(this.id, this.conference).subscribe(
      data => {
        console.log(data);
        this.conference = new Conference();
        this.list();
      }, error => console.log(error)
    );
  }

  onSubmit(){
    this.update();
  }
  list(){
    this.router.navigate(['/admin/fac-manage/view-conference']);
  }

}