import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditResearchInterestComponent } from './edit-research-interest.component';

describe('EditResearchInterestComponent', () => {
  let component: EditResearchInterestComponent;
  let fixture: ComponentFixture<EditResearchInterestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditResearchInterestComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditResearchInterestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
