package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Utilities.ElementUtilities;
import Utilities.SeleniumDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	@Given("^User logged into portal$")
	public void user_logged_into_portal() throws Throwable {
		// Code to login into system
	
		
		
		throw new PendingException();

	}
	
	@When("^user click on Sign In on home page$")
	public void user_click_on_Sign_In_on_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		// click on button or link when enable
		
		ElementUtilities.clickWhenEnable(ElementUtilities.searchElement("Home.SignIn"));
		
		// Enter text into text box
		
		ElementUtilities.inputWhenEnable(ElementUtilities.searchElement("Home.SignIn"), "Value" );
		
		
		
		throw new PendingException();
	}

	@When("^user input Email address on create an account section$")
	public void user_input_Email_address_on_create_an_account_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^user click on create an account$")
	public void user_click_on_create_an_account() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^user select Title on YOUR PERSONAL INFORMATION section$")
	public void user_select_Title_on_YOUR_PERSONAL_INFORMATION_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^user input First name on YOUR PERSONAL INFORMATION section$")
	public void user_input_First_name_on_YOUR_PERSONAL_INFORMATION_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^user input Last name on YOUR PERSONAL INFORMATION section$")
	public void user_input_Last_name_on_YOUR_PERSONAL_INFORMATION_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^user verify Email on YOUR PERSONAL INFORMATION section$")
	public void user_verify_Email_on_YOUR_PERSONAL_INFORMATION_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^user input Password on YOUR PERSONAL INFORMATION section$")
	public void user_input_Password_on_YOUR_PERSONAL_INFORMATION_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^user select Date of Birth on YOUR PERSONAL INFORMATION section$")
	public void user_select_Date_of_Birth_on_YOUR_PERSONAL_INFORMATION_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^User check Sign up for our newsletter! on YOUR PERSONAL INFORMATION section$")
	public void user_check_Sign_up_for_our_newsletter_on_YOUR_PERSONAL_INFORMATION_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^User check Receive special offers from our partners! on YOUR PERSONAL INFORMATION section$")
	public void user_check_Receive_special_offers_from_our_partners_on_YOUR_PERSONAL_INFORMATION_section()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^User input First name on YOUR Address section$")
	public void user_input_First_name_on_YOUR_Address_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^User input Last name on YOUR Address section$")
	public void user_input_Last_name_on_YOUR_Address_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^User input Company on YOUR Address section$")
	public void user_input_Company_on_YOUR_Address_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^User input Address on YOUR Address section$")
	public void user_input_Address_on_YOUR_Address_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^User input Address \\(Line (\\d+)\\) on YOUR Address section$")
	public void user_input_Address_Line_on_YOUR_Address_section(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^User input City on YOUR Address section$")
	public void user_input_City_on_YOUR_Address_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^User input State on YOUR Address section$")
	public void user_input_State_on_YOUR_Address_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^User input Zip/Postal Code on YOUR Address section$")
	public void user_input_Zip_Postal_Code_on_YOUR_Address_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^User input Country on YOUR Address section$")
	public void user_input_Country_on_YOUR_Address_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^User input Mobile phone on YOUR Address section$")
	public void user_input_Mobile_phone_on_YOUR_Address_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^User input Assign an address alias for future reference on YOUR Address section$")
	public void user_input_Assign_an_address_alias_for_future_reference_on_YOUR_Address_section() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^user click on Register button$")
	public void user_click_on_Register_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^User is able to see account created successfully message;$")
	public void user_is_able_to_see_account_created_successfully_message() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
