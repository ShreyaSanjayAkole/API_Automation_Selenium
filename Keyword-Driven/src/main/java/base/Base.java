package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public static Logger log = Logger.getLogger(Base.class);
	
	
	public WebDriver init_driver(String browserName){
		log.info("Browser name: "+browserName);
		
		if(browserName.equals("chrome")){
			if(prop.getProperty("headless").equals("yes")){
				//headless mode:
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				driver = new ChromeDriver(options);
			}else{
				driver = new ChromeDriver();
			}
		} 
		return driver;
	}
	
	public  Properties init_properties(){
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("E:\\QA Automation\\Testing\\POM-Keyword-Driven\\src\\main\\java\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

}
