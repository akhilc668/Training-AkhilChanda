import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from 'src/app/model/employee.model';
import { EmployeeService } from 'src/app/services/employee.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
  id: number=0;
  header:string="";
  employee : Employee = {
    id:0,
    name:"",
    email:"",
    phone:0,
  };
  constructor(private router: Router,private route: ActivatedRoute,private employeeservice:EmployeeService) { }

  ngOnInit(): void {
    this.id=+this.route.snapshot.params['id'];
    this.header = this.id === 0 ? 'Add Employee': 'Edit Employee';
    if(this.id != 0){
      this.employee = <Employee> this.employeeservice.onGetEmployee(this.id);
    }
    this.employee.id= this.employeeservice.employees.length+1;
  
  }

  

  onSubmit(form: NgForm){
    let employee: Employee = {
      id: form.value.id,
      name: form.value.name,
      email: form.value.email,
      phone: form.value.phone,
    }

    if(this.id === 0){
     this.employeeservice.onAdd(employee);
    }else{
      this.employeeservice.onUpdate(employee);
    }
    this.router.navigateByUrl('');
  }

  

}
