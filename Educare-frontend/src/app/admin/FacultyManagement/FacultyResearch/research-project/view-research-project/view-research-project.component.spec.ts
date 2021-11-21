import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewResearchProjectComponent } from './view-research-project.component';

describe('ViewResearchProjectComponent', () => {
  let component: ViewResearchProjectComponent;
  let fixture: ComponentFixture<ViewResearchProjectComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewResearchProjectComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewResearchProjectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
