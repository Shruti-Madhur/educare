import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GeoService {


  private excelData : any;
  private csvData : any;

  setCsvData(data : any){
    this.csvData=data;
  }

  setExcelData(data : any){
    this.excelData=data;
  }

  getExcelData(){
    return this.excelData;
  }

  getCsvData(){
    return this.csvData;
  }

}
