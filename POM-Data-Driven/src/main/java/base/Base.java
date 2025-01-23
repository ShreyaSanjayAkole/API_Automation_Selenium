package base;

import java.io.FileInputStream;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	
	public Base() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:\\QA Automation\\Testing\\POM-Data-Driven\\src\\main\\java\\config\\config.properties");
			prop.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			driver = new ChromeDriver(); 
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}


}
