package com.IRC_Testing_D4_SeleniumWebDriver_CY_COD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Task Started...");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		String url = "https://www.alibaba.com/.";
		driver.navigate().to(url);
		driver.manage().window().maximize();
//		WebElement menuContainer =  driver.findElement(By.xpath("//*[@id=\"J_SC_header\"]/header/div[2]/div[1]/div/div[1]"));
		
	}

}
