package com.IRC_Testing_D7_TestNG_CY_COD;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_CY {
	WebDriver driver;
	String url = "https://practice.automationtesting.in/shop/";
	
	@Test(description = "This Testcase Validate HTML5 froms book price at ₹280.00")
	public void testCase01() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		String priceOfHtmlBook = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[3]/a[1]/span/span")).getText();
		Assert.assertEquals(priceOfHtmlBook, "₹280.00");
	}
	
	@Test(dependsOnMethods = "testCase01")
	public void testCase02() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[5]/a[1]/img")).click();
		if(driver.findElement(By.xpath("//*[@id=\"product-180\"]/div[2]/h1")).getText().equals("JS Data Structures and Algorithm"))
			System.out.println("JS Data Structures and Algorithm is Only Opened");
		else
			throw new NoSuchElementException("Many Book are opened");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
	}

	@AfterMethod
	public void afterMethod() {
//		driver.quit();
	}

}
