import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-muestro-datos',
  templateUrl: './muestro-datos.component.html',
  styleUrls: ['./muestro-datos.component.css']
})
export class MuestroDatosComponent implements OnInit {

  private id: Number = 0;
  public persona: any;
  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

  buscarxIdPersona() {
    try {

      this.http.get('http://localhost:8080/getPersona/' + this.id).subscribe(item => {
        this.persona = JSON.stringify(item);
      }, err => {
        console.log('exploto por el aire ' + err);
      });
    } catch (error) {
      console.log('se rompio todo al choto! =>  ' + error);
    }
  }

}
