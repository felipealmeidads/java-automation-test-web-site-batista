package br.com.application.name.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletaUsuariosWebPage {
    public DeletaUsuariosWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'delete') and parent::td/parent::tr/child::td[contains(text(),'AAAAAA')]]")
    private WebElement clicaLixeira;

    @FindBy(id = "notice")
    private WebElement mensagemDeExclusao;

    public WebElement getClicaLixeira() {
        return clicaLixeira;
    }
    public WebElement getMensagemDeExclusao() {
        return mensagemDeExclusao;
    }
}
