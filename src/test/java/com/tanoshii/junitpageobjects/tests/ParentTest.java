package com.tanoshii.junitpageobjects.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParentTest {

	protected WebDriver driver;
	protected WebDriverWait wait;

	@Before
	public void configura() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/kzgk290/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 5);
	}

	@After
	public void cierra() {
		driver.quit();
	}

}
