import { AdminNavServiceService } from './Services/admin-nav-service.service';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { empty } from 'rxjs';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  //Component core variables
  searchVal: String;
  adminName: String;

  //Helper Variables
  noticeFlag: boolean=false;
  notificaationFlag: boolean=false;

  //Notification Manage
  numberOfNotification: number=0;
  notificationList : String[]=["Your new notification is ready!!"];
  notificationTimeList :number[]=[1];

  //Notice Manage
  numberOfNotice: number;
  noticeList : String[]=["This is notice 1","This is notice 2"];
  noticeTimeList: number[]=[5,10];

 
  constructor(private router: Router, private nav_service: AdminNavServiceService) { }

  ngOnInit(): void {
    this.adminName="Ishmam Ruhan";
    this.setNoticeAndNotifiction();

    console.log(this.noticeList.length);
  }


  setNoticeAndNotifiction(){
    this.numberOfNotification=this.notificationList.length;
    this.numberOfNotice=this.noticeList.length;
  }

  searchAction(){
    this.nav_service.setSearchValue=this.searchVal;
    this.router.navigate(['admin/search']);
  }
   
  noticeIconClicked(){
    if(this.noticeFlag){
      this.numberOfNotice=0;
    }
  }

  noticeflag(){
    this.noticeFlag=true;
  }

  notificationIconClicked(){
    if(this.notificaationFlag){
      this.numberOfNotification=0;
    }
  }
  notificationflag(){
    this.notificaationFlag=true;
  }

}
