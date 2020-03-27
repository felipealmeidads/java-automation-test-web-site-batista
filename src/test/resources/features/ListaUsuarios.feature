#language: pt
#encoding: UTF-8
#author: Felipe Almeida


Funcionalidade: Deletar usuários

  @web @deletaListaUsuarios
  Cenario: Validar mensagem de sucesso ao deletar um usuário

    Dado que acesso a pagina lista de usuarios
    E estou realizando o teste
      | Numero do CT |                          Nome do CT            | Nome do executor   | Sprint   |
      | 123-XXX      |         Descricao com o nome do caso de teste  |  Marcos Barbosa    | Sprint 3 |
    E confirmo a caixa de alerta
    Entao visualizo na tela "Seu Usuário foi removido com sucesso!"

