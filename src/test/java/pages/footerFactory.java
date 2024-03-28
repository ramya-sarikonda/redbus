package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class footerFactory {
	public class footerFac{
		WebDriver driver;
		public  footerFac (WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(id = "terms_n_conditions_footer") WebElement termsConditions;
		@FindBy(xpath = "//*[@id=\"privacy_policy_footer\"]") WebElement privacyPolicy;
		@FindBy(xpath = "//*[@id='faq_footer']") WebElement faq;
		@FindBy(xpath = "//*[@id=\"blog_footer\"]") WebElement blog;
		@FindBy(xpath = "//*[@id=\"bus_operator_registration_footer\"]") WebElement busOperatorRegistration;
		
		public void termsConditions()
		{
			termsConditions.click();
		}
		public void privacyPolicy()
		{
			privacyPolicy.click();
		}
		public void faq()
		{
			faq.click();
		}
		public void blog()
		{
			blog.click();
		}
		public void busOperatorRegistration()
		{
			busOperatorRegistration.click();
		}
		
		
		
	}
}
