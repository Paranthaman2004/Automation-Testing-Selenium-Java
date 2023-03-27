package com.IRC_Testing_D6_SeleniumSyncAndExceptions_PAH_COD;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_01 {
	public static void main(String[] args) {
		try {
			System.out.println("Task Started...");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(co);
			String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")).click();
			WebElement username = driver
					.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[1]/div/div[2]/input"));
			username.sendKeys("Admin");
			username.submit();
			if (driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/h6")).getText()
					.equals("Reset Password link sent successfully"))
				System.out.println("Reset Password Link sent Successfully");

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
