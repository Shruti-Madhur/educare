import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CourseMangeComponent } from './course-mange.component';

describe('CourseMangeComponent', () => {
  let component: CourseMangeComponent;
  let fixture: ComponentFixture<CourseMangeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CourseMangeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CourseMangeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
