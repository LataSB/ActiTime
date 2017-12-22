package act.com.tests;

import org.testng.annotations.Test;

import act.com.generic.BaseTest;
import act.com.pages.GooglePage;

public class verifyPageTitleTest extends BaseTest
{
	@Test
	public void testVerifyPageTitle()
	{
		GooglePage g=new GooglePage(driver);
		g.verifyTitle("actiTIME Maintenance");	
	}

}
