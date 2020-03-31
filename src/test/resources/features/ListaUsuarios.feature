#language: pt
#encoding: UTF-8
#author: Felipe Almeida


Funcionalidade: Deletar usuários

  @web @deletaListaUsuarios
  Cenario: Validar mensagem de sucesso ao deletar um usuário

    Dado que acesso a pagina lista de usuarios
    E localizo o usuario que eu quero apagar
    E confirmo a caixa de alerta
    Entao visualizo na tela "Seu Usuário foi removido com sucesso!"

