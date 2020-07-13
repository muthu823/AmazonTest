package TestCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ScreenPages.LoginPage;
import ScreenPages.SelectLanguage;
import TestBase.BaseTest;

public class AmazonLoginTest extends BaseTest
{
	SelectLanguage language;
	LoginPage login;
	

	@BeforeTest
	public void appstart()
	{
		setup();
		language=new SelectLanguage(driver);
		login=new LoginPage(driver);
	}
	
	@Test(priority = 1)
	public void amazonstart()
	{
		//language.language(0);
		language.language();
		System.out.println("First test");
		
	}
	
	@Test(priority = 2)
	public void clicklogin()
	{
		System.out.println("Testes method chaning");
		login.login();
	}
	
	
	@BeforeTest
	public void appquit()
	{
		//quit();
	}
}
