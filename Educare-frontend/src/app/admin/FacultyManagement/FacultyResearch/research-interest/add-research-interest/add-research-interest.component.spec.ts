import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddResearchInterestComponent } from './add-research-interest.component';

describe('AddResearchInterestComponent', () => {
  let component: AddResearchInterestComponent;
  let fixture: ComponentFixture<AddResearchInterestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddResearchInterestComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddResearchInterestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
