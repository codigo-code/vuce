import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  public nombreHome: String = 'pepito';
  public valorFooterHijo: String;

  constructor() { }

  ngOnInit() {
  }

  saludar(event) {
    console.log(event);
    this.valorFooterHijo = event;
  }
}
