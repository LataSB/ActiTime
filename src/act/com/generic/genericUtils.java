package act.com.generic;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class genericUtils 
{
	public void selectByIndex(WebElement element, int i)
	{
		Select sel=new Select(element);
		sel.selectByIndex(i);			
	}
	public void selectByValue(WebElement element, String v)
	{
		Select sel=new Select(element);
		sel.selectByValue(v);			
	}
	public void dropDownMenu(WebDriver driver, WebElement element, WebElement link)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).click(link).perform();
	}
	public void compositeAction(WebDriver driver, WebElement element, WebElement link)
	{
		Actions act=new Actions(driver);
	    act.sendKeys(Keys.CONTROL).click(link);    
	}
	
	public void contextClick(WebDriver driver,WebElement element, String text) throws AWTException
	{
		Actions act=new Actions(driver);
		act.contextClick().perform();
		Robot r=new Robot();
		/*r.keyPress(Keys.CONTROL.VK_T);
		r.keyRelease(Keys.CONTROL.VK_T);
		*/	
	}

}
