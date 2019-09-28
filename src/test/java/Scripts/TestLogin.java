package Scripts;

import org.testng.annotations.Test;

import Generic.Base;
import Pages.LoginPage;

public class TestLogin extends Base {

	@Test
	public void enterLogindtls(String Usrname, String passwrd) {
		LoginPage lp = new LoginPage();
		lp.login();
		lp.loginDtls("admin", "manager");

	}

}
