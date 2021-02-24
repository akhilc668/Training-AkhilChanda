import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeesComponent } from './pages/employees/employees.component';
import { EditComponent } from './pages/employees/edit/edit.component';
import { HeaderComponent } from './layout/header/header.component';
import { FormsModule } from '@angular/forms';
import { SearchComponent } from './pages/employees/search/search.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeesComponent,
    EditComponent,
    HeaderComponent,
    SearchComponent
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
