package StepDefinitions;


import org.openqa.selenium.WebDriver;
import Util.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class RegistrationSteps {
	String browser = "firefox";
	WebDriver driver = Driver.driverSetup(browser);
	
	@Given("A user goes to the contact list app")
	public void loginPage() throws InterruptedException {
		//Setup driver
		driver.navigate().to("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().window().maximize();
	}

	@When("A user is on the app")
	public void verifyLoginPage() {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("Verify the {string} header")
	public void verifyHeader(String header) {
		// Write code here that turns the phrase above into concrete actions
		

	}

	@Then("Verify the {string} message")
	public void verifyWelcomeMessage(String message) {
		// Write code here that turns the phrase above into concrete actions
		

	}

	@Then("Verify the sign up button is clickable")
	public void verifySignUpButtonClickable() {
		// Write code here that turns the phrase above into concrete actions
		

	}

	@When("A user clicks on the sign up button")
	public void clickSignUpButton() {
		// Write code here that turns the phrase above into concrete actions
		

	}

	@Then("Verify the the fields are {string}")
	public void verifyFields(String clickable) {
		// Write code here that turns the phrase above into concrete actions
		

	}

	@When("A user clicks on the {string} input field")
	public void userClicksInputField(String fieldName) {
		// Write code here that turns the phrase above into concrete actions
		

	}

	@Then("A user can enter their first name")
	public void userEntersFirstName() {
		// Write code here that turns the phrase above into concrete actions
		

	}

	@Then("A user can enter their last name")
	public void userEntersLastName() {
		// Write code here that turns the phrase above into concrete actions
		

	}

	@Then("A user can enter their email")
	public void userEntersEmail() {
		// Write code here that turns the phrase above into concrete actions
		

	}

	@Then("A user can enter their password")
	public void userEntersPassword() {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Then("Verify the {string} button is clickable")
	public void verifyClickableButton(String string) {
		// Write code here that turns the phrase above into concrete actions
		

	}

	@When("A user clicks on the {string} button")
	public void userClicksButton(String string) {
		// Write code here that turns the phrase above into concrete actions
		driver.quit();
	}
}
