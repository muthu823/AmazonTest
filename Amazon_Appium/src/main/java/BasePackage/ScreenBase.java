package BasePackage;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class ScreenBase
{
	public static AppiumDriver<MobileElement> driver;
	public WebDriver wait;
	
	public ScreenBase(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
	}
	public void hidekeyboard()
	{
		driver.hideKeyboard();
	}
	
	public void enter()
	{
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
	}

}
