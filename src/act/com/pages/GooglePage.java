package act.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import act.com.generic.BasePage;

public class GooglePage extends BasePage
{
	@FindBy(xpath="(//a[.='Gmail'])[1]")
	private WebElement gmailbtn;
	
	public GooglePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnGmail()
	{
		gmailbtn.click();
	}
	
	public void verifyPageTitle(String title)
	{
		verifyTitle(title);
	}
}
