import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test1',
  templateUrl: './test1.component.html',
  styleUrls: ['./test1.component.css']
})
export class Test1Component implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  public Employees:any[] = 
[
   	{ EmpName: 'Robert', Dept: 'HR'},
    { EmpName: 'Julie', Dept: 'HR'},
    { EmpName: 'Albert', Dept: 'Finance'},
    { EmpName: 'Michael', Dept: 'Account'},
    { EmpName: 'Jolly', Dept: 'Account'},
    { EmpName: 'German', Dept: 'Finance'}
]; 

}
