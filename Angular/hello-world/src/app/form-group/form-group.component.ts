import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-form-group',
  templateUrl: './form-group.component.html',
  styleUrls: ['./form-group.component.css']
})
export class FormGroupComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  public responseforms=new FormGroup({

    uname:new FormControl('kumar'),
    email:new FormControl('kumar@gmail.com'),
    
    
    address:new FormGroup({
      state:new FormControl('TS'),
      city:new FormControl('HYD'),
      place:new FormControl('DILSUKHNAGAR'),
      pincode:new FormControl('500036'),
    })
    
  });	

  check=this.responseforms.value
  myfun(){
    console.log(this.responseforms.value)
    this.check = this.responseforms.value
  }
}
