package com.IRC_Testing_D4_SeleniumWebDriver_PAH_COD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_02 {
	public static void main(String[] args) {
		System.out.println("Task Started...");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		String url = "https://demo.wpeverest.com/user-registration/guest-registration-form/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("first_name")).sendKeys("First Name");
		driver.findElement(By.id("last_name")).sendKeys("Last Name");
		driver.findElement(By.id("user_email")).sendKeys("email@gmail.com");
		driver.findElement(By.id("radio_1665627729_Male")).click();
		driver.findElement(By.id("user_pass")).sendKeys("Password@2000$");
//		driver.findElement(By.id("load_flatpickr")).sendKeys("2000-01-01");
		driver.findElement(By.id("input_box_1665629217")).sendKeys("Indian");
//		driver.findElement(By.id("phone_1665627880")).sendKeys("(999) 654-3210");	
	}

}
