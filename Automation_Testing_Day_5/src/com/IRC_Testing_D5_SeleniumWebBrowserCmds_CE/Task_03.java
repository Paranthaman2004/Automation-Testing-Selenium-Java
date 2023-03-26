package com.IRC_Testing_D5_SeleniumWebBrowserCmds_CE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_03 {
	public static void main(String[] args) {
		System.out.println("Task 03 Started...");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		String url = "https://j2store.net/free/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		List<WebElement> listOfItems =  driver.findElements(By.xpath("//h2[@itemprop=\"name\"]"));
		for(WebElement each : listOfItems)
			System.out.println(each.getText());
	}
}
