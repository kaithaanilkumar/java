import { Component } from '@angular/core';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { CurdService } from 'src/app/service/curd.service';

@Component({
  selector: 'app-deleteing',
  templateUrl: './deleteing.component.html',
  styleUrls: ['./deleteing.component.css']
})
export class DeleteingComponent 
{
  dell;
    constructor( private _del:CurdService,private _activeroute:ActivatedRoute,private _router:Router){}
deledata;
ngOnInit()
{
  this._activeroute.paramMap.subscribe((params:ParamMap)=>{
    this.deledata=params.get('id');
  }
)
this._del.deletingdata(this.deledata).subscribe(
  (res)=>{
    console.log("1 row is deleteing"+res);
      this.dell=res;
      this._router.navigate(['/select'])
  }
)
}
}
