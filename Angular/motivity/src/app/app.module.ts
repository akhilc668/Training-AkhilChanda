import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule, RoutingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeesComponent } from './pages/employees/employees.component';
import { EditComponent } from './pages/employees/edit/edit.component';
import { HeaderComponent } from './layout/header/header.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    EmployeesComponent,
    EditComponent,
    RoutingComponents,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent,EmployeesComponent]
})
export class AppModule { }
