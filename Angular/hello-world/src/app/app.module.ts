import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestComponent } from './test/test.component';
import { Test1Component } from './test1/test1.component';
import { Test2Component } from './test2/test2.component';
import { StyleComponent } from './style/style.component';
import { FormControlComponent } from './form-control/form-control.component';
import { FormArrayComponent } from './form-array/form-array.component';
import { FormBuilderComponent } from './form-builder/form-builder.component';
import { FormGroupComponent } from './form-group/form-group.component';
import { DemotesterComponent } from './demotester/demotester.component';


@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    Test1Component,
    Test2Component,
    StyleComponent,
    FormControlComponent,
    FormArrayComponent,
    FormBuilderComponent,
    FormGroupComponent,
    DemotesterComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
