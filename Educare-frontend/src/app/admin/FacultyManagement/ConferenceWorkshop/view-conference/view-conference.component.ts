import { ConferenceServiceService } from './../conference-service.service';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Conference } from '../conference';
import { Router } from '@angular/router';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-view-conference',
  templateUrl: './view-conference.component.html',
  styleUrls: ['./view-conference.component.css']
})
export class ViewConferenceComponent implements OnInit {

  conference: Observable<Conference[]>;
  searchFormName;
  searchFormId;
  constructor(
    private conferenceService: ConferenceServiceService,
    private router: Router,
    private formBuilder: FormBuilder
  ) {
    this.searchFormName = this.formBuilder.group({
      topic: '',
    });
    this.searchFormId = this.formBuilder.group({
      id: '',
    });
  }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData() {
    this.conference = this.conferenceService.getAll();
    console.log(this.conference);
  }

  delete(id: string) {
    this.conferenceService.delete(id).subscribe(
      (data) => {
        console.log("worked");
       this.reloadData();
        console.log(data);
       
       
      },

      (error) =>    console.log(error)
  
    );
  }


  update(id: string) {
    this.router.navigate(['/admin/fac-manage/edit-conference', id]);
  }
  add() {
    this.router.navigate(['/admin/fac-manage/add-conference']);
  }
  OnSubmitName(searchName: { topic: string }) {
    console.log('Search topic name:');

    this.conference = this.conferenceService.findByTopic(searchName.topic);
  }
  OnSubmitId(searchId: { id: string }) {
    console.log('Search Id :');
    console.log(searchId.id);

    this.conferenceService.get(searchId.id).subscribe(
      (data) => {
        console.log(data);
        this.conference = data;
      },
      (error) => console.log(error)
    );
  }
}
