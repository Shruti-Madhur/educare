import { EditConferenceComponent } from './FacultyManagement/ConferenceWorkshop/edit-conference/edit-conference.component';
import { AddConferenceComponent } from './FacultyManagement/ConferenceWorkshop/add-conference/add-conference.component';
import { ViewResearchSupervisionComponent } from './FacultyManagement/FacultyResearch/research-supervision/view-research-supervision/view-research-supervision.component';
import { SearchComponent } from './AdminCommon/search/search.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin.component';

import { ProfComponent } from './ProfessionalManagement/prof/prof.component';
import { DashboardComponent } from './AdminDashboard/dashboard/dashboard.component';
import { CourseMangeComponent } from './CourseManagement/course-mange/course-mange.component';
import { GradeMangeComponent } from './GradeManagement/grade-mange/grade-mange.component';
import { MasDataManageComponent } from './MasterDataManagement/mas-data-manage/mas-data-manage.component';
import { GeographicComponent } from './MasterDataManagement/geographic/geographic.component';
import { InstitutionalComponent } from './MasterDataManagement/institutional/institutional.component';
import { DepartmentComponent } from './MasterDataManagement/department/department.component';
import { BatchComponent } from './MasterDataManagement/batch/batch.component';
import { SubjectComponent } from './MasterDataManagement/subject/subject.component';
import { PhaseComponent } from './MasterDataManagement/phase/phase.component';
import { ViewFacultyComponent } from './FacultyManagement/view-faculty/view-faculty.component';
import { AddFacultyComponent } from './FacultyManagement/add-faculty/add-faculty.component';
import { AddStudentComponent } from './StudentManagement/add-student/add-student.component';
import { ViewStudentComponent } from './StudentManagement/view-student/view-student.component';
import { EnrollmentComponent } from './ProfessionalManagement/enrollment/enrollment.component';
import { FacAccountComponent } from './FacultyManagement/fac-account/fac-account.component';
import { StdAccountComponent } from './StudentManagement/std-account/std-account.component';
import { StudentManageComponent } from './StudentManagement/student-manage/student-manage.component';
import { FacManageComponent } from './FacultyManagement/fac-manage/fac-manage.component';
import { ViewResearchProjectComponent } from './FacultyManagement/FacultyResearch/research-project/view-research-project/view-research-project.component';
import { ViewResearchInterestComponent } from './FacultyManagement/FacultyResearch/research-interest/view-research-interest/view-research-interest.component';
import { AddResearchSupervisionComponent } from './FacultyManagement/FacultyResearch/research-supervision/add-research-supervision/add-research-supervision.component';
import { EditResearchSupervisionComponent } from './FacultyManagement/FacultyResearch/research-supervision/edit-research-supervision/edit-research-supervision.component';
import { EditResearchProjectComponent } from './FacultyManagement/FacultyResearch/research-project/edit-research-project/edit-research-project.component';
import { EditResearchInterestComponent } from './FacultyManagement/FacultyResearch/research-interest/edit-research-interest/edit-research-interest.component';
import { AddResearchProjectComponent } from './FacultyManagement/FacultyResearch/research-project/add-research-project/add-research-project.component';
import { AddResearchInterestComponent } from './FacultyManagement/FacultyResearch/research-interest/add-research-interest/add-research-interest.component';
import { ViewDetailsResearchProjectComponent } from './FacultyManagement/FacultyResearch/research-project/view-details-research-project/view-details-research-project.component';
import { ViewDetailsResearchInterestComponent } from './FacultyManagement/FacultyResearch/research-interest/view-details-research-interest/view-details-research-interest.component';
import { ViewDetailsResearchSupervisionComponent } from './FacultyManagement/FacultyResearch/research-supervision/view-details-research-supervision/view-details-research-supervision.component';
import { ViewConferenceComponent } from './FacultyManagement/ConferenceWorkshop/view-conference/view-conference.component';

const routes: Routes = [
  {path: '', redirectTo: 'dashboard', pathMatch: 'full'},


  {
    path: 'dashboard',
    component: AdminComponent,
    children: [
      {path: '', component: DashboardComponent},
    ]
  }, 


  {
    path: 'mas-data-manage',
    component: AdminComponent,
    children: [
      {path: '', component: MasDataManageComponent},
      {path: 'geographic', component: GeographicComponent},
      {path: 'institutional', component: InstitutionalComponent},  
      {path: 'department', component: DepartmentComponent},
      {path: 'batch', component: BatchComponent},
      {path: 'subject', component: SubjectComponent},
      {path: 'phase', component: PhaseComponent},
    ]
  },



  {
    path: 'prof-manage',
    component: AdminComponent,
    children: [
      {path: 'prof', component: ProfComponent},
      {path: 'course-mange', component: CourseMangeComponent},
      {path: 'grade-manage', component: GradeMangeComponent},
      {path: 'enrollment', component: EnrollmentComponent}
    ]
  },
  

   
   {
    path: 'student-manage',
    component: AdminComponent,
    children: [
      {path: '', component: StudentManageComponent},
      {path: 'add-student', component: AddStudentComponent},
      {path: 'view-student', component: ViewStudentComponent},
      {path: 'std-account', component: StdAccountComponent}
    ]
  },



  {
    path: 'fac-manage',
    component: AdminComponent,
    children: [
      {path: '', component: FacManageComponent},
      {path: 'add-faculty', component: AddFacultyComponent},
      {path: 'view-faculty', component: ViewFacultyComponent},
      {path: 'fac-account', component: FacAccountComponent},
      {path: 'view-researchProject', component: ViewResearchProjectComponent},
      {path: 'view-researchInterest', component: ViewResearchInterestComponent},
      {path: 'view-researchSupervision', component: ViewResearchSupervisionComponent},
      {path: 'add-researchProject', component: AddResearchProjectComponent},
      {path: 'add-researchInterest', component: AddResearchInterestComponent},
      {path: 'add-researchSupervision', component: AddResearchSupervisionComponent},
      {path: 'edit-researchProject/:id', component: EditResearchProjectComponent},
      {path: 'edit-researchInterest/:id', component: EditResearchInterestComponent},
      {path: 'edit-researchSupervision/:id', component: EditResearchSupervisionComponent},
      {path: 'viewDetails-researchProject/:id', component: ViewDetailsResearchProjectComponent},
      {path: 'viewDetails-researchInterest/:id', component: ViewDetailsResearchInterestComponent},
      {path: 'viewDetails-researchSupervision/:id', component: ViewDetailsResearchSupervisionComponent},
      {path: 'add-conference', component: AddConferenceComponent},
      {path: 'edit-conference/:id', component: EditConferenceComponent},
      {path: 'view-conference', component: ViewConferenceComponent}
    ]
  },

  {
    path: 'search',
    component: AdminComponent,
    children: [
      {path: '', component: SearchComponent},
    ]
  }, 

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminRoutingModule { }

