import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-style',
  templateUrl: './style.component.html',
  styleUrls: ['./style.component.css']
})
export class StyleComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  col:string="cyan";

morestyles=
{
color:'blue',
fontSize:'50px',
textDecoration:'underline',
backgroundColor:'pink'
}

}
