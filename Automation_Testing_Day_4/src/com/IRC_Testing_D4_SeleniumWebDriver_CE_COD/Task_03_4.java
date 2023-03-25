package com.IRC_Testing_D4_SeleniumWebDriver_CE_COD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Task 3.4 Locate the Below Elements withXpath
	//Open Page :
	//https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb
	//Element with the Xpath Locator.

public class Task_03_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Task 3.4 Started...");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(co);
			String url = "https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb";
			driver.navigate().to(url);
			driver.manage().window().maximize();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
