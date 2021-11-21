import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ResearchInterest } from '../research-interest';
import { ResearchInterestServiceService } from '../research-interest-service.service';

@Component({
  selector: 'app-add-research-interest',
  templateUrl: './add-research-interest.component.html',
  styleUrls: ['./add-research-interest.component.css']
})
export class AddResearchInterestComponent implements OnInit {

  research: ResearchInterest = new ResearchInterest();
  submitted = false;

  constructor(
    private researchService: ResearchInterestServiceService,
    private router: Router
  ) {}

  ngOnInit() {}

  new(): void {
    this.submitted = false;
    this.research = new ResearchInterest();
  }

  save() {
    this.researchService.create(this.research).subscribe(
      (data) => {
        console.log(data);
        this.research = new ResearchInterest();
        console.log(this.research);
        this.list();
      },
      (error) => console.log(error)
    );
  }

  onSubmit() {
    this.submitted = true;

    this.save();
  }
  list() {
    this.router.navigate(['/admin/fac-manage/view-researchInterest']);
  }
}

