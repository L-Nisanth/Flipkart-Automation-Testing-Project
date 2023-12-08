package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class O1_Homepage_objects {
   
	
	
	@FindBy(name = "q" )
	public static WebElement searchBox;
	
	@FindBy(xpath = "//span[@role='button']" )
	public static WebElement popupClose;
	
    public static String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	
    public static String nameOfSmartphone = "iphone 12";
	
}
