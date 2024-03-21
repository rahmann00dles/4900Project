package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class WelcomePage {
	
	//ELEMENTS
	WebDriver driver = null;
	
	@FindBy(xpath = "//*[contains(text(),'Sign up')]")
	WebElement signUpButton;
	public WebElement signUpButton() {
		return signUpButton;
	}
	
	@FindBy(xpath = "(//*[contains(text(),'Contact List App')])[2]")
	WebElement appHeader;
	public WebElement appHeader() {
		return appHeader;
	}
	
	@FindBy(xpath = "//p[contains(text(),'Not yet a user')]")
	WebElement signUpMessage;
	public WebElement signUpMessage() {
		return signUpMessage;
	}
	
	
	//Element Initializers
	public WelcomePage(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	

}
