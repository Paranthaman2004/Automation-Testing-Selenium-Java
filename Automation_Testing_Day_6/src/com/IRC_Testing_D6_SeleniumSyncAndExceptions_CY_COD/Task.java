package com.IRC_Testing_D6_SeleniumSyncAndExceptions_CY_COD;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(co);
			String url = "https://demo.smart-hospital.in/site/login";
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
			driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[5]/a/span")).click();
			driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0_filter\"]/label/input")).sendKeys("jason wood");
			WebElement jason = driver.findElement(By.xpath("//a[@href=\"https://demo.smart-hospital.in/admin/patient/ipdprofile/59\"]"));
			wait.until(ExpectedConditions.elementToBeClickable(jason));
			jason.click();
			System.out.println("Pateient Name : "+driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[1]/div[1]/h3")).getText());
			driver.findElement(By.xpath("//*[@id=\"overview\"]/div/div[1]/div[1]/div/div/a[2]/i")).click();
			WebElement weight = driver.findElement(By.xpath("//*[@id=\"evweight\"]"));
			weight.clear();
			weight.sendKeys("60");
			Select symptoms = new Select(driver.findElement(By.xpath("//*[@id=\"act\"]")));
			symptoms.selectByVisibleText("Skin problems");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"evnoteipd\"]")).sendKeys("Allergic to Sun radiation");
			driver.findElement(By.xpath("//*[@id=\"formeditrecordbtn\"]")).click();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
}
