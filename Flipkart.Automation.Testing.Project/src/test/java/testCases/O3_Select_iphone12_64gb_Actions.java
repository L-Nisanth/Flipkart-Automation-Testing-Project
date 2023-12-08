package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonMethods.CommonFunctions;
import pageObjects.O2_Iphone12_listing_page_objects;

public class O3_Select_iphone12_64gb_Actions extends CommonFunctions {

	@Test
	public void chooseIphone12_64Gb() throws InterruptedException {

		PageFactory.initElements(driver, O2_Iphone12_listing_page_objects.class);

		O2_Iphone12_listing_page_objects.iphone_12_64gb.click();
        
		
	}
}
