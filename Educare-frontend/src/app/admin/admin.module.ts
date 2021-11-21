import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MaterialModule } from '../SharedModules/material/material.module';
import { FlexLayoutModule } from '@angular/flex-layout';
import { FormsModule , ReactiveFormsModule} from '@angular/forms';
import { AdminRoutingModule } from './admin-routing.module';
import { AdminComponent } from './admin.component';
import { ProfComponent } from './ProfessionalManagement/prof/prof.component';
import { TopbarComponent } from './AdminCommon/topbar/topbar.component';
import { SidebarComponent } from './AdminCommon/sidebar/sidebar.component';
import { DashboardComponent } from './AdminDashboard/dashboard/dashboard.component';
import { CourseMangeComponent } from './CourseManagement/course-mange/course-mange.component';
import { GradeMangeComponent } from './GradeManagement/grade-mange/grade-mange.component';
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
import { MasDataManageComponent } from './MasterDataManagement/mas-data-manage/mas-data-manage.component';
import { StudentManageComponent } from './StudentManagement/student-manage/student-manage.component';
import { FacManageComponent } from './FacultyManagement/fac-manage/fac-manage.component';
import { AddResearchSupervisionComponent } from './FacultyManagement/FacultyResearch/research-supervision/add-research-supervision/add-research-supervision.component';
import { EditResearchSupervisionComponent } from './FacultyManagement/FacultyResearch/research-supervision/edit-research-supervision/edit-research-supervision.component';
import { ViewResearchSupervisionComponent } from './FacultyManagement/FacultyResearch/research-supervision/view-research-supervision/view-research-supervision.component';
import { ViewDetailsResearchSupervisionComponent } from './FacultyManagement/FacultyResearch/research-supervision/view-details-research-supervision/view-details-research-supervision.component';
import { AddResearchInterestComponent } from './FacultyManagement/FacultyResearch/research-interest/add-research-interest/add-research-interest.component';
import { EditResearchInterestComponent } from './FacultyManagement/FacultyResearch/research-interest/edit-research-interest/edit-research-interest.component';
import { ViewResearchInterestComponent } from './FacultyManagement/FacultyResearch/research-interest/view-research-interest/view-research-interest.component';
import { ViewDetailsResearchInterestComponent } from './FacultyManagement/FacultyResearch/research-interest/view-details-research-interest/view-details-research-interest.component';
import { AddResearchProjectComponent } from './FacultyManagement/FacultyResearch/research-project/add-research-project/add-research-project.component';
import { EditResearchProjectComponent } from './FacultyManagement/FacultyResearch/research-project/edit-research-project/edit-research-project.component';
import { ViewResearchProjectComponent } from './FacultyManagement/FacultyResearch/research-project/view-research-project/view-research-project.component';
import { ViewDetailsResearchProjectComponent } from './FacultyManagement/FacultyResearch/research-project/view-details-research-project/view-details-research-project.component';
import { AddConferenceComponent } from './FacultyManagement/ConferenceWorkshop/add-conference/add-conference.component';
import { EditConferenceComponent } from './FacultyManagement/ConferenceWorkshop/edit-conference/edit-conference.component';
import { ViewConferenceComponent } from './FacultyManagement/ConferenceWorkshop/view-conference/view-conference.component';

import { ContentComponent } from './AdminCommon/content/content.component';
import { FooterComponent } from './AdminCommon/footer/footer.component';
import { SearchComponent } from './AdminCommon/search/search.component';
import { ClickOutsideDirective } from '../SharedModules/click-outside.directive';
import { AddComponent } from './MasterDataManagement/geographic/add/add.component';
import { FileDragNDropDirective } from '../SharedModules/file-drag-n-drop.directive';
import { NgxCsvParserModule } from 'ngx-csv-parser';
import { DialogBoxComponent } from './MasterDataManagement/batch/dialog-box/dialog-box.component';

@NgModule({
  declarations: [
    AdminComponent,
    ProfComponent,
    TopbarComponent,
    SidebarComponent,
    DashboardComponent,
    CourseMangeComponent,
    GradeMangeComponent,
    GeographicComponent,
    InstitutionalComponent,
    DepartmentComponent,
    BatchComponent,
    SubjectComponent,
    PhaseComponent,
    ViewFacultyComponent,
    AddFacultyComponent,
    AddStudentComponent,
    ViewStudentComponent,
    EnrollmentComponent,
    FacAccountComponent,
    StdAccountComponent,
    MasDataManageComponent,
    StudentManageComponent,
    FacManageComponent,
    AddResearchSupervisionComponent,
    EditResearchSupervisionComponent,
    ViewResearchSupervisionComponent,
    ViewDetailsResearchSupervisionComponent,
    AddResearchInterestComponent,
    EditResearchInterestComponent,
    ViewResearchInterestComponent,
    ViewDetailsResearchInterestComponent,
    AddResearchProjectComponent,
    EditResearchProjectComponent,
    ViewResearchProjectComponent,
    ViewDetailsResearchProjectComponent,
    AddConferenceComponent,
    EditConferenceComponent,
    ViewConferenceComponent,
    ContentComponent,
    FooterComponent,
    SearchComponent,
    AddComponent,

    //Directives
    ClickOutsideDirective,
    FileDragNDropDirective,
    DialogBoxComponent,


  ],
  imports: [
    CommonModule,
    MaterialModule,
    FlexLayoutModule,
    FormsModule,
    AdminRoutingModule,ReactiveFormsModule,
    AdminRoutingModule,
    NgxCsvParserModule
  ]
})
export class AdminModule { }
