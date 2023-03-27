package com.IRC_Testing_D6_SeleniumSyncAndExceptions_CE;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExceptionClass {
	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		String url = "https://demo.wpeverest.com/user-registration/paypal-integration-form/";
		WebDriver driver = new ChromeDriver(co);
//		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.navigate().to(url);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"nav_menu-3\"]/h2")))).click();
//			driver.findElement(By.name("Hii"));
		} catch (TimeoutException e) {
			// TODO: handle exception
			System.out.println("Catch Msg : " + e.getMessage());
		}
	}
}
