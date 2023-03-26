package com.IRC_Testing_D5_SeleniumWebBrowserCmds_CE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_02 {
	public static void main(String[] args) {
		System.out.println("Task 01 Started...");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		String url = "https://j2store.net/free/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		System.out.println(
				(driver.getCurrentUrl().equals(url)) ? 
				"Page URL are Same "+url : 
				"Page URL are Different "+url);
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		System.out.println(
				(driver.getCurrentUrl().equals("https://j2store.net/free/index.php/shop?filter_catid=11")) ? 
				"Page URL are Same "+driver.getCurrentUrl() : 
				"Page URL are Different "+driver.getCurrentUrl());
	}
}
