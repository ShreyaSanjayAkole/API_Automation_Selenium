package Facebook;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivers {
    public WebDriver driver;

    @Test
    public void webdriver(){
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.getTitle();

        String pagesource = driver.getPageSource();
        System.out.println("Page source: "+pagesource);

        System.out.println("Current url: "+driver.getCurrentUrl());

        System.out.println("window handle: "+driver.getWindowHandle());

        System.out.println("window handles: "+driver.getWindowHandles());

        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.switchTo().window(driver.getWindowHandle());
        System.out.println("Switched to the original window.");

        driver.manage().window().maximize();

        driver.close();
        System.out.println("Current window closed.");

	    driver.quit();
        System.out.println("Browser session ended.");
    }
}
