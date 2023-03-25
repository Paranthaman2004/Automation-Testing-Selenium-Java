package com.IRC_Testing_D4_SeleniumWebDriver_CE_COD;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Task 3.1: Click My Account *Register.Locate the Below Elements
	//Open the Page:
	// https://demo.opencart.com/index.php?route=account/register&language=en-gb
	// First Name
	// Last Name
	// Email
	// Password
	// Subscribe
public class Task_03_1 {

	public static void main(String[] args) throws Exception {
		try {
			System.out.println("Task 3.1 Started...");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(co);
			String url = "https://demo.opencart.com/index.php?route=account/register&language=en-gb";
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.findElement(By.id("input-firstname")).sendKeys("Paranthaman");
			driver.findElement(By.name("lastname")).sendKeys("L");
			driver.findElement(By.cssSelector("input#input-email")).sendKeys("paranthaman@gmail.com");
			driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("Admin");
			driver.findElement(By.id("input-newsletter-yes")).click();
			driver.findElement(By.name("agree")).click();
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//			driver.quit();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
