package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import action.*;
import base.BaseClass;

public class SignInPage extends BaseClass {

	@FindBy(id = "ap_email")
	WebElement emailbtn;

	@FindBy(id = "continue")
	WebElement continueBtn;

	public SignInPage( ) {
		PageFactory.initElements(driver, this);
	}



	public SignInPage1 clickSignin(String email) {
		ActionClass.type(emailbtn, email);
		ActionClass.click(driver, continueBtn);
		return new SignInPage1();

	}

}
