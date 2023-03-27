package com.IRC_Testing_D6_SeleniumSyncAndExceptions_CE;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Task_02 {
	public static void main(String[] args) {
		try {
			System.out.println("Task 02 Started...");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(co);
			String url = "https://demo.wpeverest.com/user-registration/guest-registration-form/";
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			driver.navigate().to(url);
			driver.manage().window().maximize();
			WebElement firstName = driver.findElement(By.id("first_name"));
			firstName.sendKeys("Paranthaman");
			WebElement email =  driver.findElement(By.id("user_email"));
			email.sendKeys("paranthaman@gmail.com");
			driver.findElement(By.id("user_pass")).sendKeys("HiHello@1234$");
			WebElement policy =  driver.findElement(By.id("privacy_policy_1665633140"));
			policy.click();
			System.out.println(firstName.isDisplayed() && email.isDisplayed()?"FirstName and Email are Displayed":"FirstName or Email Not Displayed");
			policy.submit();
			WebElement success = driver.findElement(By.xpath("//*[@id=\"ur-submit-message-node\"]"));
			File srcFile = success.getScreenshotAs(OutputType.FILE);
			File distFile = new File("./images/success.png");
			FileHandler.copy(srcFile, distFile);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
