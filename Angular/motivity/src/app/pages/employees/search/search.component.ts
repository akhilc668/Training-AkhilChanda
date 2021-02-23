import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Employee } from 'src/app/model/employee.model';
import { EmployeeService } from 'src/app/services/employee.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  employees: Employee[] =[];

  constructor(private empservice:EmployeeService) { }

  ngOnInit(): void {
    this.employees = this.empservice.onGet();
  }
  ename:string="";
  email:string="";
  onSearch(form: NgForm){
    this.ename= form.value.name;
    this.email= form.value.email;
    this.employees= this.empservice.onSearch(this.ename,this.email);
  }

}
