import { Component, OnInit } from '@angular/core';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { Employee } from 'src/app/model/employee.model';
import { EmployeeService } from 'src/app/services/employee.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  searchText:any;
  
  employees: Employee[] =[];

  
  constructor(private empservice:EmployeeService) { }

  ngOnInit(): void {
    this.employees = this.empservice.onGet();
  }
  
  

}
