import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListarComponent } from './Persona/listar/listar.component';
import { EditarComponent } from './Persona/editar/editar.component';
import { AddComponent } from './Persona/add/add.component';

@NgModule({
  declarations: [
    AppComponent,
    ListarComponent,
    EditarComponent,
    AddComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
