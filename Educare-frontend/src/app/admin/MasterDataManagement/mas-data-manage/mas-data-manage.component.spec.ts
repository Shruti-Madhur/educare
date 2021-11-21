import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MasDataManageComponent } from './mas-data-manage.component';

describe('MasDataManageComponent', () => {
  let component: MasDataManageComponent;
  let fixture: ComponentFixture<MasDataManageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MasDataManageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MasDataManageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
