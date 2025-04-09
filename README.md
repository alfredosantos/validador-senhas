# Validador de Senhas

Este projeto é uma aplicação Spring Boot que valida senhas com base em diversas regras, seguindo os princípios do SOLID para garantir modularidade e escalabilidade.

## Funcionalidades

- Validação de senhas com base em regras específicas:
    - Tamanho mínimo de 9 caracteres.
    - Contém pelo menos um dígito.
    - Contém pelo menos uma letra minúscula.
    - Contém pelo menos uma letra maiúscula.
    - Contém pelo menos um caractere especial (!@#$%^&*()-+).
    - Não possui caracteres repetidos.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **Maven**
- **JUnit 5** para testes unitários
- **Mockito** para testes com mocks

## Estrutura do Projeto

src/
├── main/
│   ├── java/
│   │   └── br/com/alfredo/validadorsenhas/
│   │       ├── ValidadorsenhasApplication.java
│   │       ├── ValidadorsenhasService.java
│   │       ├── validator/
│   │       │   ├── PasswordValidator.java
│   │       │   └── rules/
│   │       │       ├── PasswordRuleValidator.java
│   │       │       ├── LengthRule.java
│   │       │       ├── DigitRule.java
│   │       │       ├── LowercaseRule.java
│   │       │       ├── UppercaseRule.java
│   │       │       ├── SpecialCharacterRule.java
│   │       │       └── NoRepeatedCharactersRule.java
│   │       └── config/
│   │           └── AppConfig.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/
        └── br/com/alfredo/validadorsenhas/
            ├── ValidadorsenhasServiceTest.java
            ├── ValidadorsenhasApplicationTests.java
            └── rules/
                ├── LengthRuleTest.java
                ├── DigitRuleTest.java
                ├── LowercaseRuleTest.java
                ├── UppercaseRuleTest.java
                ├── SpecialCharacterRuleTest.java
                └── NoRepeatedCharactersRuleTest.java

## Configuração

Para configurar o projeto, siga os passos abaixo:

1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/validadorsenhas.git
   ```
2. Navegue até o diretório do projeto:
   ```sh
   cd validadorsenhas
   ```
3. Compile e execute o projeto:
   ```sh
   ./mvnw spring-boot:run
   ```

## Uso

A API expõe um endpoint para validar senhas:

- **POST /api/v1/passwords/validate**: Valida uma senha com base nas regras estabelecidas.

### Exemplo de Requisição

```sh
curl -X POST "http://localhost:8080/api/v1/passwords/validate" -H "Content-Type: application/json" -d "\"A1b!2c3d4\""
```

### Exemplo de Resposta

- **Senha válida**:
  ```json
  true
  ```
- **Senha inválida**:
  ```json
  false
  ```

## Testes

Para executar os testes, use o comando:

```sh
./mvnw test
```