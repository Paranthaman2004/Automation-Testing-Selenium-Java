package com.IRC_Testing_D6_SeleniumSyncAndExceptions_CE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Task 3.1 Started...");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(co);
			String url = "https://demo.opencart.com/index.php?route=account/register&language=en-gb";
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.findElement(By.id("input-firstname")).sendKeys("Paranthaman");
			driver.findElement(By.name("lastname")).sendKeys("L");
			driver.findElement(By.cssSelector("input#input-email")).sendKeys("paranthaman@gmail.com");
			driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("Admin");
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("input-newsletter-yes")))).click();;
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("agree")))).click();
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
