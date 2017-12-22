package act.com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

abstract public class BaseTest implements AutoConst
{
	public static WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		//System.setProperty(GECKO_KEY,GECKO_VALUE);
		driver=new ChromeDriver();
		///driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Reporter.log("hhhhhh",true);
		driver.get("https://demo.actitime.com/login.do");
		Reporter.log("hhhhhh",true);
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
	
	

}
