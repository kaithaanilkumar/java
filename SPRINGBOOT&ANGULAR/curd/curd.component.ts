import { Component } from '@angular/core';
import { CurdService } from 'src/app/service/curd.service';

@Component({
  selector: 'app-curd',
  templateUrl: './curd.component.html',
  styleUrls: ['./curd.component.css']
})
export class CurdComponent 
{
  constructor(private _posti:CurdService){}
  dataa={
    id:'',
    name:'',
    branch:'',
    address:'',
    fee:''
  }
  result;
 
  postingdata(data)
  {
    this._posti.post(data.value).subscribe(
      (res)=>{
        console.log("inserted"+res);
        this.result=res;
      }
    )
  }
}
