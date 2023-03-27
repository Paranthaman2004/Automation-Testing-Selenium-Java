package com.IRC_Testing_D6_SeleniumSyncAndExceptions_CE;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Task 02 Started...");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(co);
			String url = "https://demo.wpeverest.com/user-registration/paypal-integration-form/";
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.findElement(By.id("user_email")).sendKeys("paranthaman2@gmail.com");
			WebElement pass = driver.findElement(By.id("user_pass"));
			pass.sendKeys("HiHello@1234");
			List<WebElement> listOfObjects = driver.findElements(By.className("ur-checkbox-list"));
			for(WebElement each : listOfObjects)
				System.out.printf("%28s Selected : %5s \n",each.getText(),each.isSelected());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"user-registration-form-310\"]/form/div[2]/button")));
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
