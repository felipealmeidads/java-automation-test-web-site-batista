package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.pages.CadastroWebPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CadastroWebFuncionalidade extends BaseTest {

    private CadastroWebPage cadastroWebPage;

    public CadastroWebFuncionalidade() {
        this.cadastroWebPage = new CadastroWebPage(webDriver);
    }

    public void preencheFormulario(){
        wait.until(ExpectedConditions.visibilityOf(this.cadastroWebPage.getInputNome()));
        this.cadastroWebPage.getInputNome().sendKeys("AAAAAA");
        this.cadastroWebPage.getInputSobrenome().sendKeys("AAAAAA");
        this.cadastroWebPage.getInputEmail().sendKeys("teste@teste.cm.br");
        this.cadastroWebPage.getInputEndereco().sendKeys("Rua Maria Joaquina");
        this.cadastroWebPage.getInputUniversidade().sendKeys("FATEC");
        this.cadastroWebPage.getInputProfissao().sendKeys("FullEstag");
        this.cadastroWebPage.getInputGenero().sendKeys("Masculino");
        this.cadastroWebPage.getInputIdade().sendKeys("20");
        this.cadastroWebPage.getBtnCriar().click();
    }
}
