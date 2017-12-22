package act.com.generic;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyTitle(String title)
	{
		WebDriverWait w=new WebDriverWait(driver,5);
		try
		{
		  w.until(ExpectedConditions.titleIs(title));
		  Reporter.log("Title matching",true);
		}
		catch(Exception e)
		{
			 Reporter.log("Title not matching",true);
			 Assert.fail();
		}	
	}
	public void verifyElements(WebElement element)
	{
		WebDriverWait w=new WebDriverWait(driver,5);
		try
		{
		  w.until(ExpectedConditions.visibilityOf(element));
		  Reporter.log("Element is matching",true);
		}
		catch(Exception e)
		{
			 Reporter.log("Title not matching",true);
			 Assert.fail();
		}	
	}

}
