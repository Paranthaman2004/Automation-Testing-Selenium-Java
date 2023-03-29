package com.day8.Automation_Testing_Day8;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Task_02 {
	WebDriver driver;
	String url = "https://jqueryui.com/droppable/";
	Actions actions;
  @Test(description = "Drag and Drop using Actions class")
  public void dragAndDropUsing() {
	  driver.switchTo().frame(0);
	  WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	  WebElement dist = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	  actions.dragAndDrop(source, dist).perform();
	  Assert.assertEquals(dist.getText(), "Dropped!");
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
