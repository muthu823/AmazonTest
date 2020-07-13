package ScreenPages;

import org.openqa.selenium.support.PageFactory;

import BasePackage.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends ScreenBase 
{
     @AndroidFindBy(id="in.amazon.mShop.android.shopping:id/sign_in_button")
     public MobileElement Loginbutton;
	public LoginPage(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//i used methed chaining so i used return type
	//public LoginPage login ()
	public void login ()
	{
		Loginbutton.click();
		
		//return this;
	}

}
