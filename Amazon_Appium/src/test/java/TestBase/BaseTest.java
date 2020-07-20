package TestBase;

import Utilities.AppiumServer;
import Utilities.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseTest {
	public AppiumDriver<MobileElement> driver;
	public static String loadpropertyfile = "Amazon.Properties";

	public void setup() {
		if (driver == null) {
			if (loadpropertyfile.startsWith("Amazon"))

				AppiumServer.start();
			AppiumServer.stop();

			CommonUtils.loadpropery(loadpropertyfile);
			CommonUtils.appload();
			driver = CommonUtils.getAndroidDriver();

		}
	}

	public void quit() {
		
		 driver.quit();
		AppiumServer.stop();
	}

}
