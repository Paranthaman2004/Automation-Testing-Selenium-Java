package com.IRC_Testing_D5_SeleniumWebBrowserCmds_CE;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_05 {
	public static void main(String[] args) {
		System.out.println("Task 01 Started...");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		String url = "https://demo.smart-hospital.in/site/login/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Super")).click();
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.partialLinkText("Out Patient")).click();	
		System.out.println("OUT Patient Text Name : "+driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3")).getText());
		System.out.println("OUT Patient Tag Name  : "+driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3")).getTagName());
		System.out.println("Size of Search button : Width => "+driver.findElement(By.name("search")).getSize().getWidth()+", Height => "+driver.findElement(By.name("search")).getSize().getHeight());
		System.out.println("Size of Search button : "+driver.findElement(By.name("search")).getCssValue("color"));
		
	}
}
