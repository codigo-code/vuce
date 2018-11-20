import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-card-magica',
  templateUrl: './card-magica.component.html',
  styleUrls: ['./card-magica.component.css']
})
export class CardMagicaComponent implements OnInit {

  public listCard: any =
    [{
      'nombre': 'Tarjeta1',
      'foto': 'https://picsum.photos/200/300'
    },
    {
      'nombre': 'Tarjeta2',
      'foto': 'https://picsum.photos/200/301'
    }];



  constructor() { }

  ngOnInit() {
  }

}
