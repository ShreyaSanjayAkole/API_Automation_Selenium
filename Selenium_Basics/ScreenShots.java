package Facebook;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ScreenShots {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://www.facebook.com/r.php?entry_point=login");

			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			
			String currentDir = System.getProperty("user.dir");
            File destFile = new File(currentDir + "/screenshot.png");
            FileUtils.copyFile(srcFile, destFile);
            
		}catch (IOException e) {
            e.printStackTrace();
        }
		
	}
}
