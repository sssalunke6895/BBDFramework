package com.bbd.BBDFramework.stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bbd.BBDFramework.pages.YahooPage;

import io.cucumber.java.en.*;

public class Yahoo {

	WebDriver driver;
	Core co = new Core();
	YahooPage yp = new YahooPage();
	int size;
	List<WebElement> links;

	@Given("as user is launch the browser")
	public void as_user_is_launch_the_browser() {
		driver = co.setup();

	}

	@And("user navigate to yahoo landing page")
	public void user_navigate_to_yahoo_landing_page() {
		driver.get(yp.url());
	}

	@When("user verify the trending now")
	public void user_verify_the_trending_now() {
		String text = driver.findElement(By.cssSelector(yp.title())).getText();
		if (text.contentEquals("Trending Now")) {
			System.out.println("Text : " + text);
		} else {
			System.out.println("Text : " + text);
			driver.close();
			driver.quit();
		}
	}

	@And("user validate the total number of link trending now")
	public void user_validate_the_total_number_of_link_trending_now() {
		links = driver.findElements(By.cssSelector(yp.links()));
		size = links.size();
		System.out.println("Total Number of Links : " + (size));
		
	}

	@And("print the link test")
	public void print_the_link_test() {
		for (int i = 0; i < size; i++) {
			System.out.println(links.get(i).getText());
		}

		
	}

	@And("user navigate to each link")
	public void user_navigate_to_each_link() {
		for (int i = 0; i < size; i++) {
			String linkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			links.get(i).sendKeys(linkTab);
		}
	}

	

	@And("user is click on coronavirus menu bar link")
	public void user_is_click_on_coronavirus_menu_bar_link() {
		driver.findElement(By.cssSelector(yp.covidLink())).click();
	}

	@And("user get the content of cases overview like india and death")
	public void user_get_the_content_of_cases_overview_like_india_and_death() {
		System.out.print("Total Casses in India : ");
		String cases= driver.findElement(By.cssSelector(yp.indiaCases())).getText();
		System.out.print(cases+"\n");
		String death = driver.findElement(By.cssSelector(yp.indiaDeath())).getText();
		System.out.print("Death Cases : ");
		System.out.print(death);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("user exit browser")
	public void user_exit_browser() {
		co.tearDown();

	}

}
