package com.day8.Automation_Testing_Day8;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Task_03 {
	WebDriver driver;
	String url = "https://demo.guru99.com/test/delete_customer.php";
	Actions actions;
  @Test(description = "Delete 402 Customer")
  public void deleteCustomer() {
	  WebElement input = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	  input.sendKeys("401");
	  input.submit();
	  driver.switchTo().alert().dismiss();
	  input.clear();
	  input.sendKeys("402");
	  input.submit();
	  driver.switchTo().alert().accept();
	  
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
