import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CardMagicaComponent } from './card-magica.component';

describe('CardMagicaComponent', () => {
  let component: CardMagicaComponent;
  let fixture: ComponentFixture<CardMagicaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CardMagicaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CardMagicaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
