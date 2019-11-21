package com.testNg.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuite {
	public WebDriver driver=null;
	@BeforeSuite
	public void pre() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.guru99.com/introduction-testng-groups.html");
	}

	@Test
	public void test1() {
		System.out.println("TestSuite test 1");
	}
	@Test
	public void test2() {
		System.out.println("TestSuite test 2");
	}
	@Test
	public void test3() {
		System.out.println("TestSuite test 3");
	}
	
	@AfterSuite
	public void post() {
		System.out.println("TestSuite Ater Suite");
	}
}
