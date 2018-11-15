import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { PersonaComponent } from './persona/persona.component';
import { MuestroDatosComponent } from './muestro-datos/muestro-datos.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

const routes: Routes = [
  { path: 'savePersona', component: PersonaComponent },
  { path: 'listPersona', component: MuestroDatosComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    PersonaComponent,
    MuestroDatosComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
