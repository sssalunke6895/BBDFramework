package com.bbd.BBDFramework.stepDefination;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.bbd.BBDFramework.pages.MyntraPage;

import io.cucumber.java.en.*;

public class Myntra {
	Actions a1;
	WebElement category;
	WebDriver driver;
	Core co = new Core();
	MyntraPage mp = new MyntraPage();

	@Given("as user launch the browser")
	public void as_user_launch_the_browser() {
		driver = co.setup();
	}

	@And("user navigate to myntra website landing page")
	public void user_navigate_to_myntra_website_landing_page() {
		driver.navigate().to(mp.url());
	}

	@And("user choose any section like men or women from menu bar")
	public void user_choose_any_section_like_men_or_women_from_menu_bar() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath(mp.menSection()))).build().perform();
		a.click();
	}

	@Then("choose any item you want to purchase")
	public void choose_any_item_you_want_to_purchase() {
		category = driver.findElement(By.xpath(mp.item()));

	}

	@When("user click on sort by and choose what's new")
	public void user_click_on_sort_by_and_choose_what_s_new() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", category);
		a1 = new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath(mp.sortMenu()))).build().perform();
		a1.moveToElement(driver.findElement(By.xpath(mp.whatsNew()))).click().build()
				.perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@And("check for filter like brand,discount,range")
	public void check_for_filter_like_brand_discount_range() {
		a1.moveToElement(driver.findElement(By.cssSelector(mp.brand()))).click()
				.build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		a1.moveToElement(driver.findElement(By.cssSelector(mp.discount()))).click().build()
				.perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@And("choose item item want to see")
	public void choose_item_item_want_to_see() {
		a1.moveToElement(driver.findElement(By.xpath(mp.product()))).click().build().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		String parent=itr.next();
		String child=itr.next();
		driver.switchTo().window(child);
		driver.findElement(By.xpath(mp.brandSize())).click();
	}

	@And("add it to bag")
	public void add_it_to_bag() {
		driver.findElement(By.xpath(mp.bag())).click();
		
	}

	@Then("open a bag check item is there")
	public void open_a_bag_check_item_is_there() {
		driver.findElement(By.xpath(mp.openBag())).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(mp.bagPopup())).click();
		driver.findElement(By.xpath(mp.wishList())).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(mp.wishListPopup())).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@And("close browser")
	public void close_browser() {
		co.tearDown();
	}

}
