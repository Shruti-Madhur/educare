import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { ResearchProject } from '../research-project';
import { ResearchProjectServiceService } from '../research-project-service.service';

@Component({
  selector: 'app-view-research-project',
  templateUrl: './view-research-project.component.html',
  styleUrls: ['./view-research-project.component.css']
})
export class ViewResearchProjectComponent implements OnInit {

  research: Observable<ResearchProject[]>;
  searchForm;
  constructor(
    private researchService: ResearchProjectServiceService,
    private router: Router,
    private formBuilder: FormBuilder
  ) {
    this.searchForm = this.formBuilder.group({
      journalName: '',
      id:'',
    });
  }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData() {
    this.research = this.researchService.getAll();
    console.log(this.research);
  }

  deleteResearch(id: string) {
    this.researchService.delete(id).subscribe(
      (data) => {
        console.log(data);
        this.reloadData();
      },
      (error) => console.log(error)
    );
  }

  viewDetails(id: string) {
    this.router.navigate(['/admin/fac-manage/viewDetails-researchProject', id]);
  }

  updateResearch(id: string) {
    this.router.navigate(['/admin/fac-manage/edit-researchProject', id]);
  }
  addResearch() {
    this.router.navigate(['/admin/fac-manage/add-researchProject']);
  }
  OnSubmitName(searchName: { journalName: string }) {
    console.log('Search Journal name:');

    this.research = this.researchService.findByJournalName(
      searchName.journalName
    );
  }
  OnSubmitId(searchName: { id: string }) {
    console.log('Search id :');

    this.research = this.researchService.get(
      searchName.id
    );
  }
}
