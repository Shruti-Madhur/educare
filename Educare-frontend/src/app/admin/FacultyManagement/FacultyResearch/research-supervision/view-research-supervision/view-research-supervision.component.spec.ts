import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewResearchSupervisionComponent } from './view-research-supervision.component';

describe('ViewResearchSupervisionComponent', () => {
  let component: ViewResearchSupervisionComponent;
  let fixture: ComponentFixture<ViewResearchSupervisionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewResearchSupervisionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewResearchSupervisionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
