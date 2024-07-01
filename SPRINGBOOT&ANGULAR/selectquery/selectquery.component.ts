
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { CurdService } from 'src/app/service/curd.service';
import { SelectQueryService } from 'src/app/service/select-query.service';

@Component({
  selector: 'app-selectquery',
  templateUrl: './selectquery.component.html',
  styleUrls: ['./selectquery.component.css']
})
export class SelectqueryComponent 
{
  constructor(private _get:CurdService,private _router:Router){}
result;
ngOnInit()
{
  this.getting();
  
}
getting()
{
  this._get.selecting().subscribe(
    (res)=>{
      
      this.result=res;
    }
  )
}
row(data)
{
  this._router.navigate(['/view',data]);
}
dele(data)
{
  this._router.navigate(['/deleting',data]);
}
editi(data)
{
  this._router.navigate(['/update',data])
}
}