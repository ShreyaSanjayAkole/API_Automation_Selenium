package Facebook;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public WebDriver driver;

@Test
	public void login() {
		try {
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");

			Thread.sleep(2000);

			driver.findElement(By.id("email")).sendKeys("shreya@gamil.com");
			Thread.sleep(2000);

			driver.findElement(By.name("pass")).sendKeys("shreya");
			Thread.sleep(2000);
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
			driver.close();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void CreateAccount() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.findElement(By.name("firstname")).sendKeys("shreya");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Akole");
		Thread.sleep(2000);
		driver.findElement(By.id("day")).sendKeys("8");
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("May");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("2001");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("shreya@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("shreya123");
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Already have an account?")).click();



	}
}


