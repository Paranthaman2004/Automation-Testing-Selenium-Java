package com.IRC_Testing_D4_SeleniumWebDriver_CE_COD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Task 3.2: Locate the Below Elements
//Open the Page: https://demo.opencart.com/
//Search Text Box
//Returns
//Gift Certificates
//IZ24"US

public class Task_03_2 {
	public static void main(String[] args) throws InterruptedException {
		try {
			System.out.println("Task 3.2 Started...");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(co);
			String url = "https://demo.opencart.com";
			driver.navigate().to(url);
			driver.manage().window().maximize();
			System.out.println("Search Text 		   : "+driver.findElement(By.name("search")).getAttribute("placeholder"));
			System.out.println("Returns Text		   : "+driver.findElement(By.linkText("Returns")).getText());
			System.out.println("Gift Certificates Text : "+driver.findElement(By.partialLinkText("Gift")).getText());
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
}
