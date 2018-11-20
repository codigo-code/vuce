import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {

  @Output() saludo = new EventEmitter<any>();
  constructor() { }

  ngOnInit() {
  }


  saludoEvent() {
    const objPersona = {
      'nombre': 'Gabriel'
    };
    this.saludo.emit(objPersona);
  }

}
