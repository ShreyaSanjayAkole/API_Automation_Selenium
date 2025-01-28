package engine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Base;


public class KeyWordEngine extends Base {
	
	public WebDriver driver;
	public Properties prop;

	public static Workbook book;
	public static Sheet sheet;

	public Base base;
	public WebElement element;

	public final String SCENARIO_SHEET_PATH = "E:\\QA Automation\\Testing\\POM-Keyword-Driven\\src\\main\\java\\scenarios\\silverstreakstore.xlsx";

	public void startExecution(String sheetName) {

		FileInputStream file = null;
		try {
			file = new FileInputStream(SCENARIO_SHEET_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			book = WorkbookFactory.create(file);
		} catch (Exception e) {
			e.printStackTrace();
		} 

		sheet = book.getSheet(sheetName);
		int k = 0;
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			try {

					String locatorType = sheet.getRow(i + 1).getCell(k + 1).toString().trim();
					String locatorValue = sheet.getRow(i + 1).getCell(k + 2).toString().trim();
					String action = sheet.getRow(i + 1).getCell(k + 3).toString().trim();
					String value = sheet.getRow(i + 1).getCell(k + 4).toString().trim();
				
					switch (action) {
					case "open browser":
						log.info("open the browser");
						base = new Base();
						prop = base.init_properties();
						if (value.isEmpty() || value.equals("NA")) {
							driver = base.init_driver(prop.getProperty("browser"));
						} else {
							driver = base.init_driver(value);
						}
						break;
	
					case "enter url":
						if (value.isEmpty() || value.equals("NA")) {
							driver.get(prop.getProperty("url"));
						} else {
							driver.get(value);
						}
						break;
	
					case "quit":
						driver.quit();
						break;
					default:
						break;
					}
	
					switch (locatorType) {
					case "id":
						element = driver.findElement(By.id(locatorValue));
						if (action.equalsIgnoreCase("sendkeys")) {
							element.clear();
							element.sendKeys(value);
						} else if (action.equalsIgnoreCase("click")) {
							element.click();
						} else if (action.equalsIgnoreCase("isDisplayed")) {
							element.isDisplayed();
						} else if (action.equalsIgnoreCase("getText")) {
							String elementText = element.getText();
							System.out.println("text from element : " + elementText);
						}
						locatorType = null;
						break;
	
					case "name":
						element = driver.findElement(By.name(locatorValue));
						if (action.equalsIgnoreCase("sendkeys")) {
							element.clear();
							element.sendKeys(value);
						} else if (action.equalsIgnoreCase("click")) {
							element.click();
						} else if (action.equalsIgnoreCase("isDisplayed")) {
							element.isDisplayed();
						} else if (action.equalsIgnoreCase("getText")) {
							String elementText = element.getText();
							System.out.println("text from element : " + elementText);
						}
						locatorType = null;
						break;
	
					case "xpath":
						element = driver.findElement(By.xpath(locatorValue));
						if (action.equalsIgnoreCase("sendkeys")) {
							element.clear();
							element.sendKeys(value);
						} else if (action.equalsIgnoreCase("click")) {
							element.click();
						} else if (action.equalsIgnoreCase("isDisplayed")) {
							element.isDisplayed();
						} else if (action.equalsIgnoreCase("getText")) {
							String elementText = element.getText();
							System.out.println("text from element : " + elementText);
						}
						locatorType = null;
						break;
	
					default:
						break;
					}

			} catch (Exception e) {

			}

		}

	}

}
