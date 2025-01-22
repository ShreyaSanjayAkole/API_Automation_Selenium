package Facebook;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class popup {
    WebDriver driver = new ChromeDriver();
    @Test
    public void alert_popup() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        driver.findElement(By.xpath("//button[text()='Alert']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.accept();

    }

    @Test
    public void confirmation_popup() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        driver.findElement(By.xpath("//label[text()='On button click, confirm box will appear']/following-sibling::button")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.dismiss();
    }

    @Test
    public void prompt_popup() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        driver.findElement(By.xpath("//label[text()='On button click, prompt box will appear']/following-sibling::button")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.sendKeys("Shreya");
        Thread.sleep(2000);
        alert.accept();
        System.out.println("Prompt accepted and text entered.");
    }

    @Test
    public void FileUpload_popup() throws Exception {
        driver.get("https://smallpdf.com/pdf-converter");
        driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("E:\\QA Automation\\Testing\\FileUpload_popup.exe");
        Thread.sleep(2000);
    }

    @Test
    public void FileDownload_popup() throws InterruptedException {
        String downloadFilePath = "E:\\";

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadFilePath);
        prefs.put("download.prompt_for_download", false);
        prefs.put("download.directory_upgrade", true);
        prefs.put("plugins.always_open_pdf_externally", true);
        prefs.put("profile.default_content_settings.popups", 0);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.browserstack.com/test-on-the-right-mobile-devices");

        driver.findElement(By.linkText("CSV")).click();
        driver.findElement(By.xpath("//span[text()='Verify you are human']")).click();
        Thread.sleep(3000);

    }
}
