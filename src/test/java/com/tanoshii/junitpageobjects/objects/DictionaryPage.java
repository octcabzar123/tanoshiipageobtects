package com.tanoshii.junitpageobjects.objects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DictionaryPage extends BasePage{

	private static final String CAMPO = "[name='j']";
	private static final String PINCELADAS = "idStrokeOrderDiagrams";
	
	public DictionaryPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = CAMPO)
	private WebElement campo;

	@Override
	public void verificaPagina() {
		Assert.assertTrue(campo.isDisplayed());
	}

	public BasePage buscaPalabra(String palabra) {
		campo.sendKeys(palabra);
		campo.submit();
		EntryPage resultado = new EntryPage(driver,wait);
		if(resultado.estaElemento(PINCELADAS)){
			return resultado;
		}else{
			return new ResultsPage(driver,wait);
		}
	}

	@Override
	public boolean estaElemento(String elemento) {
		// TODO Auto-generated method stub
		return false;
	}
}
