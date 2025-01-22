package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Robot_Class {
    public static void main(String args[]) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement ele = driver.findElement(By.id("email"));
        int x = ele.getLocation().getX();
        int y = ele.getLocation().getY();

        Robot robot= new Robot();
        robot.keyPress (KeyEvent.VK_M);
        robot.keyRelease (KeyEvent.VK_N);
        robot.keyPress (KeyEvent. VK_Y);
        robot.keyRelease (KeyEvent.VK_Y);


        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress (KeyEvent.VK_A);
        robot.keyRelease (KeyEvent. VK_CONTROL);
        robot.keyRelease (KeyEvent.VK_A);

        robot.keyPress (KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease (KeyEvent.VK_CONTROL);
        robot.keyRelease (KeyEvent.VK_C);

        robot.keyPress (KeyEvent.VK_TAB);
        robot.keyPress (KeyEvent.VK_CONTROL);
        robot.keyPress (KeyEvent.VK_V);
        robot.keyRelease (KeyEvent.VK_CONTROL);
        robot.keyRelease (KeyEvent.VK_V);

        robot.mouseMove(x,y);
        robot.mouseWheel(2);
    }
}
