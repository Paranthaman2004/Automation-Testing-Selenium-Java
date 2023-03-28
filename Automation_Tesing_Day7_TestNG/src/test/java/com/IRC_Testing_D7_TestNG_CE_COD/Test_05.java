package com.IRC_Testing_D7_TestNG_CE_COD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

class DoesNotMatchException extends Exception{
	public DoesNotMatchException(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
}
public class Test_05 {
	WebDriver driver;
	String url = "https://www.godaddy.com/en-in";

	@Test(priority = 1,groups = "smoke")
	public void testCase_01() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String expectedTitle = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(url, actualUrl);
	}

	@Test(dependsOnMethods = "testCase_01",groups = "reg")
	public void testCase_02() {
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a"))
				.click();
	}

	@Test(dependsOnMethods = "testCase_02",groups = "reg")
	public void testCase_03() throws DoesNotMatchException {
		String actualDomainTitle = driver.getTitle();
		System.out.println("Domain Search Name Title : " + actualDomainTitle);
		String expectedDomainTitle = "GoDaddy Domain Search - Buy and Register Available Domain Names";
		if (expectedDomainTitle.equals(actualDomainTitle)) {
			WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]"));
			searchBox.isDisplayed();
			searchBox.isEnabled();
			WebElement searchDiv = driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/div[2]"));
			if(searchDiv.getText().equals("Buy It")) {
				System.out.println("Buy It Button Available along with SearchBox");
				searchBox.sendKeys("mydomain");
				driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/div[2]/button")).click();
				System.out.println("Add to Cart Button Displayed : "+driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[2]/div[1]/div[1]/div[2]/div[5]/div/div/div[2]/button")).isDisplayed());
				System.out.println("Domain Name Displayed : "+driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/h2/span")).isDisplayed());
				System.out.println("Price of the Domain Name Displayed : "+driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[2]/div[1]/div[1]/div[2]/div[4]/div[2]/div[2]/span")).isDisplayed());
			}
			else {
				try {
					throw new DoesNotMatchException("Buy It Button Not Available");
				} catch (DoesNotMatchException e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}
			
		} else {
			try {
				throw new DoesNotMatchException("Title Does Not Match");
			} catch (DoesNotMatchException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
	}

	@AfterMethod
	public void afterMethod() {
//		driver.quit();
	}
}
