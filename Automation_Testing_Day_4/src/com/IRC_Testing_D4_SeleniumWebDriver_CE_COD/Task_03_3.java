package com.IRC_Testing_D4_SeleniumWebDriver_CE_COD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//	Task 3.3: Locate the Below Elements withXpath
//	Open the Page:
//	• https://demo.opencart.com/
//	• Find the element Featured using xpath
public class Task_03_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			System.out.println("Task 3.3 Started...");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(co);
			String url = "https://demo.opencart.com";
			driver.navigate().to(url);
			driver.manage().window().maximize();
			System.out.println("Feature Text : "+driver.findElement(By.xpath("//div[@id=\"content\"]/h3")).getText());
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
