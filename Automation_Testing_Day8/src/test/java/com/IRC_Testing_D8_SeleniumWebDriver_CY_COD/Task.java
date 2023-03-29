package com.IRC_Testing_D8_SeleniumWebDriver_CY_COD;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Task {
	WebDriver driver;
	String url = "http://practice.automationtesting.in/";
	Actions actions;
  @Test(description = "Order Products in E-commerce Website")
  public void placeOrder() {
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  actions = new Actions(driver);
	  driver.navigate().to(url);
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
//	  driver.quit();
  }

}
