import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'; // Importe o FormsModule
import { HttpClientModule } from '@angular/common/http'; // Importe o HttpClientModule

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UploadComponent } from './upload/upload.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations'; // Importe o UploadComponent

@NgModule({
  declarations: [
    AppComponent,
    UploadComponent, // Registre o UploadComponent aqui
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule, // Adicione o FormsModule aqui
    HttpClientModule, BrowserAnimationsModule, // Adicione o HttpClientModule aqui
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
