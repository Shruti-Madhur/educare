import { Router } from '@angular/router';
import { Component, OnInit, ViewChild, Output, EventEmitter } from '@angular/core';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { MatSnackBar } from '@angular/material/snack-bar';
import * as XLSX from 'xlsx';
import { NgxCsvParser } from 'ngx-csv-parser';
import { NgxCSVParserError } from 'ngx-csv-parser';
import { GeoService } from '../geo.service';
import { analyzeAndValidateNgModules } from '@angular/compiler';

type AOA = any[][];

export class CsvData{
  public upazilla : any;
  public district : any;
  public division : any;
}


@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  excelData : any[]=[];
  csvJsonData: any;

  data: AOA = [];
  files : any[]=[];

  



  @ViewChild('fileImportInput', { static: false }) fileImportInput: any;
  csvData : any[]=[];
  header = true;


  @Output() sendExcelData = new EventEmitter();
  @Output() sendCsvData = new EventEmitter();

  constructor(public activeModal: NgbActiveModal, private snack: MatSnackBar, 
    private ngxCsvParser: NgxCsvParser, private geoService : GeoService,
    private router: Router) { }

  ngOnInit(): void {
  }


  //Excel Section Work
  excelUpload(evt : any){

    const target: DataTransfer = <DataTransfer>(evt.target);

    if (target.files.length !== 1) throw new Error('Cannot use multiple files');
    const reader: FileReader = new FileReader();
    reader.onload = (e: any) => {

      const bstr: string = e.target.result;
      const wb: XLSX.WorkBook = XLSX.read(bstr, { type: 'binary' });

      const wsname: string = wb.SheetNames[0];
      const ws: XLSX.WorkSheet = wb.Sheets[wsname];

      this.data = <AOA>(XLSX.utils.sheet_to_json(ws, { header: 1 }));
      this.excelData = (XLSX.utils.sheet_to_json(ws, { raw: true }));

      console.log(this.excelData);

      this.sendExcelData.next(this.excelData);

    };
    reader.readAsBinaryString(target.files[0]);
  

    this.snack.open("Successfully Uploaded!", 'Close', {
      duration:5000,
    });

    this.activeModal.dismiss();

  }


  
  excelDragDropUpload(files : File[], evt : any){
    this.files = Object.keys(files).map(key => files[key]);

    if (this.files.length !== 1) throw new Error('Cannot use multiple files');
    

    const target: DataTransfer = <DataTransfer>(evt.target);

    const reader: FileReader = new FileReader();

    reader.onload = (e: any) => {
     
      const bstr: string = e.target.result;
      const wb: XLSX.WorkBook = XLSX.read(bstr, { type: 'binary' });

   
      const wsname: string = wb.SheetNames[0];
      const ws: XLSX.WorkSheet = wb.Sheets[wsname];

     
      this.data = <AOA>(XLSX.utils.sheet_to_json(ws, { header: 1 }));
      this.excelData = (XLSX.utils.sheet_to_json(ws, { raw: true }));

      console.log(this.excelData);
      this.sendExcelData.next(this.excelData);
    };
    reader.readAsBinaryString(files[0]);
    

    this.snack.open("Successfully Uploaded!", 'Close', {
      duration:5000,
    });

    
    this.activeModal.dismiss();
  }


  
  //CSV Upload
  csvUpload($event : any){
   // Select the files from the event
    const files = $event.srcElement.files;

    // Parse the file you want to select for the operation along with the configuration
    this.ngxCsvParser.parse(files[0], { header: this.header, delimiter: ',' })
      .pipe().subscribe((csvData) => {

        this.sendCsvData.next(csvData);

      }, (error: NgxCSVParserError) => {
        console.log('Error', error);
      });

      this.snack.open("Successfully Uploaded!", 'Close', {
          duration:5000,
      });

      this.activeModal.dismiss();

  }


  //CSV Test

  //Test End

  csvDragDropUpload(csvFiles : File[],$event : any){

    this.csvData= Object.keys(csvFiles).map(key => csvFiles[key]);

    if (this.csvData.length !== 1) throw new Error('Cannot use multiple files');

   // Select the files from the event

    // Parse the file you want to select for the operation along with the configuration
    this.ngxCsvParser.parse(this.csvData[0], { header: this.header, delimiter: ',' })
      .pipe().subscribe((csvData) => {

        this.sendCsvData.next(csvData);

      }, (error: NgxCSVParserError) => {
        console.log('Error', error);
      });

      this.snack.open("Successfully Uploaded!", 'Close', {
        duration:5000,
      });

      this.activeModal.dismiss();

  }
  
}
