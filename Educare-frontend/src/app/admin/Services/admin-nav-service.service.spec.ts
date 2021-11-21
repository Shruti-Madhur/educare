import { TestBed } from '@angular/core/testing';

import { AdminNavServiceService } from './admin-nav-service.service';

describe('AdminNavServiceService', () => {
  let service: AdminNavServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminNavServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
