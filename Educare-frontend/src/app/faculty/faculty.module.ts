import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { FacultyRoutingModule } from './faculty-routing.module';
import { FacultyComponent } from './faculty.component';
import { SidenavComponent } from './FacultyCommon/sidenav/sidenav.component';
import { HeaderComponent } from './FacultyCommon/header/header.component';
import { DashboardComponent } from './FacultyDashboard/dashboard/dashboard.component';
import { MaterialModule } from './../SharedModules/material/material.module';
import { FacultyProfileComponent } from './FacultyProfile/faculty-profile/faculty-profile.component';
import { FlexLayoutModule } from '@angular/flex-layout';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CurrentComponent } from './FacultyCourses/current/current.component';
import { PreviousComponent } from './FacultyCourses/previous/previous.component';
import { RoutineComponent } from './FacultyExam/routine/routine.component';
import { SeatPlanComponent } from './FacultyExam/seat-plan/seat-plan.component';

import { FstudentsComponent } from './FacultyStudents/fstudents/fstudents.component';
import { FattandanceComponent } from './FacultyAttandance/fattandance/fattandance.component';
import { GradeComponent } from './FacultyGradeSubmit/grade/grade.component';
import { AdviseeComponent } from './FacultyAdvisee/advisee/advisee.component';
import { FeedbackComponent } from './FacultyFeedback/feedback/feedback.component';
import { SettingsComponent } from './FacultySettings/settings/settings.component';
import { SupportComponent } from './FacultySupport/support/support.component';
import { ClassroutineComponent } from './FacultyClassRoutine/classroutine/classroutine.component';
import { NoticeComponent } from './FacultyNotice/notice/notice.component';
import { NotificationComponent } from './FacultyNotification/notification/notification.component';


import { ViewComponent } from './FacultyResearch/view/view.component';

// @ts-ignore
@NgModule({
  declarations: [
    FacultyComponent,
    SidenavComponent,
    HeaderComponent,
    DashboardComponent,
    FacultyProfileComponent,
    CurrentComponent,
    PreviousComponent,
    RoutineComponent,
    SeatPlanComponent,
    
    FstudentsComponent,
    FattandanceComponent,
    GradeComponent,
    AdviseeComponent,
    FeedbackComponent,
    SettingsComponent,
    SupportComponent,
    ClassroutineComponent,
    NoticeComponent,
    NotificationComponent,
    
    ViewComponent, 
  ],
  imports: [
    CommonModule,
    FacultyRoutingModule,
    MaterialModule,
    FlexLayoutModule,
    FormsModule,ReactiveFormsModule
  ]
})
export class FacultyModule { }
