package LearnTestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoA {

	@Test(invocationCount=3)
	public void method1()
	{
		System.out.println("I am method no1 and will run 3 times");
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		System.out.println("I am getdata method and I provide data");
		Object[][]data=new Object[2][2];
		data[0][0]="admin";
		data[0][1]="password";
		data[1][0]="admin1";
		data[1][1]="password1";
		return data;
	}
	@Test
	public void method3()
	{
		Assert.fail("I am method no3 and I will Fail!");
	}
	@Test(dependsOnMethods="method3")
	public void method4()
	{
		System.out.println("I am method no2 but I will run first");
	}
	@Test(dataProvider="getdata",priority=0)
	
	public void method5(String usr,String pwd)
	{
		System.out.println("User= "+usr);
		System.out.println("password= "+pwd);
	}
}