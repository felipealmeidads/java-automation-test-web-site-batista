package br.com.appName.steps.web;

import br.com.application.name.web.funcionalidade.DeletaUsuariosWebFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class DeletaUsuariosWebSteps {

    private DeletaUsuariosWebFuncionalidade deletaUsuariosWebFuncionalidade;

    public DeletaUsuariosWebSteps(){
        this.deletaUsuariosWebFuncionalidade = new DeletaUsuariosWebFuncionalidade();
    }

    @E("^localizo o usuario que eu quero apagar$")
    public void localizoOUsuarioQueEuQueroApagar() throws InterruptedException {
        this.deletaUsuariosWebFuncionalidade.proximaPagina();
    }

    @E("^confirmo a caixa de alerta$")
    public void confirmoACaixaDeAlerta() throws InterruptedException {
        if (deletaUsuariosWebFuncionalidade.proximaPagina()) {
            this.deletaUsuariosWebFuncionalidade.deletaUsuario();
        }
    }

    @Entao("^visualizo na tela \"([^\"]*)\"$")
    public void visualizoNaTela(String mensagem2) {
        Assert.assertEquals("Seu Usuário foi removido com sucesso!", this.deletaUsuariosWebFuncionalidade.retornaMensagem2());
    }
}