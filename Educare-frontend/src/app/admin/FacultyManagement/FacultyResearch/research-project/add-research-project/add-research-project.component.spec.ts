import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddResearchProjectComponent } from './add-research-project.component';

describe('AddResearchProjectComponent', () => {
  let component: AddResearchProjectComponent;
  let fixture: ComponentFixture<AddResearchProjectComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddResearchProjectComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddResearchProjectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
