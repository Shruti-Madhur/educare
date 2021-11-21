import { TestBed } from '@angular/core/testing';

import { ConferenceServiceService } from './conference-service.service';

describe('ConferenceServiceService', () => {
  let service: ConferenceServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ConferenceServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
