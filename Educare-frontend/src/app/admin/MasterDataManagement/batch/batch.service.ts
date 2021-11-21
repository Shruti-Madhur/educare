import { Injectable } from '@angular/core';
import { Batch } from "./batch";
import { Http, Response } from "@angular/http";
import { Headers, RequestOptions } from '@angular/http';
import 'rxjs/add/operator/toPromise';

//const baseUrl = 'http://localhost:8081/api/masterdata/institutional/batch';

@Injectable({
  providedIn: 'root'
})

export class BatchService {
  private apiUrl = 'http://localhost:8081/api/masterdata/institutional/batch';


  constructor(private http: Http) {}

  findAll(): Promise<Array<Batch>> {
    const url = `${this.apiUrl}/get-all`;
    return this.http.get(url)
    .toPromise()
    .then(response => response.json() as Batch[])
    .catch(this.handleError);
  }

  createBatch(batch: Batch): Promise<Array<Batch>> {
    const url = `${this.apiUrl}/add`;
    
    let batchHeaders = new Headers({ 'Content-Type': 'application/json' });
    return this.http.post(url, JSON.stringify(batch), { headers: batchHeaders })
    .toPromise()
    .then(response => response.json() as Batch[])
    .catch(this.handleError);
  }

  updateBatch(batch: Batch): Promise<Array<Batch>> {
    const url = `${this.apiUrl}/update`;
    
    let batchHeaders = new Headers({ 'Content-Type': 'application/json' });
    return this.http.put(url, JSON.stringify(batch), { headers: batchHeaders })
    .toPromise()
    .then(response => response.json() as Batch[])
    .catch(this.handleError);
  }

  deleteBatchById(id: number): Promise<Array<any>> {
    const url = `${this.apiUrl}/delete/${id}`;
    return this.http.delete(url)
    .toPromise()
    .then(response => response.json() as Batch[])
    .catch(this.handleError);
  }
  private handleError(error: any): Promise<Array<any>> {
    console.error('An error occurred', error);
    return Promise.reject(error.message || error);
  }
}
