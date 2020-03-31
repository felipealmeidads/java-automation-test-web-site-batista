package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.pages.CadastroWebPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

public class CadastroWebFuncionalidade extends BaseTest {

    private CadastroWebPage cadastroWebPage;
    private Random random;

    public CadastroWebFuncionalidade() {
        this.cadastroWebPage = new CadastroWebPage(webDriver);
    }

    public void preencheFormulario(){
//        this.random = new Random();
//        int numero = random.nextInt() * 100;
//        setNome("CAAA"+numero);
        wait.until(ExpectedConditions.visibilityOf(this.cadastroWebPage.getInputNome()));
        this.cadastroWebPage.getInputNome().sendKeys("CAAA");
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
