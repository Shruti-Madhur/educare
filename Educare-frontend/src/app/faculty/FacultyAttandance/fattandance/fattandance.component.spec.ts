import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FattandanceComponent } from './fattandance.component';

describe('FattandanceComponent', () => {
  let component: FattandanceComponent;
  let fixture: ComponentFixture<FattandanceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FattandanceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FattandanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
