import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FacAccountComponent } from './fac-account.component';

describe('FacAccountComponent', () => {
  let component: FacAccountComponent;
  let fixture: ComponentFixture<FacAccountComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FacAccountComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FacAccountComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
