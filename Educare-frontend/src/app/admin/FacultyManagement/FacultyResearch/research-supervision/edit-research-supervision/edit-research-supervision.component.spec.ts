import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditResearchSupervisionComponent } from './edit-research-supervision.component';

describe('EditResearchSupervisionComponent', () => {
  let component: EditResearchSupervisionComponent;
  let fixture: ComponentFixture<EditResearchSupervisionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditResearchSupervisionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditResearchSupervisionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
