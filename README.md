# 🚀 Projeto Spring Boot + Swagger DIO

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring--Boot-3.0+-green.svg)
![Swagger](https://img.shields.io/badge/Swagger-UI-blueviolet.svg)
![License](https://img.shields.io/badge/license-MIT-lightgrey.svg)

Projeto Spring Boot criado como parte do bootcamp da [Digital Innovation One (DIO)](https://web.dio.me/), com foco na documentação de APIs REST usando **Swagger**.

> ⚠️ **Atenção:** Este projeto atualmente nao extende a interface JPA por motivos didáticos durante o curso, mas são implementados métodos iguais aos utilizados na interface.
---

## 🧩 Estrutura do Projeto

```bash

src
├── main
│ ├── java
│ │ └── com.champs.springSwagger
│ │ ├── controller # Controllers REST
│ │ ├── doc # Configuração do Swagger
│ │ │ └── SwaggerConfig.java
│ │ ├── handler # Manipulação de exceções
│ │ ├── model # Classes de domínio
│ │ ├── repository # Repositórios (JPA)
│ │ └── SpringSwaggerApplication.java
│ └── resources # Configurações (application.properties)
```

---

## ✅ Funcionalidades

- 🔧 Projeto base com Spring Boot 3+
- 📄 Configuração de documentação Swagger/OpenAPI
- 💾 Estrutura REST com Controllers, Services e Repositories
- ⚠️ Handler global para exceções

---

## 📦 Tecnologias

- Java 17
- Spring Boot
- Spring Web
- Swagger (Springdoc OpenAPI)

---

## 🚀 Como executar

### 1. Clone o repositório

```bash

git clone https://github.com/champs-8/projeto-springboot-dio.git
cd projeto-springboot-dio
```
### 2. Execute a aplicação

```bash

./mvnw spring-boot:run
```

### 3. Acesse no navegador
```bash

API: http://localhost:8080
Swagger UI: http://localhost:8080/swagger-ui.html ✨
```
---
## 📂 SwaggerConfig.java
>O arquivo SwaggerConfig dentro da pasta doc/ é responsável por configurar a interface interativa de testes da API.
