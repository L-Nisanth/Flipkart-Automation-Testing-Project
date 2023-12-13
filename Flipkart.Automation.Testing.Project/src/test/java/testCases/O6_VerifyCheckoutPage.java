package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonMethods.CommonFunctions;
import pageObjects.O5_Checkout_objects;

public class O6_VerifyCheckoutPage extends CommonFunctions{
	
	//verifying checkout page
	
	@Test
	public void checkoutPage() {
		Assert.assertEquals(driver.getTitle(), O5_Checkout_objects.checkoutPageTitle);
	}
	

}
