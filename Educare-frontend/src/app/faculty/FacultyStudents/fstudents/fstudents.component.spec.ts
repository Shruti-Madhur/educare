import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FstudentsComponent } from './fstudents.component';

describe('FstudentsComponent', () => {
  let component: FstudentsComponent;
  let fixture: ComponentFixture<FstudentsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FstudentsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FstudentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
