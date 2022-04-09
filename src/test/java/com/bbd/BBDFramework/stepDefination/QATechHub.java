package com.bbd.BBDFramework.stepDefination;

import org.openqa.selenium.WebDriver;

import com.bbd.BBDFramework.pages.QATechHubPage;

import io.cucumber.java.en.*;

public class QATechHub {

	WebDriver driver;
	Core co = new Core();
	QATechHubPage qp = new QATechHubPage();

	@Given("user launch the browser")
	public void user_launch_the_browser() {
		driver = co.setup();

	}

	@And("user navigate to qatech HUB landing page")
	public void user_navigate_to_qatech_hub_landing_page() {

		driver.get(qp.url());
	}

	@When("user validate page title and current URL")
	public void user_validate_page_title_and_current_url() {
		System.out.println("Title of Page : " + driver.getTitle());
		System.out.println("Current URL : " + driver.getCurrentUrl());
	}

	@Then("user is navigate to facebook landing page")
	public void user_is_navigate_to_facebook_landing_page() {
		driver.navigate().to(qp.FacebookURL());

	}

	@And("user navigate  back to the previous page")
	public void user_navigate_back_to_the_previous_page() {
		driver.navigate().back();

	}

	@And("user validate current URL")
	public void user_validate_current_url() {
		System.out.println("URL after navigate back : "+driver.getCurrentUrl());
	}

	@Then("user navigate forward")
	public void user_navigate_forward() {
		driver.navigate().forward();
	}

	@And("user reload page")
	public void user_reload_page() {
		driver.navigate().refresh();
	}

	@Then("user close browser")
	public void user_close_browser() {
		co.tearDown();
	}

}
