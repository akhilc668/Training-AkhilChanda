import { Component, OnInit } from '@angular/core';
import { FormBuilder ,FormArray} from '@angular/forms';

@Component({
  selector: 'app-form-array',
  templateUrl: './form-array.component.html',
  styleUrls: ['./form-array.component.css']
})
export class FormArrayComponent implements OnInit {

  constructor(private fb:FormBuilder) { }

  ngOnInit(): void {
  }

  public responseforms=this.fb.group({

    uname:[''],
    email:[''],
  
  
    address:this.fb.group({
    state:[''],
    city:[''],
    place:[''],
    pincode:[''],
  }),
  aliases: this.fb.array([
    this.fb.control('')
  ])
  
});

check=this.responseforms.value
myfun(){
  console.log(this.responseforms.value)
  this.check = this.responseforms.value
}

get aliases() {
  return this.responseforms.get('aliases') as FormArray;
}

addAlias() {
  this.aliases.push(this.fb.control(''));
}

}
