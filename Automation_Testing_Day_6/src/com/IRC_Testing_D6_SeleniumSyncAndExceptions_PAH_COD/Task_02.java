package com.IRC_Testing_D6_SeleniumSyncAndExceptions_PAH_COD;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_02 {
	public static void main(String[] args) {
		try {
			System.out.println("Task Started...");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(co);
			String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
			WebElement pass = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
			pass.sendKeys("admin123");
			pass.submit();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
			
			int size = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div")).size();
			System.out.println("Number of Record : "+size);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
