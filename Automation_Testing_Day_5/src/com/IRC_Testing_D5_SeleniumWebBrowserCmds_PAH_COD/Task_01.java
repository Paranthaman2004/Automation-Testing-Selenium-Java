package com.IRC_Testing_D5_SeleniumWebBrowserCmds_PAH_COD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_01 {
	public static void main(String[] args) {
		System.out.println("Task 01 Started...");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		String url = "https://www.firstcry.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	    WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"search_box\"]"));
	    searchBox.clear();
	    searchBox.sendKeys("Toys");
	    searchBox.submit();
	}
}
