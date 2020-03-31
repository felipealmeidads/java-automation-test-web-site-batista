package br.com.application.name.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Collection;

public class DeletaUsuariosWebPage {
    public DeletaUsuariosWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Próximo')]")
    private WebElement clicaProximo;

    @FindBy(xpath = "//a[contains(text(),'delete') and parent::td/parent::tr/child::td[contains(text(),'CAAA')]]")
    private WebElement clicaLixeira;

    @FindBy(id = "notice")
    private WebElement mensagemDeExclusao;

    public WebElement getClicaProximo() {
        return clicaProximo;
    }

    public WebElement getClicaLixeira() {
        return clicaLixeira;
    }

    public WebElement getMensagemDeExclusao() {
        return mensagemDeExclusao;
    }

}
