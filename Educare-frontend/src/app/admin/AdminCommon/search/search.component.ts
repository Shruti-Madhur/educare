import { AdminNavServiceService } from './../../Services/admin-nav-service.service';
import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  searchValue : String;

  constructor(private nav_service: AdminNavServiceService, private location: Location) { }

  ngOnInit(): void {
    this.searchValue=this.nav_service.getSearchValue;
    if(this.searchValue==null){
      this.location.back();
    }
  }

}
