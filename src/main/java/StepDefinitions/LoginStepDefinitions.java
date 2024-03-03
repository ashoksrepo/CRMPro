package StepDefinitions;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinitions {
	WebDriver driver;
	@Before
	public void setup() {
		System.out.println("Pre-condition");
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://classic.crmpro.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Given("user is in Login page")
	
	public void user_is_in_login_page() {
	
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Free CRM software for customer relationship management, sales, and support.", title);
	
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ashok123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("user navigated to home page")
	public void user_navigated_to_home_page() {
		String hometitle = driver.getTitle();
		System.out.println(hometitle);
		Assert.assertEquals("CRMPRO", hometitle);	
		
	}
		@After
		public void tearDown() {
			System.out.println("Post-condition");
			if (driver!= null) {
			driver.quit();
		}
		
	}
}

