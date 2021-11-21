import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewResearchInterestComponent } from './view-research-interest.component';

describe('ViewResearchInterestComponent', () => {
  let component: ViewResearchInterestComponent;
  let fixture: ComponentFixture<ViewResearchInterestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewResearchInterestComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewResearchInterestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
