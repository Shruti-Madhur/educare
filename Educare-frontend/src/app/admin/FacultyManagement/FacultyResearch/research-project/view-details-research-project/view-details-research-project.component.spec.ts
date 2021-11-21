import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewDetailsResearchProjectComponent } from './view-details-research-project.component';

describe('ViewDetailsResearchProjectComponent', () => {
  let component: ViewDetailsResearchProjectComponent;
  let fixture: ComponentFixture<ViewDetailsResearchProjectComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewDetailsResearchProjectComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewDetailsResearchProjectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
