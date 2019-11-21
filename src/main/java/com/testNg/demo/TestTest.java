package com.testNg.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTest {
	public WebDriver driver=null;
	@BeforeTest
	public void pre() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.guru99.com/introduction-testng-groups.html");
	}

	@Test
	public void test1() {
		System.out.println("test 1 TestTest");
	}
	@Test
	public void test2() {
		System.out.println("test 2 TestTest");
	}
	@Test
	public void test3() {
		System.out.println("test 3 TestTest");
	}
	
	@AfterTest
	public void post() {
		System.out.println("Ater test TestTest");
	}
}
