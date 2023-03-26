package com.IRC_Testing_D5_SeleniumWebBrowserCmds_CE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//	Task 01: Web Driver Commands
//	Perform the below step
	//	Open the Page: https:(/i2store.net/free/
	//	Get the Title of the Page
	//	Validate the title of the Page is "Home"
	//	In products category Click on the Clothing link.
	//	Get the Title of the Page
	//	Validate the title of the Page is "Shop"
class Task_01 {

	public static void main(String[] args) {
		try {
			System.out.println("Task 01 Started...");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(co);
			String url = "https://j2store.net/free/";
			driver.navigate().to(url);
			driver.manage().window().maximize();
			System.out.println(
					(driver.getTitle().equals("Home")) ? 
					"Page Titles are Same Home" : 
					"Page Titles are Different Home");
			driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
			System.out.println("Title of the Page after Clothing click : "+driver.getTitle());
			System.out.println(
					(driver.getTitle().equals("Shop")) ? 
					"Page Titles are Same Shop" : 
					"Page Titles are Different Shop");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
