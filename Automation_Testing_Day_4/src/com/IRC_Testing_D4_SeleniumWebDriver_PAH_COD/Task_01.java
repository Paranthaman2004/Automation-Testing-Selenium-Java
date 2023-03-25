package com.IRC_Testing_D4_SeleniumWebDriver_PAH_COD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_01 {
	public static void main(String[] args) {
		System.out.println("Task 01 Started...");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		String url = "https://www.amazon.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Start here.")).click();
		driver.findElement(By.name("customerName")).sendKeys("Paranthaman L");
		driver.findElement(By.name("email")).sendKeys("paranthaman2004@gmail.com");
		driver.findElement(By.name("password")).sendKeys("HiiHello");
		driver.findElement(By.name("passwordCheck")).sendKeys("HiiHello");
		driver.findElement(By.id("continue")).click();
	}
}
