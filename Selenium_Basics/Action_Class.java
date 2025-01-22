package Facebook;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {
    public static WebDriver driver = new ChromeDriver();

    @Test
    public void Using_contextClick_Method() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
        Actions actions = new Actions(driver);
        actions.moveToElement (pass).perform();
        Thread.sleep(2000);
        actions.contextClick(pass).perform();
        Thread.sleep(2000);
    }

    @Test
    public void Using_DragAndDrop_Method() throws InterruptedException {
        driver.get("https://jqueryui.com/droppable");
        driver.switchTo().frame(0);
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement des = driver.findElement(By.xpath("//p[text()='Drop here']"));
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(src, des).perform();
        actions.moveToElement(src).clickAndHold().perform();
        actions.release(des).perform();
    }

    @Test
    public void Using_DoubleClick_Method() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        Actions actions = new Actions(driver);
        WebElement MobNum = driver.findElement(By.id("email"));
        WebElement Pass = driver.findElement(By.name("pass"));
        actions.doubleClick(Pass).perform();
        Thread.sleep(2000);
        actions.doubleClick(MobNum).perform();
        Thread.sleep(2000);
        driver.close();
    }

}
