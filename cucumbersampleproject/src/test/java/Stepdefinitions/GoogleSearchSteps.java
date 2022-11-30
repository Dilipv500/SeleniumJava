package Stepdefinitions;


import static org.junit.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class GoogleSearchSteps {

	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("Inside Step - browser is open");
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
	  driver.navigate().to("https://www.google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
	    driver.findElement(By.cssSelector(".gLFyf")).sendKeys("Automation Step by Steps");
	}


	@When("^user enters a text in search box (.*)$")
	public void user_enters_a_text_in_search_box_search_value(String parameter) {
		 driver.findElement(By.cssSelector(".gLFyf")).sendKeys(parameter);
	}

	
	
	@When("hits enter")
	public void hits_enter() {
		driver.findElement(By.cssSelector(".gLFyf")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		boolean isOnlineFieldExists =  driver.getPageSource().contains("Online Courses");
		assertEquals(isOnlineFieldExists,true);	
	
	}
	
	@Then("^user is navigated to search results (.*)$")
	public void user_is_navigated_to_search_results_output(String parameter) {
		boolean isOnlineFieldExists =  driver.getPageSource().contains(parameter);
		assertEquals(isOnlineFieldExists,true);	
	
	}
	
	

}
