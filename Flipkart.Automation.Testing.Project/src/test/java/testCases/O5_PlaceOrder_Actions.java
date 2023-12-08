package testCases;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonMethods.CommonFunctions;
import pageObjects.O4_Cart_page_objects;

public class O5_PlaceOrder_Actions extends CommonFunctions {

	@Test
	public void orderPlacement() {
		
		PageFactory.initElements(driver, O4_Cart_page_objects.class);
		
	    driverWait().until(ExpectedConditions.elementToBeClickable(O4_Cart_page_objects.placeOrderButton));
		
		Assert.assertEquals(driver.getTitle(), O4_Cart_page_objects.cartPageTitle);
		
		
		
		O4_Cart_page_objects.placeOrderButton.click();
		
	
	}
	
	
}