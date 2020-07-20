package ScreenPages;

import org.openqa.selenium.support.PageFactory;

import BasePackage.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class chooseproduct extends ScreenBase {

	@AndroidFindBy(xpath = "//android.widget.Image[text='Samsung 163 cm (65 Inches) 4K Ultra HD Smart QLED TV QA65Q60RAKXXL (Black) (2019 Model)']")
	public MobileElement findproduct;

	public chooseproduct(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void selectproduct() {
		findproduct.click();
	}

}
