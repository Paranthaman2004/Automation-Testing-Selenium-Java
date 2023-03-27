package com.IRC_Testing_D6_SeleniumSyncAndExceptions_DC_COD;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task {
	public static void main(String[] args) {
		try {
			System.out.println("Task Started...");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(co);
			String url = "https://demowebshop.tricentis.com/";
			driver.navigate().to(url);
			Dimension dimension = new Dimension(720, 890);
			driver.manage().window().setSize(dimension);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[7]/a")).click();
			driver.findElement(By.xpath(
					"/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input"))
					.click();
			driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys("Abcdefgh");
			driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys("Abcdefgh@gmail.com");
			driver.findElement(By.id("giftcard_1_SenderName")).sendKeys("Ijklmnop");
			driver.findElement(By.id("giftcard_1_SenderEmail")).sendKeys("Ijklmnop@gmail.com");
			driver.findElement(By.id("giftcard_1_Message")).sendKeys("Nothing to Say!...");

			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-1\"]")).click();
			if(driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/p")).isDisplayed())
				System.out.println("Gift card Added Succesfully");
			else
				System.out.println("Gift card is'nt Added");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
