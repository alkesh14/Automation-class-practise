package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_annotation {

	@BeforeSuite
	public void a() {
		System.out.println("before suite");

	}

	@BeforeTest
	public void d() {
		System.out.println("before test");
	}

	@BeforeClass
	public void e() {
		System.out.println("beforeclass");
	}

	@BeforeGroups
	public void f() {
		System.out.println("BeforeGroup");
	}

	@BeforeMethod
	public void g() {
		System.out.println("BeforeMethod");
	}

	@Test
	public void b() {
		System.out.println("Testmethod");
	}

	@AfterMethod
	public void v() {
		System.out.println("Aftermethod");
	}


	

	@AfterGroups
	public void w() {
		System.out.println("Aftergroup");
	}

	@AfterClass
	public void y() {
		System.out.println("Afterclass");
	}

	@AfterTest
	public void z() {
		System.out.println("After test");
	}

	@AfterSuite
	public void c() {
		System.out.println("after suite");
	}

	

}
