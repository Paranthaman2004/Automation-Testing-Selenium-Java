package com.day8.Automation_Testing_Day8;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Task_04 {
	WebDriver driver;
	String url = "https://www.abhibus.com/bus-ticket-booking";
	Actions actions;
  @Test(description = "Bus Booking Process")
  public void BookBusTicket() {
	  driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("Coimbatore");
	  driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("Tenkasi");
	  driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"todaydiv\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"1440318358\"]/span")).click();
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
