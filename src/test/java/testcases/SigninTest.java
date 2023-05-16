package testcases;
import PageObjects.*;

import org.testng.annotations.Test;

import base.BaseClass;

public class SigninTest extends BaseClass {
	

	
	
	
	@Test
	public void Login() {
		SignInPage signIn= new SignInPage();
		SignInPage1 signIn1= signIn.clickSignin(prop.getProperty("email"));
		HomePage homePage=signIn1.clickSignin1(prop.getProperty("password"));
		homePage.verifyLogo();
	
	}

}
