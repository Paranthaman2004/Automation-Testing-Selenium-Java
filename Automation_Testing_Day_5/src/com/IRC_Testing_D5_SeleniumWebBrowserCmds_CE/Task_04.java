package com.IRC_Testing_D5_SeleniumWebBrowserCmds_CE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_04 {
	public static void main(String[] args) {
		System.out.println("Task 04 Started...");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		String url = "https://j2store.net/free/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		System.out.println("after Click the Clothing : "+driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("after Back : "+driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println("after Forword : "+driver.getCurrentUrl());
		driver.navigate().refresh();
		System.out.println("after Refresh : "+driver.getCurrentUrl());		
		driver.close();
	}
}
