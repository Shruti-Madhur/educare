import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewDetailsResearchInterestComponent } from './view-details-research-interest.component';

describe('ViewDetailsResearchInterestComponent', () => {
  let component: ViewDetailsResearchInterestComponent;
  let fixture: ComponentFixture<ViewDetailsResearchInterestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewDetailsResearchInterestComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewDetailsResearchInterestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
