package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class footerFactory {
		WebDriver driver;
		public  footerFactory (WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(id = "terms_n_conditions_footer") WebElement termsConditions;
		@FindBy(xpath = "//*[@id=\"privacy_policy_footer\"]") WebElement privacyPolicy;
		@FindBy(xpath = "//*[@id='faq_footer']") WebElement faq;
		@FindBy(xpath = "//*[@id=\"blog_footer\"]") WebElement blog;
		@FindBy(xpath = "//*[@id=\"bus_operator_registration_footer\"]") WebElement busOperatorRegistration;
		
		public void TermsConditions()
		{
			termsConditions.click();
		}
		public void PrivacyPolicy()
		{
			privacyPolicy.click();
		}
		public void Faq()
		{
			faq.click();
		}
		public void Blog()
		{
			blog.click();
		}
		public void BusOperatorRegistration()
		{
			busOperatorRegistration.click();
		}
		
		
		
	}

