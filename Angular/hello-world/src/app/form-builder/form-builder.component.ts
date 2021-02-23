import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-form-builder',
  templateUrl: './form-builder.component.html',
  styleUrls: ['./form-builder.component.css']
})
export class FormBuilderComponent implements OnInit {

  constructor(private fb:FormBuilder) { }

  ngOnInit(): void {
    console.log(this.responseforms.value)
  }
  
  public responseforms=this.fb.group({

      uname:this.fb.control(''),
      email:[''],
    
    
      address:this.fb.group({
      state:[''],
      city:[''],
      place:[''],
      pincode:[''],
    })
    
  });

  check=this.responseforms.value
  myfun(){
    console.log(this.responseforms.value)
    this.check = this.responseforms.value
  }

}
