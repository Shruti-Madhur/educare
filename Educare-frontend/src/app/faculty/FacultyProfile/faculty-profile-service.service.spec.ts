import { TestBed } from '@angular/core/testing';

import { FacultyProfileServiceService } from './faculty-profile-service.service';

describe('FacultyProfileServiceService', () => {
  let service: FacultyProfileServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FacultyProfileServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
