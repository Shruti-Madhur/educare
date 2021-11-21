import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FacManageComponent } from './fac-manage.component';

describe('FacManageComponent', () => {
  let component: FacManageComponent;
  let fixture: ComponentFixture<FacManageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FacManageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FacManageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
