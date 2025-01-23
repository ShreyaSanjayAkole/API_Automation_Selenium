package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;
import pages.Home;
import pages.Login;
import pages.SignUp;
import utility.TestUtil;

public class SignUpTest extends Base {
	
	Login loginPage;
	SignUp sg;
	Home homePage;
	TestUtil util;
	
	String sheetName = "signup";
	
	public SignUpTest(){
		super();
		util = new TestUtil();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();	
		sg = new SignUp();
		driver.get(prop.getProperty("url")+"/account/register");
	}
	
	
	@DataProvider
	public Object[][] getSignUpData() {
		Object data[][]=util.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1, dataProvider = "getSignUpData")
	public void SignupTest(String firstName,String lastName, String Email, String Pass) throws InterruptedException{
		sg.Signup(firstName, lastName, Email, Pass);
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
