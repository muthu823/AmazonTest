package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class CommonUtils 
{

	public static AppiumDriver<MobileElement> driver;

	public static DesiredCapabilities cap = new DesiredCapabilities();
	public static String PLATFORM_NAME;
	public static String PLATFORM_VERSION;
	public static String DEVICE_NAME;
	public static String UDID;
	public static String BASE_PKG;
	public static String APP_ACTIVITY;
	public static String serverUrl;
	public static URL url;
	public static Properties properties =new Properties();
	public static FileInputStream file;
	public static int ImplicitWait;



	public static void loadpropery(String loadpropertyfile)
	{

		try 
		{
			file = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Properties/"+loadpropertyfile);
		} catch (FileNotFoundException e) 
		{

			e.printStackTrace();
		}

		try {
			properties.load(file);
		}
		catch (IOException e) 
		{

			e.printStackTrace();
		}

		//ImplicitWait=Integer.parseInt( properties.getProperty("implicit.wait"));
		BASE_PKG=properties.getProperty("base.pgk");
		APP_ACTIVITY=properties.getProperty("application.activity");
		PLATFORM_NAME=properties.getProperty("platform.name");
		PLATFORM_VERSION=properties.getProperty("platform.version");
		DEVICE_NAME=properties.getProperty("device.name");
		UDID=properties.getProperty("MobileID");
		serverUrl=properties.getProperty("URL");
		

	}

	public static void appload()
	{
		try 
		{
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_NAME);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME,DEVICE_NAME);
			cap.setCapability(MobileCapabilityType.UDID,UDID);//192.168.0.100:5555
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, BASE_PKG);
			cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY);
		}
		catch(Exception e) 
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static AppiumDriver<MobileElement> getAndroidDriver() 
	{

		try {

			url=new URL(serverUrl);
		}
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver =new AndroidDriver<MobileElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		return driver;

	}


}
