package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.pages.DeletaUsuariosWebPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DeletaUsuariosWebFuncionalidade extends BaseTest {

    private DeletaUsuariosWebPage deletaUsuariosWebPage;

    public DeletaUsuariosWebFuncionalidade() {
        this.deletaUsuariosWebPage = new DeletaUsuariosWebPage(webDriver);
    }

    public void deletaUsuario() {
        this.deletaUsuariosWebPage.getClicaLixeira().click();
        confirmaAlertDialog();
    }

    public String retornaMensagem2(){
        wait.until(ExpectedConditions.visibilityOf(this.deletaUsuariosWebPage.getMensagemDeExclusao()));
        return this.deletaUsuariosWebPage.getMensagemDeExclusao().getText();
    }
}
