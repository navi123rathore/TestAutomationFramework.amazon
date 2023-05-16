package action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseClass;

public class ActionClass extends BaseClass{
	
	public static void click( WebDriver driver,WebElement elem) {

		Actions act = new Actions(driver);
		act.moveToElement(elem).click().build().perform();

	}
	public static void type(WebElement elem, String text) {
			//elem.clear();
			elem.sendKeys(text);
		
	}
	public static String getText(WebElement elem) {
		return elem.getText();
		
		// TODO Auto-generated method stub
		
	}
}
