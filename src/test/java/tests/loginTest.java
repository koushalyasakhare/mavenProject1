package tests;

import java.io.FileNotFoundException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.PropReader;

public class loginTest extends BaseTest {

	public LoginPage lp;
	
	public  void initObject() {
			
			lp= new LoginPage(driver);
		
	}
	
	@BeforeClass
	public void init() {
		
		//launching
		
		
		//step-5 creating objects
		initObject();
		
		
		
	}
	
	@Test
	public void login() throws FileNotFoundException, InterruptedException
	{
		lp.enterCred(PropReader.readProperties("user"), PropReader.readProperties("pass"));
		System.out.println("user name & password entered successfully");

	
	
	lp.LoginClick();
	Thread.sleep(3000);
	System.out.println("successfully clicked on button");
	
}
}


	

