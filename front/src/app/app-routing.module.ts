import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UploadComponent } from './upload/upload.component'; // Importe o UploadComponent

const routes: Routes = [
  { path: '', redirectTo: '/upload', pathMatch: 'full' }, // Rota padrão redireciona para /upload
  { path: 'upload', component: UploadComponent }, // Rota para o UploadComponent
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
