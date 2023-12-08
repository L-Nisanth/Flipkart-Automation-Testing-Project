package pageObjects;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class O2_Iphone12_listing_page_objects {
	 
	  @FindAll({@FindBy(xpath = "//div[@class='_4rR01T']" ) } )
	  public static List<WebElement> iphoneList;
	
      @FindAll({@FindBy(xpath = "//div[@class='_30jeq3 _1_WHN1']" )} )
	  public static List<WebElement> iphonePriceList;
	  
	  @FindBy(xpath = "//div[@class='_4rR01T'][text()='APPLE iPhone 12 (Blue, 64 GB)']")
	  public static WebElement iphone_12_64gb;
	  
	  public static String listingPageTitle = "Iphone 12- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
}
