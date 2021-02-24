import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditComponent } from './pages/employees/edit/edit.component';
import { EmployeesComponent } from './pages/employees/employees.component';
import { SearchComponent } from './pages/employees/search/search.component';

const routes: Routes = [
  {
    path: "",
    component: EmployeesComponent
  },
  {
    path: "employee/add/:id",
    component: EditComponent
  },
  {
    path: "employee/edit/:id",
    component: EditComponent
  },
  {
    path: "search",
    component: SearchComponent
  }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

// export const RoutingComponents=[
//   EmployeesComponent,
//   EditComponent,
//   SearchComponent
// ];