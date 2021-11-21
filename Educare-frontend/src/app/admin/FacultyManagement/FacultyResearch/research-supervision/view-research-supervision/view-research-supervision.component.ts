import { ResearchSupervision } from '../research-supervision';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ResearchSupervisionServiceService } from '../research-supervision-service.service';
import { Router } from '@angular/router';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-view-research-supervision',
  templateUrl: './view-research-supervision.component.html',
  styleUrls: ['./view-research-supervision.component.css']
})
export class ViewResearchSupervisionComponent implements OnInit {

  research: Observable<ResearchSupervision[]>;
  searchFormName;
  searchFormId;
  constructor(
    private researchService: ResearchSupervisionServiceService,
    private router: Router,
    private formBuilder: FormBuilder
  ) {
    this.searchFormName = this.formBuilder.group({
      projectName: '',
    });
    this.searchFormId = this.formBuilder.group({
      id: '',
    });
  }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData() {
    this.research = this.researchService.getAll();
    console.log(this.research);
  }

  delete(id: string) {
    this.researchService.delete(id).subscribe(
      (data) => {
        console.log("worked");
       this.reloadData();
        console.log(data);
       
       
      },

      (error) =>    console.log(error)
  
    );
  }

  details(id: string) {
    this.router.navigate(['/admin/fac-manage/viewDetails-researchSupervision', id]);
  }

  update(id: string) {
    this.router.navigate(['/admin/fac-manage/edit-researchSupervision', id]);
  }
  addResearch() {
    this.router.navigate(['/admin/fac-manage/add-researchSupervision']);
  }
  OnSubmitName(searchName: { projectName: string }) {
    console.log('Search Project name:');

    this.research = this.researchService.findByProjectName(searchName.projectName);
  }
  OnSubmitId(searchId: { id: string }) {
    console.log('Search Id :');
    console.log(searchId.id);

    this.researchService.get(searchId.id).subscribe(
      (data) => {
        console.log(data);
        this.research = data;
      },
      (error) => console.log(error)
    );
  }
}

