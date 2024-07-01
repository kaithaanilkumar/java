import { Component } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { CurdService } from 'src/app/service/curd.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent 
{
  ed
  gett;
  result;
    constructor(private _edit:CurdService,private _activerouter:ActivatedRoute){}
    ngOnInit()
    {
      this._activerouter.paramMap.subscribe(
        (params:ParamMap)=>{
          this.gett=params.get('id');
        }
      )
      console.log("hello"+this.gett);
      this._edit.viewdata(this.gett).subscribe(
        (res)=>{
          console.log(res);
          this.result=res;
        }
      )
    }
    updata(up)
    {
      console.log(up.value)
      this._edit.editing(up.value).subscribe(
        (res)=>{
          this.ed=res;
        }
      )
    }
}
