package ScreenPages;

import org.openqa.selenium.support.PageFactory;

import BasePackage.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BuyProduct extends ScreenBase {

	@AndroidFindBy(id = "a-autoid-1")
	public MobileElement bringproduct;
	@AndroidFindBy(xpath = "//*[text='rupees 1,59,599']")
	public MobileElement price;

	public BuyProduct(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void priceproduct() {
		price.getText();

	}

	public void buyclickproduct() {

		bringproduct.click();
	}

}
