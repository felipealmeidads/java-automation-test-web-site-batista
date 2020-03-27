package br.com.appName.steps.web;

import br.com.application.name.web.funcionalidade.DeletaUsuariosWebFuncionalidade;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import org.junit.Assert;

public class DeletaUsuariosWebSteps {

    private DeletaUsuariosWebFuncionalidade deletaUsuariosWebFuncionalidade;

    public DeletaUsuariosWebSteps(){
        this.deletaUsuariosWebFuncionalidade = new DeletaUsuariosWebFuncionalidade();
    }

    @Dado("^confirmo a caixa de alerta$")
    public void confirmoACaixaDeAlerta() {
        this.deletaUsuariosWebFuncionalidade.deletaUsuario();
    }

    @Entao("^visualizo na tela \"([^\"]*)\"$")
    public void visualizoNaTela(String mensagem2) {
        Assert.assertEquals("Seu Usuário foi removido com sucesso!", this.deletaUsuariosWebFuncionalidade.retornaMensagem2());
    }
}