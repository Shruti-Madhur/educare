import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewDetailsResearchSupervisionComponent } from './view-details-research-supervision.component';

describe('ViewDetailsResearchSupervisionComponent', () => {
  let component: ViewDetailsResearchSupervisionComponent;
  let fixture: ComponentFixture<ViewDetailsResearchSupervisionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewDetailsResearchSupervisionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewDetailsResearchSupervisionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
