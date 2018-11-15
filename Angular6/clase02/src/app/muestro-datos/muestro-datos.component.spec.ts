import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MuestroDatosComponent } from './muestro-datos.component';

describe('MuestroDatosComponent', () => {
  let component: MuestroDatosComponent;
  let fixture: ComponentFixture<MuestroDatosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MuestroDatosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MuestroDatosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
