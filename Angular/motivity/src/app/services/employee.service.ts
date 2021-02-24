import { Injectable } from '@angular/core';
import { Employee } from '../model/employee.model'
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  employees: Employee[] = [
    {
      id:1,
      name:"Akhil",
      email: "akhil@gmail.com",
      phone: 1111
    },
    {
      id:2,
      name:"Prashanth",
      email: "prashanth@gmail.com",
      phone: 2222
    }
  ];
  latestId:number = this.employees.length;
  constructor() { }

  onGet(){
    return this.employees;
  }

  onAdd(employee: Employee){
    this.employees.push(employee);
    this.latestId=employee.id;
  }

  onDelete(id: number){
    let emp = <Employee>this.employees.find(x=>x.id === id);
    let index = this.employees.indexOf(emp,0)
    this.employees.splice(index,1);
  }

  onGetEmployee(id: number){
    return this.employees.find(x=>x.id === id);
  }

  onUpdate(employee: Employee){
    let oemployee = <Employee>this.employees.find(x=> x.id === employee.id);
    oemployee.name = employee.name;
    oemployee.email = employee.email;
    oemployee.phone = employee.phone;
  }

  onSearch(name:string,email:string){
    let employees :Employee []= [];
    if(email === "" && name!= ""){
    employees = this.employees.filter(x=>x.name === name);
    }else{
      employees = this.employees.filter(x=>x.email === email)
    }
    return employees;
  }
}
