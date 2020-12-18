package signUpNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinUser {

	WebDriver driver;
	@FindBy(xpath="//input[@id='email_create']")
	static WebElement createAccField;    //for reg
	@FindBy(xpath="//button[@id='SubmitCreate']") 
	static WebElement createAccountBtn; //for reg
	@FindBy(xpath="//input[@id='email']")
	static WebElement loginuser; 
	@FindBy(xpath=" //input[@id='passwd']")
	static WebElement loginpass;
	@FindBy(xpath="//button[@id='SubmitLogin']")
	static WebElement loginbutton;
	static String str="abc123@online.com";
	
	public signinUser(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickElement(WebElement el){
		el.click();
	}
	public void sendkeys(WebElement el, String str) {
		el.sendKeys(str);
	}
}
