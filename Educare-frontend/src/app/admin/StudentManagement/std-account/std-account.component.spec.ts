import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StdAccountComponent } from './std-account.component';

describe('StdAccountComponent', () => {
  let component: StdAccountComponent;
  let fixture: ComponentFixture<StdAccountComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StdAccountComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StdAccountComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
