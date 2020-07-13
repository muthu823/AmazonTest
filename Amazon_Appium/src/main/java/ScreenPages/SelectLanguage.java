package ScreenPages;



import java.util.List;

import org.openqa.selenium.support.PageFactory;

import BasePackage.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelectLanguage extends ScreenBase
{

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.GridLayout/android.widget.ImageView[1]")
	public MobileElement English;
	
	//@AndroidFindBy(className ="android.widget.GridLayout")
	//public List<AndroidElement> English;
	
	
	public SelectLanguage(AppiumDriver<MobileElement> driver)
	{
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
//	public void language()
//	{
//		//English.click();
//		
//	}
	
	//public void language(int languagecount)
	
	//i used methed chaining so i used return type 
	//public LoginPage language()
	public void language()
	{
		English.click();
		//English.get(0).click();	
		
		//return new LoginPage(driver);
		
//		for(int i=0;i<=languagecount;i++)
//		{
//			if(i==0)
//			{
//			English.get(i).click();
//			break;
//			}
//		}
	}

}
