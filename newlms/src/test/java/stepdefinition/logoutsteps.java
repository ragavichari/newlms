package stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.logout;
import utility.helper;


	public class logoutsteps extends Baseclass{
		private static final Logger LOGGER=LogManager.getLogger(logoutsteps.class);
	@Given("Admin\\/User\\/Staff Logged on to LMS website")
	public void admin_user_staff_logged_on_to_lms_website() {
	    logou=new logout(helper.getDriver());
	    logou.logon();
	    LOGGER.info("useris loged on");
	}

	@When("Admin\\/User\\/Staff  Clicks on LogOut button")
	public void admin_user_staff_clicks_on_log_out_button() {
	    logou.clicklogout();
	    LOGGER.info("userclicks logout");
	}

	@Then("Admin\\/User\\/Staff should be navigated to Login Screen")
	public void admin_user_staff_should_be_navigated_to_login_screen() {
	    logou.navlogout();

	}
	}

