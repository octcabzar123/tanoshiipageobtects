package com.tanoshii.junitpageobjects.objects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryPage extends BasePage {

	private static final String PINCELADAS = "idStrokeOrderDiagrams";

	public EntryPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = PINCELADAS)
	private WebElement pinceladas;

	@Override
	public void verificaPagina() {
		Assert.assertTrue(pinceladas.isDisplayed());
	}

	public boolean estaPinceladas() {
		return pinceladas.isDisplayed();
	}

	@Override
	public boolean estaElemento(String elemento) {
		switch (elemento) {
		case PINCELADAS:
			try{
				wait.until(ExpectedConditions.visibilityOf(pinceladas));
				return pinceladas.isDisplayed();
			}catch(Exception e){
				return false;
			}
		default:
			return false;
		}
	}
}
