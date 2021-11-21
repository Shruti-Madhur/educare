import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
const baseUrl = 'http://localhost:8081/api/manage/faculty/interest';
@Injectable({
  providedIn: 'root'
})
export class ResearchInterestServiceService {


  constructor(private http: HttpClient) {}

  getAll(): Observable<any> {
    return this.http.get(baseUrl);
  }

  get(id: string): Observable<any> {
    return this.http.get(`${baseUrl}/${id}`);
  }

  create(data: object): Observable<object> {
    return this.http.post(baseUrl, data);
  }

  update(id: string, data: object): Observable<object> {
    return this.http.put(`${baseUrl}/${id}`, data);
  }

  delete(id: string): Observable<any> {
    return this.http.delete(`${baseUrl}/${id}`);
  }

  deleteAll(): Observable<any> {
    return this.http.delete(baseUrl);
  }
  findBySubject(subject: string): Observable<any> {
    return this.http.get(`${baseUrl}/name/${subject}`);
    }
}


