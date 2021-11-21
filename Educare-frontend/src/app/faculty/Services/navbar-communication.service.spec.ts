import { TestBed } from '@angular/core/testing';

import { NavbarCommunicationService } from './navbar-communication.service';

describe('NavbarCommunicationService', () => {
  let service: NavbarCommunicationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NavbarCommunicationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
