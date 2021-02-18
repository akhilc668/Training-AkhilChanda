import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    
  }
  
  msg:number=0;

  myfun1() 
  {
   return this.msg++;
  }
  
  myfun2() 
  {
   return this.msg--;
  }

  sno:number=1001;
  sname:string="kumar"
  saddress:string="hyderabad";
  sphno:number=7896541230;

  msg1:string="not changed";
  myfun3() 
  {
    this.msg1="changed"
    return this.msg1;
  }
}
