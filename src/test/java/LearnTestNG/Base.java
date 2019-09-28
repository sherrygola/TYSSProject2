package LearnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {

	@BeforeSuite
	public void beforeSuit()
	{
	System.out.println("I am the first-BeforeSuite");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("I run before test-BeforeTEst");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("I run before class-BeforeCLass");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("I run afterclass-AfterCLASS");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("I run before methods-BEFORE METHOD");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("I run after methods- AFTER METHOD");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("I will run after Test -AFTER TEST");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("I am the last-AfterSuite");
	}
	
}
