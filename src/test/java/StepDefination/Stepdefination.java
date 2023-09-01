package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination {	
	
    @Given("^the user is on the user registration page$")
    public void the_user_is_on_the_user_registration_page() {
        // Navigate to the user registration page
    }

    @When("^the user enters a valid username$")
    public void the_user_enters_a_valid_username() {
        // Enter a valid username
    }

    @When("^a valid email address$")
    public void a_valid_email_address() {
        // Enter a valid email address
    }

    @When("^a valid password$")
    public void a_valid_password() {
        // Enter a valid password
    }

    @When("^confirms the password$")
    public void confirms_the_password() {
        // Confirm the password
    }

    @When("^enters a valid birth date$")
    public void enters_a_valid_birth_date() {
        // Enter a valid birth date
    }

    @When("^selects a valid gender$")
    public void selects_a_valid_gender() {
        // Select a valid gender
    }

    @When("^enters a valid phone number$")
    public void enters_a_valid_phone_number() {
        // Enter a valid phone number
    }

    @Then("^the user registration should be successful$")
    public void the_user_registration_should_be_successful() {
        // Verify that the user registration was successful
    }
}
