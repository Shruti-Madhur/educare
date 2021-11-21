import { MatSort } from '@angular/material/sort';
import { AfterViewInit, Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { AddComponent } from './add/add.component';


export interface UserData {
  id: string;
  name: string;
  progress: string;
  color: string;
}

const users : UserData[]=[
  {id: '1', name: 'Test', progress: '10', color: 'black'},
  {id: '2', name: 'Test', progress: '10', color: 'black'},
  {id: '3', name: 'Test', progress: '10', color: 'black'},
  {id: '4', name: 'Test', progress: '10', color: 'black'},
  {id: '1', name: 'Test', progress: '10', color: 'black'},
  {id: '2', name: 'Test', progress: '10', color: 'black'},
  {id: '3', name: 'Test', progress: '10', color: 'black'},
  {id: '4', name: 'Test', progress: '10', color: 'black'},
  {id: '1', name: 'Test', progress: '10', color: 'black'},
  {id: '2', name: 'Test', progress: '10', color: 'black'},
  {id: '3', name: 'Test', progress: '10', color: 'black'},
  {id: '4', name: 'Test', progress: '10', color: 'black'}
] 

@Component({
  selector: 'app-geographic',
  templateUrl: './geographic.component.html',
  styleUrls: ['./geographic.component.css']
})
export class GeographicComponent implements OnInit, AfterViewInit{
  gexcelData: any;
  gcsvData: any;

  displayedColumns = ['serial', 'upazilla', 'district', 'division'];
  dataSource: MatTableDataSource<any>;

  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;

  @ViewChild(AddComponent) addComponent: any;

  counter : number=0;

  constructor(private modalService: NgbModal) { }

  ngOnInit(): void {
    this.dataSource = new MatTableDataSource(this.gexcelData);
  }

  ngAfterViewInit() {
    this.pagination_sort();
  }

  pagination_sort(){
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }

  applyFilter(filterValue: string) {
    filterValue = filterValue.trim(); 
    filterValue = filterValue.toLowerCase(); 
    this.dataSource.filter = filterValue;
  }

  openDialog(){
    const modalRef = this.modalService.open(AddComponent);

    modalRef.componentInstance.sendExcelData.subscribe((emmitedValue: any) => {
          this.gexcelData=emmitedValue;
          this.dataSource = new MatTableDataSource(this.gexcelData);
          this.pagination_sort();
          console.log(this.gexcelData); 
          
     });

     modalRef.componentInstance.sendCsvData.subscribe((emmitedValue: any) => {
        this.gcsvData=emmitedValue;
        this.dataSource = new MatTableDataSource(this.gcsvData);
        this.pagination_sort();
        console.log(this.gcsvData);
     });

  }
}

