import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminNavServiceService {

  private searchval : String;

  constructor() { }

  set setSearchValue(val: String){
    this.searchval=val;
  }
 
  get getSearchValue(){
    return this.searchval;
  }
}
