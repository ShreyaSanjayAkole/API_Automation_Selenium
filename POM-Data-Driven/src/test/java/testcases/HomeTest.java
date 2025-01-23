package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.Home;
import pages.Login;
import pages.Ring;


public class HomeTest extends Base {
	Login loginPage;
	Home homePage;
	Ring ring;
	
	public HomeTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		loginPage = new Login();
		homePage=new Home();
	}
	
//	@Test(priority=1)
//	public void verifyTitleTest(){
//		String homePageTitle = homePage.verifyHomePageTitle();
//		Assert.assertEquals(homePageTitle, "Silver Streak | Shop Handcrafted Silver Jewellery – Silver Streak Store");
//	}
//	
//	@Test(priority=2)
//	public void crmLogoImageTest(){
//		boolean flag = homePage.verifySiteLogo();
//		Assert.assertTrue(flag);
//	}
	
	@Test(priority=1)
	public void RingLinkTest() {
		ring = homePage.clickOnRingLink();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}