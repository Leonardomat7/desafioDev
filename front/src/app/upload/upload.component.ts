import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-upload',
  templateUrl: './upload.component.html',
  styleUrls: ['./upload.component.css']
})
export class UploadComponent {
  uploading: boolean = false;
  fileInput: File | null = null;
  serverResponse: string | null = null;
  errorMessage: string | null = null;

  constructor(private http: HttpClient) {}

  handleFileInput(event: any): void {
    this.fileInput = event.target.files[0];
  }

  uploadFile(): void {
    if (!this.fileInput) {
      return;
    }

    this.uploading = true;
    this.errorMessage = null; // Limpar mensagem de erro ao iniciar o upload

    const formData = new FormData();
    formData.append('file', this.fileInput);

    this.http.post('http://localhost:8080/api/upload/upload', formData, { responseType: 'text' }).subscribe(
      (response) => {
        this.serverResponse = response;

        console.log('Resposta do servidor:', this.serverResponse);

        this.uploading = false;
        this.fileInput = null;
      },
      (error) => {
        console.error('Erro no upload', error);

        this.errorMessage = 'Erro ao fazer upload. Por favor, tente novamente.';
        this.uploading = false;
        this.fileInput = null;
      }
    );
  }
}
