package signUpNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {

	WebDriver driver;

	@FindBy(xpath="//a[@title='Log in to your customer account']")
	static WebElement Signupbutton;
	public home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickElement(WebElement el) {
		el.click();
	}

}
