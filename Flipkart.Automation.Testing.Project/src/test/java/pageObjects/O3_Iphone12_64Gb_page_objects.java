package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class O3_Iphone12_64Gb_page_objects {
	
	@FindBy(id = "pincodeInputId")
	public static WebElement pinCodeElement;

	@FindBy(xpath = "//button[text()='Add to cart'][@class='_2KpZ6l _2U9uOA _3v1-ww']" )
	public static WebElement addToCartButton;
	
	public static String pinNumber = "110010";
	
	public static String Iphone12_64gb_PageTitle = "APPLE iPhone 12 ( 64 GB GB Storage, 0 GB RAM ) Online at Best Price On Flipkart.com";
	
}
