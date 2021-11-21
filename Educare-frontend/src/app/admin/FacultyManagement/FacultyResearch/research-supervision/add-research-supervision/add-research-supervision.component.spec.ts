import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddResearchSupervisionComponent } from './add-research-supervision.component';

describe('AddResearchSupervisionComponent', () => {
  let component: AddResearchSupervisionComponent;
  let fixture: ComponentFixture<AddResearchSupervisionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddResearchSupervisionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddResearchSupervisionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
