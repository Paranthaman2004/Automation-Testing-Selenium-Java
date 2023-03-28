package com.IRC_Testing_D7_TestNG_CE_COD;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

class Calculator {
	public static int addition(int a, int b) {
		return a + b;
	}

	public static int subraction(int a, int b) {
		return a - b;
	}

	public static int multiplication(int a, int b) {
		return a * b;
	}
}

public class Task_02 {
	WebDriver driver;

	@Test
	public void addion() {
		int actualResult = Calculator.addition(2, 9);
		int expectResult = 11;
		Assert.assertEquals(actualResult, expectResult);
	}

	@Test
	public void subraction() {
		int actualResult = Calculator.subraction(9, 1);
		int expectResult = 8;
		Assert.assertEquals(actualResult, expectResult);
	}

	@Test
	public void multiplication() {
		int actualResult = Calculator.multiplication(9, 2);
		int expectResult = 18;
		Assert.assertEquals(actualResult, expectResult);
	}

	@Test
	public void division() {
		int actualResult = 9 / 9;
		int expectResult = 1;
		Assert.assertEquals(actualResult, expectResult);
	}

}
