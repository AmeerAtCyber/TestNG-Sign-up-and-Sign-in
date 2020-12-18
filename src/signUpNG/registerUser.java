package signUpNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerUser {
	

	WebDriver driver;

	@FindBy(xpath="//div[@id='uniform-id_gender1']")
	static WebElement TitleMr;
	@FindBy(xpath="//input[@id='id_gender2']")
	static WebElement TitleMrs;
	@FindBy(xpath="//input[@id='customer_firstname']")
	static WebElement firstname;
	@FindBy(xpath="//input[@id='customer_lastname']")
	static WebElement lastname;
	@FindBy(xpath="//input[@id='passwd']")
	static WebElement password;
	@FindBy(xpath="//select[@id='days']")
	static WebElement day;
	@FindBy(xpath="//select[@id='months']")
	static WebElement month;
	@FindBy(xpath="//select[@id='years']")
	static WebElement year;
	@FindBy(xpath=" //input[@id='address1']")
	static WebElement Address;
	@FindBy(xpath="//input[@id='city']")
	static WebElement city;
	@FindBy(xpath="//select[@id='id_state']")
	static WebElement state;
	@FindBy(xpath="//input[@id='postcode']")
	static WebElement zip;
	@FindBy(xpath="//select[@id='id_country']")
	static WebElement Country;
	@FindBy(xpath="//input[@id='phone_mobile']")
	static WebElement mobilephone;
	@FindBy(xpath="//button[@id='submitAccount']")
	static WebElement Register;
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/h1[1]")
	static WebElement nextpage;
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	static WebElement signout; ////*[@id="header"]/div[2]/div/div/nav/div[2]/a
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	static WebElement Signupbutton;
	@FindBy (xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span") ////*[@id="header"]/div[2]/div/div/nav/div[1]/a/span
	static WebElement verifyName;
	
	public registerUser(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public static void clickElement(WebElement el) {
		el.click();
	}

	public static void sendkeys(WebElement el, String str) {
		el.sendKeys(str);
	}
	

	
}
