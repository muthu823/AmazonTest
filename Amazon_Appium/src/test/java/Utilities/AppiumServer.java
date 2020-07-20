package Utilities;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumServer {

	public static AppiumDriverLocalService service;

	public static void start() {

		// starting the Appium server code

		service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe")).withAppiumJS(new File(
						"C:\\Users\\Lakshmi\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")));
		service.start();

	}

	public static void stop() {

		service.stop();

	}

}
