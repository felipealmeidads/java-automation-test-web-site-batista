package br.com.appName.steps.web;

import br.com.application.name.commons.funcionalidade.ParametrosEvidenciaFuncionalidade;
import br.com.application.name.mobile.funcionalidade.HomeFuncionalidade;
import br.com.application.name.web.funcionalidade.LoginFuncionalidade;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class InitTestStepWeb {

    private LoginFuncionalidade loginFuncionalidade;
    private ParametrosEvidenciaFuncionalidade realizandoTesteFuncionalidade;

    public InitTestStepWeb() {
        this.loginFuncionalidade =  new LoginFuncionalidade();
        this.realizandoTesteFuncionalidade = new ParametrosEvidenciaFuncionalidade();

    }

    @Dado("^realizo login na aplicacao com usuario \"([^\"]*)\"$")
    public void realizoLoginNaAplicacaoComUsuario(String user) {

        this.loginFuncionalidade.loginAplicacao(user);
    }

    @E("^estou realizando o teste$")
    public void estouRealizandoOTeste(DataTable params) {

        System.out.println("Definindo os parametros da evidencia . . .");
        this.realizandoTesteFuncionalidade.executandoTeste(params);
        System.out.println("Parâmetros de evidência ok");
    }


    @Entao("visualizo a mensagem \"([^\"]*)\"$")
    public void visualizoMensagem(String mensagem){
        Assert.assertEquals(mensagem,this.loginFuncionalidade.retornaMensagem());
    }
}
