package StepDefinitions;


import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

import Pages.SignUpPage;
import Pages.WelcomePage;
import Util.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;



public class RegistrationSteps {
	String browser = "chrome";
	WebDriver driver = Driver.driverSetup(browser);
	WelcomePage welcomePage;
	SignUpPage signUpPage;
	
	@Given("A user goes to the contact list app")
	public void loginPage() throws InterruptedException {
		//Setup driver
		driver.navigate().to("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().window().maximize();
	}

	@When("A user is on the app")
	public void verifyLoginPage() throws InterruptedException {
		Thread.sleep(4000);
	}

	@Then("Verify the {string} header")
	public void verifyHeader(String header) {
		welcomePage = new WelcomePage(driver);
		signUpPage = new SignUpPage(driver);
		
		if(header.equalsIgnoreCase("Contact List App")){
			
			$(welcomePage.appHeader()).shouldBe(visible);
			$(welcomePage.appHeader()).shouldBe(clickable);
		}
		else if(header.equalsIgnoreCase("Add User")) {
			$(signUpPage.addUserHeader()).shouldBe(visible);
			$(signUpPage.addUserHeader()).getText().equalsIgnoreCase("Add User");
		}
		
	}

	@Then("Verify the {string} message")
	public void verifyWelcomeMessage(String message){
		welcomePage = new WelcomePage(driver);
		signUpPage = new SignUpPage(driver);
		
		if(message.equalsIgnoreCase("sign up")){
			$(welcomePage.signUpMessage()).shouldBe(visible);
			$(welcomePage.signUpMessage()).getText().equalsIgnoreCase("Not yet a user? Click here to sign up!");
		}
		else if(message.equalsIgnoreCase("add user")) {
			$(signUpPage.addUserMessage()).shouldBe(visible);
			$(signUpPage.addUserMessage()).getText().equalsIgnoreCase("Sign up to begin adding your contacts!");
		}
		
	}
		

	@Then("Verify the sign up button is clickable")
	public void verifySignUpButtonClickable(){
		welcomePage = new WelcomePage(driver);
		$(welcomePage.signUpButton()).shouldBe(visible);
		$(welcomePage.signUpButton()).shouldBe(clickable);
	}

	@When("A user clicks on the sign up button")
	public void clickSignUpButton() {
		welcomePage = new WelcomePage(driver);
		$(welcomePage.signUpButton()).click();
	}

	@Then("Verify the the fields are enabled")
	public void verifyFields() {
		signUpPage = new SignUpPage(driver);
		$(signUpPage.inputFirstName()).shouldBe(enabled);
		$(signUpPage.inputLastName()).shouldBe(enabled);
		$(signUpPage.inputEmail()).shouldBe(enabled);
		$(signUpPage.inputPassword()).shouldBe(enabled);
	}

	@Then("A user can enter their {string}")
	public void userEntersFirstName(String field) throws InterruptedException {
		signUpPage = new SignUpPage(driver);
		Faker faker = new Faker();
		
		if(field.equalsIgnoreCase("first name")){
			$(signUpPage.inputFirstName()).sendKeys(faker.name().firstName());
			Thread.sleep(1000);
		}
		else if(field.equalsIgnoreCase("last name")) {
			$(signUpPage.inputLastName()).sendKeys(faker.name().lastName());
			Thread.sleep(1000);
		}
		else if(field.equalsIgnoreCase("email")) {
			String email = faker.name().username() + "@email.com";
			$(signUpPage.inputEmail()).sendKeys(email);
			Thread.sleep(1000);
		}
		else{
			$(signUpPage.inputPassword()).sendKeys("UniquePassword");
			Thread.sleep(1000);
		}
		
	}

	@Then("Verify the {string} button is clickable")
	public void verifyClickableButton(String button) {
		signUpPage = new SignUpPage(driver);
		
		if(button.equalsIgnoreCase("Submit")){
			$(signUpPage.submitButton()).shouldBe(visible);
			$(signUpPage.submitButton()).shouldBe(clickable);
		}
		else{
			$(signUpPage.cancelButton()).shouldBe(visible);
			$(signUpPage.cancelButton()).shouldBe(clickable);
		}
		

	}

	@When("A user clicks on the {string} button")
	public void userClicksButton(String string) throws InterruptedException {
		signUpPage = new SignUpPage(driver);
		
		$(signUpPage.submitButton()).click();
		
		Thread.sleep(6000);
		
		driver.quit();
	}
}
