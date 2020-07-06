package com.tanoshii.junitpageobjects.objects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultsPage extends BasePage {

	private static final String LISTA = ".entry .message .entrylinks";
	private static final String LINK = "a";

	public ResultsPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = LISTA)
	private WebElement lista;

	@Override
	public void verificaPagina() {
		Assert.assertTrue(lista.isDisplayed());
	}

	public EntryPage damePrimerResultado() {
		WebElement primer = lista.findElement(By.cssSelector(LINK));
		primer.click();
		return new EntryPage(driver, wait);
	}

	@Override
	public boolean estaElemento(String elemento) {
		// TODO Auto-generated method stub
		return false;
	}

}
