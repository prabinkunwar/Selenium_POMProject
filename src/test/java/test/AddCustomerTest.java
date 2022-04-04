package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToCreateCustomer() {
		driver = BrowserFactory.init();
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.insertUserName("demo@techfios.com");
		login.insertPassword("abc123");
		login.clickSigninButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage();
		dashboardPage.clickCustomerMenuButton();
		dashboardPage.clickAddCustomerMenuButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.verifyAddContactPage();
		addCustomerPage.insertFullName("Selenium October");
		addCustomerPage.selectCompanyDropdown("Techfios");
		addCustomerPage.insertEmail("demo@techfios.com");
		addCustomerPage.insertPhone("785456");
		addCustomerPage.insertAddress("2741 E Belt Line Rd Suite 105");
		addCustomerPage.insertCity("Carrollton");
		addCustomerPage.insertStateRegion("Texas");
		addCustomerPage.insertZipPostalCode("75006");
		addCustomerPage.selectCountryDropdown("India");
		addCustomerPage.clickSaveButton();
		addCustomerPage.verifyContactsPage();
		
//		BrowserFactory.tearDown();
		
	}
	
}
