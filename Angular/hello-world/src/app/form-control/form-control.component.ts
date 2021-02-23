import { Component, OnInit } from '@angular/core';
import {  FormControl } from '@angular/forms';

@Component({
  selector: 'app-form-control',
  templateUrl: './form-control.component.html',
  styleUrls: ['./form-control.component.css']
})
export class FormControlComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    console.log({
      name:this.uname.value,
      email:this.email.value
    })
  }
  
  uname=new FormControl('Ram');
  email=new FormControl('');

  check={
    name:this.uname.value,
    email:this.email.value
  }
  myfun(){
    console.log({
      name:this.uname.value,
      email:this.email.value
    })
    this.check ={
      name:this.uname.value,
      email:this.email.value
    }
  }
}
