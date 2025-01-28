package tests;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Base;
import engine.KeyWordEngine;
import listener.TestListener;

@Listeners(TestListener.class)
public class LoginTest extends Base {
	
public KeyWordEngine keyWordEngine;
	
	@Test
	public void loginTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("login");
	}
	

}
