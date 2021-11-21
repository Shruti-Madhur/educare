import { Component, OnInit, Output,EventEmitter } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  @Output() toggleSidebarForMe: EventEmitter<any> = new EventEmitter();

  headerTitle = false; 

  val : any;

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

   toggleSidebar() {
     this.headerTitle = !this.headerTitle;
    this.toggleSidebarForMe.emit();
  }

  searchBox(){
    console.log(this.val);
    this.val="";
  }


}
