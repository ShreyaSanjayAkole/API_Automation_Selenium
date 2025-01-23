package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;

import pages.Home;

import pages.Login;
import utility.TestUtil;


public class LoginTest extends Base {
	Login loginPage;
	Home homePage;
	TestUtil util;
	
	String sheetName = "login";
	
	public LoginTest(){
		super();
		util = new TestUtil();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new Login();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Silver Streak | Shop Handcrafted Silver Jewellery – Silver Streak Store");
	}
	
	@DataProvider
	public Object[][] getloginData() {
		Object data[][]=util.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=2,dataProvider = "getloginData")
	public void loginTest(String username,String pass) throws InterruptedException{
		loginPage.login(username, pass);
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
