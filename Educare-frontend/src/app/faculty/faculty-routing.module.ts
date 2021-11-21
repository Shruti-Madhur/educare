
import { ViewComponent } from './FacultyResearch/view/view.component';
import { NotificationComponent } from './FacultyNotification/notification/notification.component';
import { NoticeComponent } from './FacultyNotice/notice/notice.component';
import { SupportComponent } from './FacultySupport/support/support.component';
import { SettingsComponent } from './FacultySettings/settings/settings.component';
import { ClassroutineComponent } from './FacultyClassRoutine/classroutine/classroutine.component';
import { FeedbackComponent } from './FacultyFeedback/feedback/feedback.component';
import { AdviseeComponent } from './FacultyAdvisee/advisee/advisee.component';
import { GradeComponent } from './FacultyGradeSubmit/grade/grade.component';
import { SeatPlanComponent } from './FacultyExam/seat-plan/seat-plan.component';
import { RoutineComponent } from './FacultyExam/routine/routine.component';
import { FattandanceComponent } from './FacultyAttandance/fattandance/fattandance.component';
import { FstudentsComponent } from './FacultyStudents/fstudents/fstudents.component';
import { FacultyProfileComponent } from './FacultyProfile/faculty-profile/faculty-profile.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FacultyComponent } from './faculty.component';
import { DashboardComponent } from './FacultyDashboard/dashboard/dashboard.component';
import { CurrentComponent } from './FacultyCourses/current/current.component';
import { PreviousComponent } from './FacultyCourses/previous/previous.component';

const routes: Routes = [
  { path: '', redirectTo:'dashboard', pathMatch: 'full'},

  {
    path: '',
    component: FacultyComponent,
    children: [
      {
        path: 'dashboard',
        component: DashboardComponent
      }
    ]
  },

  {
    path: '',
    component: FacultyComponent,
    children: [
      {
        path: 'profile',
        component: FacultyProfileComponent
      }
    ]
  },

  {
    path: '',
    component: FacultyComponent,
    children: [
      {
        path: 'current-courses',
        component: CurrentComponent,
      },

    ]
  },

  {
    path: '',
    component: FacultyComponent,
    children: [
      {
        path: 'previous-courses',
        component: PreviousComponent
      }
    ],
  },

  {
    path: '',
    component: FacultyComponent,
    children: [
      {
        path: 'students',
        component: FstudentsComponent
      }
    ],
  },

  {
    path: '',
    component: FacultyComponent,
    children: [
      {
        path: 'attandance',
        component: FattandanceComponent
      }
    ],
  },

  {
    path: '',
    component: FacultyComponent,
    children: [
      {
        path: 'class-routine',
        component: ClassroutineComponent
      }
    ],
  },

  {
    path: '',
    component: FacultyComponent,
    children: [
      {
        path: 'exam/routine',
        component: RoutineComponent
      }
    ],
  },

  {
    path: '',
    component: FacultyComponent,
    children: [
      {
        path: 'exam/seat-plan',
        component: SeatPlanComponent
      }
    ],
  },

  {
    path: '',
    component: FacultyComponent,
    children: [
      {
        path: 'grade-submission',
        component: GradeComponent
      }
    ],
  },

  {
    path: '',
    component: FacultyComponent,
    children: [
      {
        path: 'advisee',
        component: AdviseeComponent
      }
    ],
  },


  {
    path: '',
    component: FacultyComponent,
    children: [
      {
        path: 'researchAllInOne/all',
        component: ViewComponent
      }
    ],
  },

  {
    path: '',
    component: FacultyComponent,
    children: [
      {
        path: 'feedbacks',
        component: FeedbackComponent
      }
    ],
  },

  {
    path: '',
    component: FacultyComponent,
    children: [
      {
        path: 'settings',
        component: SettingsComponent
      }
    ],
  },

  {
    path: '',
    component: FacultyComponent,
    children: [
      {
        path: 'support',
        component: SupportComponent
      }
    ],
  },

  {
    path: '',
    component: FacultyComponent,
    children: [
      {
        path: 'notice',
        component: NoticeComponent
      }
    ],
  },

  {
    path: '',
    component: FacultyComponent,
    children: [
      {
        path: 'notification',
        component: NotificationComponent
      }
    ],
  }

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class FacultyRoutingModule { }
