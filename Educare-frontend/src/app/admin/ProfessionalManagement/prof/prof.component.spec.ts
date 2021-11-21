import { ComponentFixture, TestBed } from '@angular/core/testing';

<<<<<<< HEAD:Educare-frontend/src/app/faculty/FacultyResearch/facultyResearch-Project/add-research/add-research.component.spec.ts
import { AddResearchComponent } from './add-research.component';

describe('AddResearchComponent', () => {
  let component: AddResearchComponent;
  let fixture: ComponentFixture<AddResearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddResearchComponent ]
=======
import { ProfComponent } from './prof.component';

describe('ProfComponent', () => {
  let component: ProfComponent;
  let fixture: ComponentFixture<ProfComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProfComponent ]
>>>>>>> 718edf6b3cd7770da1e57f91f3cbfdf6358ad93f:Educare-frontend/src/app/admin/ProfessionalManagement/prof/prof.component.spec.ts
    })
    .compileComponents();
  });

  beforeEach(() => {
<<<<<<< HEAD:Educare-frontend/src/app/faculty/FacultyResearch/facultyResearch-Project/add-research/add-research.component.spec.ts
    fixture = TestBed.createComponent(AddResearchComponent);
=======
    fixture = TestBed.createComponent(ProfComponent);
>>>>>>> 718edf6b3cd7770da1e57f91f3cbfdf6358ad93f:Educare-frontend/src/app/admin/ProfessionalManagement/prof/prof.component.spec.ts
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
