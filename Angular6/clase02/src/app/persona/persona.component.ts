import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-persona',
  templateUrl: './persona.component.html',
  styleUrls: ['./persona.component.css']
})
export class PersonaComponent implements OnInit {

  // lo puritano de la programacion en typescript
  private id: Number = 0;
  private nombre: String = '';
  private apellido: String = '';

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }


  guardarPersona() {

    try {
      const persona: any = {
        'id': this.id,
        'nombre': this.nombre,
        'apellido': this.apellido
      };

      this.http.post('http://localhost:8080/savePersona', persona).subscribe(response => {
        console.log('se guardo ok!');
      },
        err => {
          console.log('se rompio tode putes ' + err);
        });


    } catch (error) {
      console.log(' exploto al hacer la peticion a la java ameo' );
    }
  }

}
