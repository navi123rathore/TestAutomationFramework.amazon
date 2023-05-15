package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import action.*;
import base.BaseClass;

public class SignInPage1 extends BaseClass  {
	
	@FindBy(id = "ap_password")
	WebElement pswd;

	@FindBy(id = "signInSubmit")
	WebElement signInSubmit;
	
	public SignInPage1( ) {
		PageFactory.initElements(driver, this);
	}



	public HomePage clickSignin1(String password) {
		ActionClass.type(pswd, password);
		ActionClass.click(driver, signInSubmit);
		return new HomePage();
		

	}


}
