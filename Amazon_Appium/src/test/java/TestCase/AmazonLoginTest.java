package TestCase;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ScreenPages.BuyProduct;
import ScreenPages.LoginPage;
import ScreenPages.SearchProduct;
import ScreenPages.SelectLanguage;
import ScreenPages.chooseproduct;
import TestBase.BaseTest;
import Utilities.ScrollUtil;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AmazonLoginTest extends BaseTest {
	SelectLanguage language;
	LoginPage login;
	SearchProduct product;
	chooseproduct select;
	BuyProduct buyproduct;

	@BeforeTest
	public void appstart() {
		setup();
		language = new SelectLanguage(driver);
		login = new LoginPage(driver);
		product = new SearchProduct(driver);
		select = new chooseproduct(driver);
	}

	@Test(priority = 1)
	public void amazonstart() {
		// language.language(0);
		language.language();
		System.out.println("First test");

	}

	@Test(priority = 2)
	public void clicklogin() {

		login.login();
	}

	@Test(priority = 3)
	public void searchproduct() {

		product.searchitem();

	}

	@Test(priority = 4)
	public void searchproductclick() throws InterruptedException {

		product.searchitemclick();
		Thread.sleep(5000);
		ScrollUtil.scrollUp(2, driver);
	}

	@Test(priority = 5)
	public void chooseproductclick() throws InterruptedException {

		select.selectproduct();

	}

	@Test(priority = 6)
	public void productprice() throws InterruptedException {

		Assert.assertEquals("buyproduct.priceproduct()", "159599");

	}

	@Test(priority = 7)
	public void buyproductclick() throws InterruptedException {

		Thread.sleep(5000);
		ScrollUtil.scrollUp(2, driver);
		buyproduct.buyclickproduct();

	}

	@AfterTest
	public void appquit() throws InterruptedException

	{

		quit();
	}
}
