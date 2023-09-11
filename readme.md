Desafio - Sistema Web com Front-end Angular e Back-end Spring Boot
Este é um sistema web composto por um Front-end SPA (Single Page Application) em Angular e um Back-end em Java Spring Boot. Ele permite o upload de arquivos XML, processa esses arquivos e salva os dados no banco de dados.

Pré-requisitos
Java 11
Node.js 14+
Maven 3
Instruções de Instalação e Execução
Back-end (Spring Boot)
Clone este repositório:

bash
Copy code
git clone https://github.com/Leonardomat7/desafioDev.git
Navegue para a pasta do projeto Back-end:

bash
Copy code
cd seu-repositorio/back-end
Inicie o servidor Spring Boot:

arduino
Copy code
./mvnw spring-boot:run
O Back-end estará em execução em http://localhost:8080.

Front-end (Angular)
Navegue para a pasta do projeto Front-end:

bash
Copy code
cd seu-repositorio/front-end
Instale as dependências do Angular:

Copy code
npm install
Inicie o servidor de desenvolvimento Angular:

Copy code
ng serve
O Front-end estará em execução em http://localhost:4200.

Acesse o aplicativo no navegador em http://localhost:4200 e utilize-o conforme os requisitos especificados.

Banco de Dados
O banco de dados utilizado é o H2, um banco de dados em memória. Os dados serão armazenados temporariamente durante a execução do sistema.

Foram realizado os testes unitarios em junit 5 com mockito.