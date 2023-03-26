package com.IRC_Testing_D5_SeleniumWebBrowserCmds_PAH_COD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_02 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Task 02 Started...");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		String url = "https://www.firstcry.com/shirts/6/220?scat=220@~3518@@@@@@@@@1@0@20@@@@@@@@@@&gender=boy,unisex";
		driver.navigate().to(url);
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/ul/li[3]/a/span")).click();
//		driver.findElement(By.xpath("//*[@id=\"fltagefrm\"]/div[2]/div[2]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[1]/div[2]/div[2]/div[4]/div[2]/div[2]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"fltmrp\"]/div[2]/div[2]/ul/li[1]/a/span[1]")).click();
		
	}
}
