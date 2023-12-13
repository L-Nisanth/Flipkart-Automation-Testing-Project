package testCases;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonMethods.CommonFunctions;
import pageObjects.O2_Iphone12_listing_page_objects;

public class O2_WebScraping_Actions extends CommonFunctions{
     
	// verifying title of the page
	// *****extracting products name and price data and saving it in excel file(src/test/resources.webScrapingData.xlsx ******
	

	@Test
	public void exportDataToExcel() throws IOException {

		PageFactory.initElements(driver, O2_Iphone12_listing_page_objects.class);
		Assert.assertEquals(driver.getTitle(), O2_Iphone12_listing_page_objects.listingPageTitle);

		XSSFWorkbook wBook = new XSSFWorkbook();
		XSSFSheet sheet = wBook.createSheet("Sheet1");

		Row firstRow = sheet.createRow(0);
		Cell firstCell = firstRow.createCell(0);
		Cell secondCell = firstRow.createCell(1);

		firstCell.setCellValue("MODEL");
		secondCell.setCellValue("PRICE");

		for (int i = 0; i < O2_Iphone12_listing_page_objects.iphoneList.size(); i++) {

			Row row = sheet.createRow(i + 1);
			Cell c0 = row.createCell(0);
			Cell c1 = row.createCell(1);

			c0.setCellValue(O2_Iphone12_listing_page_objects.iphoneList.get(i).getText());
			c1.setCellValue(O2_Iphone12_listing_page_objects.iphonePriceList.get(i).getText());
		}

		File f = new File(".\\src\\test\\resources\\webScrapingData.xlsx");
		FileOutputStream output = new FileOutputStream(f);

		wBook.write(output);
		output.close();
		wBook.close();

	}

}
