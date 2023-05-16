package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import action.ActionClass;
import base.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath= "//*[@id=\'nav-logo-sprites\']")
	WebElement Amazonlogo;
	
	public HomePage( ) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void verifyLogo() {
		String actualtext= ActionClass.getText(Amazonlogo);
		String expectedText="amazon.in";
		Assert.assertEquals(actualtext, expectedText, "incorrect Logo");
	}
}
