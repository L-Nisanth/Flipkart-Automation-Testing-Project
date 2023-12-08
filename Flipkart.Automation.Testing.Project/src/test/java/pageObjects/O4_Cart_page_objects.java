package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class O4_Cart_page_objects {
           
	@FindBy(xpath = "//span[text()='Place Order']" )
	public static WebElement placeOrderButton;
	
	public static String cartPageTitle = "Shopping Cart | Flipkart.com";
	
	  
	   
	   
	
	
}
