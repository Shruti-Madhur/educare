import { TestBed } from '@angular/core/testing';

import { ResearchSupervisionServiceService } from './research-supervision-service.service';

describe('ResearchSupervisionServiceService', () => {
  let service: ResearchSupervisionServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ResearchSupervisionServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
