package org.stepdefinition;

import java.util.List;

import org.apache.xmlbeans.impl.jam.mutable.MClass;
import org.base.BaseClass;
import org.pom.MyAccPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	@Given("user opens chrome and login to star three sixty application url")
	public void user_opens_chrome_and_login_to_star_three_sixty_application_url() {

		loadUrl("https://www.starthreesixty.com/");
	}

	@When("user clicks the my account option")
	public void user_clicks_the_my_account_option() {
		MyAccPojo p = new MyAccPojo();
		buttonClick(p.getMyAcc());
	}

	@Then("user navigated to login or singup page")
	public void user_navigated_to_login_or_singup_page() {
		toGetCurrentPageUrl();
	}

	@Given("User open star three sixty application and click my account")
	public void user_open_star_three_sixty_application_and_click_my_account() {
		loadUrl("https://www.starthreesixty.com/");
		MyAccPojo p = new MyAccPojo();
		buttonClick(p.getMyAcc());
	}

	@When("user enter email id in text box")
	public void user_enter_email_id_in_text_box() {
		MyAccPojo p = new MyAccPojo();
		dataFill(p.getEmail(), "vijay@gmail.com");

	}

	@When("user provides password in text box")
	public void user_provides_password_in_text_box() {
		MyAccPojo p = new MyAccPojo();
		dataFill(p.getPass(), "vijay");

	}

	@When("user clicks sign in button")
	public void user_clicks_sign_in_button() {
		MyAccPojo p = new MyAccPojo();
		toMouseHoverClick(p.getSubmit());
	}

	@Then("user navigated tho invalid credential page")
	public void user_navigated_tho_invalid_credential_page() {
		toGetPageTitle();
	}

	@Given("User open star three sixty application and clicks my account")
	public void userOpenStarThreeSixtyApplicationAndClicksMyAccount() {
		loadUrl("https://www.starthreesixty.com/");
		MyAccPojo p = new MyAccPojo();
		buttonClick(p.getMyAcc());
	}

	@When("user enter email id in the text box")
	public void userEnterEmailIdInTheTextBox(io.cucumber.datatable.DataTable d) {
		List<String> asList = d.asList();
		MyAccPojo p = new MyAccPojo();
		dataFill(p.getEmail(), asList.get(0));

	}

	@When("user provides password in the text box")
	public void userProvidesPasswordInTheTextBox(io.cucumber.datatable.DataTable d) {
		List<String> asList = d.asList();
		MyAccPojo p = new MyAccPojo();
		dataFill(p.getPass(), asList.get(0));

	}

	@When("user clicks signin button")
	public void userClicksSigninButton() {
		MyAccPojo p = new MyAccPojo();
		toMouseHoverClick(p.getSubmit());
	}

	@Then("user navigated to invalid credential page")
	public void userNavigatedToInvalidCredentialPage() {
		toGetPageTitle();
	}
	@Given("user opens chrome and go to star three sixty application")
	public void userOpensChromeAndGoToStarThreeSixtyApplication() {
		loadUrl("https://www.starthreesixty.com/");
	}

	@When("user clicks my acc option")
	public void userClicksMyAccOption() {
		MyAccPojo p = new MyAccPojo();
		buttonClick(p.getMyAcc());
	}

	
	@When("User provide {string} and {string}")
	public void userProvideAnd(String username, String password) {
		MyAccPojo p =new MyAccPojo();
	    dataFill(p.getEmail(), username);
	    dataFill(p.getPass(), password);
	}

	@When("User clicks the sign in button")
	public void userClicksTheSignInButton() {
		MyAccPojo p = new MyAccPojo();
		toMouseHoverClick(p.getSubmit());
	}

	@Then("User navigated to the invalid credential page")
	public void userNavigatedToTheInvalidCredentialPage() {
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.starthreesixty.com/customer/account/login/referer/aHR0cHM6Ly93d3cuc3RhcnRocmVlc2l4dHkuY29tL2N1c3RvbWVyL2FjY291bnQvaW5kZXgv/?SID=o8eqg7g7qbbee6oslhkfdi2f87")) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");

		}
	   
	}

@Given("User got to the star360 application by chrome")
public void userGotToTheStar360ApplicationByChrome() {
	loadUrl("https://www.starthreesixty.com/");
    
}

@When("I clicks the my account option")
public void iClicksTheMyAccountOption() {
	MyAccPojo p = new MyAccPojo();
	buttonClick(p.getMyAcc());
    
}

@When("User provide user name in user name field")
public void userProvideUserNameInUserNameField(io.cucumber.datatable.DataTable d) {
	List<List<String>> asLists = d.asLists();
    MyAccPojo p = new MyAccPojo();
    dataFill(p.getEmail(), asLists.get(0).get(1));
    
}

@When("User provide password in password field")
public void userProvidePasswordInPasswordField(io.cucumber.datatable.DataTable d) {
	List<List<String>> asLists = d.asLists();
	MyAccPojo p = new MyAccPojo();
	dataFill(p.getPass(), asLists.get(1).get(0));
   
}

@When("User clicks singin button")
public void userClicksSinginButton() {
	MyAccPojo p = new MyAccPojo();
	toMouseHoverClick(p.getSubmit());
}

@Then("user nvg to invld crdntl page")
public void userNvgToInvldCrdntlPage() {
   toGetCurrentPageUrl();
}



}
