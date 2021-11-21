import { TestBed } from '@angular/core/testing';

import { ResearchInterestServiceService } from './research-interest-service.service';

describe('ResearchInterestServiceService', () => {
  let service: ResearchInterestServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ResearchInterestServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
