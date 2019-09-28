package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic.Base;

public class LoginPage extends Base {

	@FindBy (name="username") private WebElement username;
	@FindBy private WebElement password;
	@FindBy private WebElement Loginbtn;
	@FindBy private WebElement Errormsg;
	
	public void login()
	{
		username=driver.findElement(By.name("username"));
		password=driver.findElement(By.name("pwd"));
		Loginbtn=driver.findElement(By.id("loginButton"));
		Errormsg=driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
		
	}
	
	public void loginDtls(String usrname,String pwd)
	{
		username.sendKeys(usrname);
		password.sendKeys(pwd);
		Loginbtn.click();
		
	}
	
}
