package ScreenPages;

import org.openqa.selenium.support.PageFactory;

import BasePackage.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchProduct extends ScreenBase {
	@AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/rs_search_src_text")
	public MobileElement Searchtxt;
	@AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/iss_search_dropdown_item_text_layout")
	public MobileElement Searchtxtclick;

	public SearchProduct(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void searchitem() {
		Searchtxt.sendKeys("65-inch TV");
		// return this;
	}

	public void searchitemclick() {
		Searchtxtclick.click();
		// return this;
	}

}
