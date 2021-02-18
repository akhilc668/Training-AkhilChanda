import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-test2',
  templateUrl: './test2.component.html',
  styleUrls: ['./test2.component.css']
})
export class Test2Component implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  formdata=
{
firstname:"kumar",
lastname:"m",
email:"kumar@gmail.com",
}

myfun(){
  
}

}
