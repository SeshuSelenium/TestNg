package com.testNg.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo {
	
	@BeforeSuite
	public void bSuite() {
		System.out.println("b suite");
	}
	@BeforeTest
	public void bTest() {
		System.out.println("b Test");
	}
	@BeforeClass
	public void bClass() {
		System.out.println("b Class");
	}
	@BeforeMethod
	public void bMethod() {
		System.out.println("b Method");
	}
	@Test
	public void test() {
		System.out.println("test");
	}
	@AfterMethod
	public void aMethod() {
		System.out.println("a method");
	}
	@AfterClass
	public void aClass() {
		System.out.println("a class");
	}
	@AfterTest
	public void aTest() {
		System.out.println("a test");
	}
	@AfterSuite
	public void aSuite() {
		System.out.println("a suite");
	}
	

}
