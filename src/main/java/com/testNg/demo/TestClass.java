package com.testNg.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {
	public WebDriver driver= null;
	@BeforeClass
	public void pre() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.guru99.com/introduction-testng-groups.html");
	}

	@Test
	public void test1() {
		System.out.println("test 1 TestClass");
	}
	@Test
	public void test2() {
		System.out.println("test 2 TestClass");
	}
	@Test
	public void test3() {
		System.out.println("test 3 TestClass");
	}
	
	@AfterClass
	public void post() {
		System.out.println("Ater class TestClass");
	}
}
