# 📱 Projeto de Automação Mobile – Mercado Livre

## 🎯 Objetivo
Automatizar testes funcionais no aplicativo Android do Mercado Livre, incluindo:
- Login e Logout
- Busca e adição de itens ao carrinho
- Fluxo de finalização de compra (simulado)

## 🛠️ Tecnologias Utilizadas
- Java 11
- Maven
- Appium
- TestNG
- Cucumber (BDD)
- GitHub Actions (CI/CD)
- Emulador Android (API 30)

## 🗂️ Estrutura de Diretórios

```
mercado-livre-automation/
├── app/                         # APK do Mercado Livre
├── drivers/                    # Drivers Android (se necessário)
├── features/                   # Cenários BDD (Gherkin)
├── src/
│   ├── main/java/pages/        # Page Objects
│   └── test/java/
│       ├── steps/              # Step Definitions (BDD)
│       ├── tests/              # TestNG Tests
│       └── runner/             # Runner do Cucumber
├── .github/workflows/          # GitHub Actions Workflow
├── pom.xml                     # Gerenciador de dependências Maven
└── README.md
```

## ⚙️ Configuração do Ambiente

1. Instale:
   - Java 11+
   - Maven
   - Node.js
   - Appium (`npm install -g appium`)
   - Android Studio

2. Conecte um dispositivo físico ou inicie um emulador com Android 11 (API 30).

3. Suba o Appium:
```bash
appium
```

## ▶️ Execução dos Testes

Para executar via terminal:
```bash
mvn test
```

Ou para rodar os testes BDD com Cucumber:
```bash
mvn test -Dcucumber.options="--tags @login"
```

## 🚀 Integração Contínua

Este projeto conta com integração via **GitHub Actions**. A cada `push` ou `pull request` na branch `main`, os testes são executados automaticamente no pipeline definido em:

```
.github/workflows/appium-tests.yml
```

## 📱 APK

O arquivo do app `mercadolivre.apk` deve ser adicionado manualmente na pasta `app/`.
Site para download https://mercadolibre.br.uptodown.com/android

## 📧 Contato

Joice Fernanda Ferreira - 
