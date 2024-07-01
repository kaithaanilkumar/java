import { Component } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { CurdService } from 'src/app/service/curd.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent 
{
    constructor(private _view:CurdService,private _active:ActivatedRoute){}
    result;
    datta
    ngOnInit()
    {
      this._active.paramMap.subscribe((params: ParamMap)=>{
        this.datta=(params.get('id'))
      })
      this._view.viewdata(this.datta).subscribe(
        (res)=>{
          console.log(res);
          this.result=res;
        }
      )
    }
    
}
