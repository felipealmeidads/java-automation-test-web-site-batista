package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.pages.DeletaUsuariosWebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DeletaUsuariosWebFuncionalidade extends BaseTest {

    private DeletaUsuariosWebPage deletaUsuariosWebPage;

    public DeletaUsuariosWebFuncionalidade() {
        this.deletaUsuariosWebPage = new DeletaUsuariosWebPage(webDriver);
    }

    public boolean proximaPagina() throws InterruptedException {
        while (this.webDriver.findElements(By.xpath("//a[contains(text(),'delete') and parent::td/parent::tr/child::td[contains(text(),'CAAA')]]")).size() == 0) {
            Thread.sleep(1000);
            this.deletaUsuariosWebPage.getClicaProximo().click();
        }
        return true;
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
