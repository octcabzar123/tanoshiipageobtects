package com.tanoshii.junitpageobjects.objects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
	
	private static final String INICIO = "https://www.tanoshiijapanese.com/home/";
	private static final String GEISHA_IMAGEN = "[src='../graphics/geisha.png']";
	private static final String LINK_DICCIONARIO = "[href='../dictionary/']";
	
	@FindBy(css = GEISHA_IMAGEN)
	private WebElement geishaImagen;
	
	@FindBy(css = LINK_DICCIONARIO)
	private WebElement linkDiccionario;
	
	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}

	@Override
	public void verificaPagina() {
		Assert.assertTrue(geishaImagen.isDisplayed());
	}

	public void veAPagina() {
		driver.navigate().to(INICIO);
		
	}

	public DictionaryPage veADiccionario() {
		linkDiccionario.click();
		return new DictionaryPage(driver, wait);
	}

	@Override
	public boolean estaElemento(String elemento) {
		// TODO Auto-generated method stub
		return false;
	}

}
