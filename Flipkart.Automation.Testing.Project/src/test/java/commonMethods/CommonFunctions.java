package commonMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	 
	public static WebDriver driver;
    
	public WebDriverWait driverWait() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		return w;
	
	}
	
	public static Properties propertyFileLoading() throws IOException {
		FileInputStream file = new FileInputStream("configuration.properties");
		Properties config = new Properties();
		config.load(file);
        
		return config;
		

	}

	@BeforeSuite
	public void launchBrowser() throws IOException {
	
		String Testurl = propertyFileLoading().getProperty("url");
		String Testbrowser = propertyFileLoading().getProperty("browser");
		
		if(Testbrowser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(Testbrowser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(Testurl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}
	
	
	

}
