import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditResearchProjectComponent } from './edit-research-project.component';

describe('EditResearchProjectComponent', () => {
  let component: EditResearchProjectComponent;
  let fixture: ComponentFixture<EditResearchProjectComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditResearchProjectComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditResearchProjectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
