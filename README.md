# Automação Mobile - Mercado Livre 📱

Este projeto automatiza testes funcionais no app Mercado Livre usando Appium + Java + Maven + TestNG.

## ✅ Requisitos
- Java JDK 11+
- Maven
- Android Studio
- Node.js e Appium (`npm install -g appium`)
- APK do Mercado Livre salvo em `/apps/mercadolivre.apk`

## 🚀 Executando os Testes
1. Inicie o Appium:
```bash
appium
```

2. Execute:
```bash
mvn clean test
```

## 📁 Estrutura
- `pages/`: Page Object Model
- `tests/`: Testes automatizados
- `utils/`: Utils e config

## 📱 Dispositivo
- Emulador Android API 30 (Android 11)
