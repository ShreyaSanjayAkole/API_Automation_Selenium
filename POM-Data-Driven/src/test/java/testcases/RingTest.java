package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.Home;
import pages.Login;
import pages.Ring;


public class RingTest extends Base {
	
	Login loginPage;
	Home homePage;
	Ring ring;
	
	public RingTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		loginPage = new Login();
		homePage = new Home();
		ring = new Ring();
		homePage.clickOnRingLink();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(8,1000)");
        Thread.sleep(2000);
	}
	
	@Test
	public void selectRing() throws InterruptedException {
		Thread.sleep(2000);
		ring.SelectRing();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
