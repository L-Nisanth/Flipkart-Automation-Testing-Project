package testCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonMethods.CommonFunctions;
import pageObjects.O1_Homepage_objects;

public class O1_Homepage_Actions extends CommonFunctions{
	
	
	
	@Test
	public void iphoneSearch() {
		
		PageFactory.initElements(driver, O1_Homepage_objects.class);
		
		Assert.assertEquals(driver.getTitle(), O1_Homepage_objects.expectedTitle);
		
		O1_Homepage_objects.popupClose.click();
		
		O1_Homepage_objects.searchBox.sendKeys(O1_Homepage_objects.nameOfSmartphone+Keys.ENTER);
		
		
		
	}

}
