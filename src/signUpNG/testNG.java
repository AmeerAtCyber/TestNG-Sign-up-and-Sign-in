package signUpNG;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.DataProvider;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testNG {

	registerUser objRegUser;
	home objHome;
	signinUser objLogin;
	WebDriver driver;
	String str="inputData//inputData.xlsx";
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","res//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		objHome= new home(driver);
		objLogin = new signinUser(driver);
		 objRegUser = new registerUser(driver);
		
		
	}


	@DataProvider
	public Object[][] dp() 
	{   
		Object data[][] = file.getData(str);
		return data;
	}
	
	@Test(dataProvider = "dp")
	public void loginTest(String email,	String firstname, String lastname, String password,	String day, String month,
			              String year, String address, String city, String	state, String zip, String country, String mobilePhone) 
	{
		 driver.get("http://automationpractice.com");
		
		objHome.clickElement(home.Signupbutton);
		objLogin.sendkeys(signinUser.createAccField, email);
		signinUser.createAccountBtn.click();
		
	
		registerUser.TitleMr.click();
		registerUser.sendkeys(registerUser.firstname, firstname);
		registerUser.sendkeys(registerUser.lastname, lastname);
		registerUser.sendkeys(registerUser.password, password);
		registerUser.sendkeys(registerUser.day, day);
		registerUser.sendkeys(registerUser.month, month);
		registerUser.sendkeys(registerUser.year, year);
		registerUser.sendkeys(registerUser.Address, address);
		registerUser.sendkeys(registerUser.city, city);
		registerUser.sendkeys(registerUser.state, state);
		registerUser.sendkeys(registerUser.zip, zip);
		registerUser.sendkeys(registerUser.Country, country);
		registerUser.sendkeys(registerUser.mobilephone, mobilePhone);
		registerUser.Register.click();
		
		Assert.assertEquals(registerUser.verifyName.getText(), firstname+" "+lastname);
		registerUser.signout.click();
		
		
		signinUser.loginuser.sendKeys(email);
		signinUser.loginpass.sendKeys(password);
		signinUser.loginbutton.click();
		
		Assert.assertEquals(registerUser.verifyName.getText(), firstname+" "+lastname);
		registerUser.signout.click();
		
		
		
	}

}
