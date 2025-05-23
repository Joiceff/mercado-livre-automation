Feature: Login e Logout no Mercado Livre

  Scenario: Login com credenciais válidas
    Given que o usuário abre o app do Mercado Livre
    When ele informa o login e senha
    And clica no botão de login
    Then ele deve ver a tela inicial do aplicativo
