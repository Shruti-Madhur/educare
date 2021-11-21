import {Component, OnInit, ViewChild} from '@angular/core';
import { MatTable } from '@angular/material/table';
import { MatDialog } from '@angular/material/dialog';
import { DialogBoxComponent } from './dialog-box/dialog-box.component';
import { BatchService } from './batch.service';
import { RouterOutlet, Router, ActivationStart } from '@angular/router';
import 'rxjs/add/operator/toPromise';

export interface Batch {
    id: number;
    name: string;
    year: number;
    admissionYear: number;
}

@Component({
  selector: 'app-batch',
  templateUrl: './batch.component.html',
  styleUrls: ['./batch.component.css'],
  providers: [BatchService]
})
export class BatchComponent implements OnInit {
  private batches: Batch[];
  
  displayedColumns: string[] = ['id', 'name', 'year', 'admissionYear', 'action'];
  dataSource: Batch[];
  
  @ViewChild(MatTable,{static:true}) table: MatTable<any>;
  @ViewChild(RouterOutlet) outlet: RouterOutlet;
  
  constructor(
    public dialog: MatDialog,
    private batchService: BatchService,
    private router: Router
  ) {}
    
  ngOnInit(): void {
    this.router.events.subscribe(e => {
    if (e instanceof ActivationStart && e.snapshot.outlet === "administration")
      this.outlet.deactivate();
    });
    this.getAllBatches();
  }
  getAllBatches() {
    this.batchService.findAll()
    .then(
      batches => {
        this.batches = batches;
        this.dataSource = batches;
      },
      err => {
        console.log(err);
      }
      )
    }
      
  openDialog(action: any, obj: { action: any; }) {
    obj.action = action;
    const dialogRef = this.dialog.open(DialogBoxComponent, {
      width: '700px',
      data:obj
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log(result.data);
      if(result.event == 'Add'){
        this.addRowData(result.data);
      }else if(result.event == 'Update'){
        console.log(result.data);
        this.updateRowData(result.data);
      }else if(result.event == 'Delete'){
        this.deleteRowData(result.data);
      }
    });
  }

  addRowData(row_obj: Batch){
    this.batchService.createBatch(row_obj);
  }

  updateRowData(row_obj: Batch){
    this.batchService.updateBatch(row_obj);
  }

  deleteRowData(row_obj: Batch){
    this.batchService.deleteBatchById(row_obj.id);
  }
  
}