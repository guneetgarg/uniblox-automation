package StepDefinitions;

import com.google.common.util.concurrent.Uninterruptibles;
import com.insure.pages.HomePage;
import com.insure.util.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.concurrent.TimeUnit;

public class HomePageStepDefinition {


	HomePage homePage = new HomePage();

	@Given("User opens the {string} browser")
	public void user_opens_the_browser(String string) {
		CommonUtils.openBrowserURL("CHROME");
	}

	@Then("User Click on Get Started Button")
	public void user_Click_on_Get_Started_Button() {
		homePage.clickGetStarted();
	}
	@Then("User select Applicant Type {string}")
	public void user_select_Applicant_Type(String string) {
		homePage.clickApplicantTypeEmployee();
	}
	@Then("user select Product Supplementa Life")
	public void user_select_Product_Supplementa_Life() {
		homePage.clickProductSupplementalLife();
		homePage.clickNextButton();
	}

	@Then("User enter the First Name as {string} and Last Name as {string}")
	public void user_enter_the_First_Name_as_and_Last_Name_as(String string, String string2) {
		homePage.typeFirstName(string);
		homePage.typeLastName(string2);
		homePage.clickNextButton();
	}

	@Then("User enter email id as {string}")
	public void user_enter_email_id_as(String string) {
		homePage.typeEmail(string);
		homePage.clickNextButton();
	}

	@Then("User set the coverage amount")
	public void user_set_the_coverage_amount() {
		homePage.setSliderCoverageAmount();
		homePage.clickNextButton();
	}

	@Then("User enter the DOB as {string}")
	public void user_enter_the_DOB_as(String string) {

		homePage.setDob(string.replaceAll("-",""));
		homePage.clickNextButton();

	}

	@Then("user select the gender as male")
	public void user_select_the_gender_as_male() {
		homePage.setGenderMale();
	}

	@Then("User enter the phone mumber as {string}")
	public void user_enter_the_phone_mumber_as(String string) {

		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		homePage.setPhoneNumber("2622846856");
		homePage.clickNextButton();
	}

	@Then("User enter the address as {string} and accept the term and condition")
	public void user_enter_the_address_as_and_accept_the_term_and_condition(String string) {
		homePage.seLocation(string);
		homePage.clickIsAuthReleaseAgree();
		homePage.clickIsConsentBusiness();
		homePage.clickNextButton();
	}

	@Then("User enter the weight as {string}")
	public void user_enter_the_weight_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		homePage.setWeight(string);

	}

	@Then("User enter the height as {string}\"")
	public void user_enter_the_height_as(String string) {
		homePage.setHeight("5'11\"");
		homePage.clickNextButton();
	}

	@Then("user select the NoneOfTheAbove option")
	public void user_select_the_NoneOfTheAbove_option() {
		homePage.clickNoneOfTheAbove();
		homePage.clickNextButton();

		homePage.clickNoneOfTheAbove();
		homePage.clickNextButton();

		homePage.clickNo();
		homePage.clickNo();

	}

	@Then("User enter the First Name as {string} and Last Name as {string} on sign your application")
	public void user_enter_the_First_Name_as_and_Last_Name_asOnSignYourApplication(String string, String string2) {
		homePage.typeFirstName(string);
		homePage.typeLastName(string2);
	}

	@Then("User click on Sign Your Application")
	public void user_click_on_Sign_Your_Application() {
		homePage.clickSignYourApplication();
	}


}
