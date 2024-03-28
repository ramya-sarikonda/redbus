package stepDefinitions;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pages.footerFactory;
public class footer {
	WebDriver driver;
	@Given("when user is in redbus homepage")
	
	//footerFactory pageFactory;
	
	public void when_user_is_in_redbus_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	//	footerFactory pageFactory;
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
        driver = new ChromeDriver(opt);
	    
	    driver.get("https://www.redbus.in/");
	}

	@When("user scroll to footer scetion")
	public void user_scroll_to_footer_scetion() throws InterruptedException {
		JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
	    // Write code here that turns the phrase above into concrete actions
		javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
	}


	@When("user click on terms and conditions link")
	public void user_click_on_terms_and_conditions_link(){
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("terms_n_conditions_footer")).click();
//	    pageFactory = new footerFactory(driver);
//	    pageFactory.termsConditions();
	    String actualOutcome = driver.getTitle();
	    String expectedOutcome  = "Red  Bus - Terms and Conditions";
	    Assert.assertNotEquals(actualOutcome, expectedOutcome);
	      
	}

	@Then("user should be redirected to new terms and conditions page")
	public void user_should_be_redirected_to_new_terms_and_conditions_page() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user click on privacy policy link")
	public void user_click_on_privacy_policy_link() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("privacy_policy_footer")).click();
	    String actualUrl = driver.getCurrentUrl();
	    String expectedUrl  = "https://www.redbus.in/info/privacypolicy";
	    Assert.assertNotEquals(actualUrl, expectedUrl);
	}

	@Then("user should be redirected to privacy policy page")
	public void user_should_be_redirected_to_privacy_policy_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("user click on FAQ link")
	public void user_click_on_faq_link() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("faq_footer")).click();
	    

	    
	}

	@Then("user should be redirected to FAQ page")
	public void user_should_be_redirected_to_faq_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("user click on blog link")
	public void user_click_on_blog_link() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("blog_footer")).click();
	   
	}

	@Then("user should be redirected to blog page")
	public void user_should_be_redirected_to_blog_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("user click on bus operator registration link")
	public void user_click_on_bus_operator_registration_link() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("bus_operator_registration_footer")).click();
	    
	}

	@Then("user should be redirected to bus operator registration page")
	public void user_should_be_redirected_to_bus_operator_registration_page() {
	    // Write code here that turns the phrase above into concrete actions			
	    
	}
	
	@Then("user should enter valid phone number")
	public void user_should_enter_valid_phone_number() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();		
	    WebElement number = driver.findElement(By.xpath("div#signinElement>div>div>form>div>div>input"));
	    number.click();
	    number.sendKeys("9110760419");
	    System.out.println("Please solve CAPTCHA manually and press ENTER to continue....");
		new java.util.Scanner(System.in).nextLine();
	}

	@Then("user should click on generate otp button")
	public void user_should_click_on_generate_otp_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("user should enter otp")
	public void user_should_enter_otp() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    driver.findElement(By.xpath("//*[@id=\"signinElement\"]/div/div/form/button"));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter OTP: ");
		String OTP=sc.next();
		WebElement otp=driver.findElement(By.xpath("//*[@id=\"signinElement\"]/div/div/form/div/div[2]/input"));
		otp.sendKeys(OTP);
	}

	@Then("user should click on enter otp")
	public void user_should_click_on_enter_otp() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"signinElement\"]/div/div/form/button"));
	}

	@Then("user redirected to details page")
	public void user_redirected_to_details_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	    	
	}




}

