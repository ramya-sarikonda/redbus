package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageFooter {
	
	public class footer{
		WebDriver driver;
		public  footer (WebDriver driver)
		{
			this.driver = driver;
		}
		
		By termsConditions = By.id("terms_n_conditions_footer");
		By privacyPolicy = By.id("privacy_policy_footer");
		By faq  = By.id("faq_footer");
		By blog = By.id("blog_footer");
		By busOperatorRegistration = By.id("bus_operator_registration_footer");
		
		public void termsConditions() {
			driver.findElement(termsConditions).click();
		}
		public void privacyPolicy() {
			driver.findElement(privacyPolicy).click();
		}
		public void faq() {
			driver.findElement(faq).click();
		}
		public void blog() {
			driver.findElement(blog).click();
		}
		public void busOperatorRegistration() {
			driver.findElement(busOperatorRegistration).click();
		}
	}

}
