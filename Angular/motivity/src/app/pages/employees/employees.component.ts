import { Component, OnInit } from '@angular/core';
import { EmployeeService } from 'src/app/services/employee.service';
import { Employee } from "src/app/model/employee.model";
@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {
  employees: Employee[] = [];
  constructor(private employeeservice:EmployeeService) { }

  ngOnInit(): void {
    this.employees = this.employeeservice.onGet();
  }

  onDelete(id:number){
    this.employeeservice.onDelete(id);
  }

}
