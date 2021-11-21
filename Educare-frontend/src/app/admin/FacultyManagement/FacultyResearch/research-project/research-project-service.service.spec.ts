import { TestBed } from '@angular/core/testing';

import { ResearchProjectServiceService } from './research-project-service.service';

describe('ResearchProjectServiceService', () => {
  let service: ResearchProjectServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ResearchProjectServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
