#!/bin/bash

echo "Digite o link do seu repositório GitHub (ex: https://github.com/seu_usuario/mercado-livre-automation.git):"
read REPO_URL

# Inicializa o repositório Git
git init
git add .
git commit -m "Primeiro commit - Projeto de automação mobile Mercado Livre"
git branch -M main
git remote add origin $REPO_URL
git push -u origin main

echo "✅ Projeto enviado para o GitHub com sucesso!"
