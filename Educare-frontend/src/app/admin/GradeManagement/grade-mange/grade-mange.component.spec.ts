import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GradeMangeComponent } from './grade-mange.component';

describe('GradeMangeComponent', () => {
  let component: GradeMangeComponent;
  let fixture: ComponentFixture<GradeMangeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GradeMangeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GradeMangeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
