package base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;

	@BeforeMethod
	public void setup() throws IOException {
		if (driver == null) {
			FileReader fr = new FileReader(
					"C:\\Users\\Navjot\\Navjot-workspace\\Automationframework\\TestAutomationFramework\\src\\test\\resources\\configFiles\\config.properties");
			prop.load(fr);

		}

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
			driver.manage().window().maximize();
		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));
			driver.manage().window().maximize();
		}
	}

	@AfterMethod
	public void teardown() {
		
		driver.close();
		System.out.println("Browser is closed");
	}

}
