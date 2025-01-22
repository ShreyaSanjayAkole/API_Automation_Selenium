package Facebook;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutors {
    public static WebDriver driver = new ChromeDriver();
    public static void main(String args[]) throws InterruptedException {

        driver.get("E:/QA Automation/Testing/Selenium_framework/src/test/java/Facebook/jsExecutor.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript( "document.getElementById('t1').value='Shreya Akole'");
        Thread.sleep(2000);
        js.executeScript( "document.getElementById('t2').value=''");
        Thread.sleep(2000);
        js.executeScript( "document.getElementById('t2').value='QA Engineer'");
        Thread.sleep(2000);
        js.executeScript ("document.getElementById('t2').type='button'");
    }
    @Test
    public void ScrollUp_Function_And_MoveToElement() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(8,1000)");
        Thread.sleep(5000);
        jse.executeScript("window.scrollBy (0,-1000)");
        Thread.sleep(5000);
    }
}
