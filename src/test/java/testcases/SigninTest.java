package testcases;
import PageObjects.*;

import org.testng.annotations.Test;

import base.BaseClass;

public class SigninTest extends BaseClass {
	

	
	
	
	@Test
	public void Login() {
		SignInPage signin= new SignInPage();
		SignInPage1 signin1= signin.clickSignin(prop.getProperty("email"));
		HomePage homePage=signin1.clickSignin1(prop.getProperty("password"));
		homePage.verifyLogo();
	
	}

}
