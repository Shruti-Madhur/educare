import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { ResearchInterest } from '../research-interest';
import { ResearchInterestServiceService } from '../research-interest-service.service';

@Component({
  selector: 'app-view-research-interest',
  templateUrl: './view-research-interest.component.html',
  styleUrls: ['./view-research-interest.component.css']
})
export class ViewResearchInterestComponent implements OnInit {
  research: Observable<ResearchInterest[]>;
  searchFormName;
  searchFormId;
  constructor(
    private researchInterestService: ResearchInterestServiceService,
    private router: Router,
    private formBuilder: FormBuilder
  ) {
    this.searchFormName = this.formBuilder.group({
      subject: '',
     
    });
    this.searchFormId = this.formBuilder.group({
      id: '',
     
    });
  }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData() {
    this.research = this.researchInterestService.getAll();
    console.log(this.research);
  }

  delete(id: string) {
    this.researchInterestService.delete(id).subscribe(
      (data) => {
        console.log(data);
        this.reloadData();
      },
      (error) => console.log(error)
    );
  }

  details(id: string) {
    this.router.navigate(['/admin/fac-manage/viewDetails-researchInterest', id]);
  }

  update(id: string) {
    this.router.navigate(['/admin/fac-manage/edit-researchInterest', id]);
  }
  addResearch() {
    this.router.navigate(['/admin/fac-manage/add-researchInterest']);
  }
  OnSubmitName(searchName: { subject: string }) {
    console.log('Search Project name:');

    this.research = this.researchInterestService.findBySubject(searchName.subject);
  }
  OnSubmitId(searchName: { id: string }) {
    console.log('Search id :');

    this.research = this.researchInterestService.get(searchName.id);
  }
}
