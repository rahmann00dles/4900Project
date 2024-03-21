package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	WebDriver driver = null;
	
	@FindBy(xpath = "(//*[contains(text(),'Add User')])[2]")
	WebElement addUserHeader;
	public WebElement addUserHeader() {
		return addUserHeader;
	}
	
	@FindBy(xpath = "//p[contains(text(),'Sign up to begin adding your contacts!')]")
	WebElement addUserMessage;
	public WebElement addUserMessage() {
		return addUserMessage;
	}
	
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement inputFirstName;
	public WebElement inputFirstName() {
		return inputFirstName;
	}
	
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement inputLastName;
	public WebElement inputLastName() {
		return inputLastName;
	}
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement inputEmail;
	public WebElement inputEmail() {
		return inputEmail;
	}
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement inputPassword;
	public WebElement inputPassword() {
		return inputPassword;
	}
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement submitButton;
	public WebElement submitButton() {
		return submitButton;
	}
	
	@FindBy(xpath = "//button[@id='cancel']")
	WebElement cancelButton;
	public WebElement cancelButton() {
		return cancelButton;
	}
	
	public SignUpPage(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
}
