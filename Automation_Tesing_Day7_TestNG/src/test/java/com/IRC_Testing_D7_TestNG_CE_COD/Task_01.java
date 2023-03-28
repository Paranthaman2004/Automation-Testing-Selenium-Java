package com.IRC_Testing_D7_TestNG_CE_COD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_01 {
	WebDriver driver;
	String url = "https://demo.wpeverest.com/user-registration/guest-registration-form/";
	
	@Test
	public void checkTitle() {
		driver.manage().window().maximize();
		String expectedTitle = "Guest Registration Form – User Registration";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to(url);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
