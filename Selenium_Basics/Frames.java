package Facebook;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static WebDriver driver = new ChromeDriver();
    @Test
    public void Frames_Function() throws InterruptedException {
        driver.get("E:/QA Automation/Testing/Selenium_framework/src/test/java/Facebook/Page2.html");
        driver.switchTo().frame(0);
        driver.findElement(By.id("t1")).sendKeys("Shreya");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("Akole");
        Thread.sleep(2000);
    }
}
