import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-faculty',
  templateUrl: './faculty.component.html',
  styleUrls: ['./faculty.component.css']
})
export class FacultyComponent implements OnInit {
  sideBarOpen = true;

  constructor() { }

  ngOnInit(): void {
  }


   sideBarToggler() {
    this.sideBarOpen = !this.sideBarOpen;
  }
  

}
