package testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonMethods.CommonFunctions;
import pageObjects.O3_Iphone12_64Gb_page_objects;

public class O4_AddToCart_Actions extends CommonFunctions{
    
	@Test
	public void clickAddToCart() {

		PageFactory.initElements(driver, O3_Iphone12_64Gb_page_objects.class);

		Set<String> s = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(s);
		driver.switchTo().window(handles.get(1));
		
		Assert.assertEquals(driver.getTitle(), O3_Iphone12_64Gb_page_objects.Iphone12_64gb_PageTitle);
		
		O3_Iphone12_64Gb_page_objects.pinCodeElement.sendKeys(O3_Iphone12_64Gb_page_objects.pinNumber+Keys.ENTER);
		O3_Iphone12_64Gb_page_objects.addToCartButton.click();
		

	}

}
