package com.IRC_Testing_D6_SeleniumSyncAndExceptions_CE;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_04 {
	public static void main(String[] args) {
		try {
			System.out.println("Task 04 Started...");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(co);
			String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
			WebElement pass = driver.findElement(By.name("password"));
			pass.sendKeys("admin123");
			pass.submit();
			if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"))
				System.out.println("User successfully logged In...");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
