package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base implements IAUTOCONSTANTS {

	public static WebDriver driver=null;
	
	@BeforeMethod
	public void startBrowser()
	{
		System.setProperty("CHROME_KEY","CHROME_VALUE");
		driver=new ChromeDriver();
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
}
