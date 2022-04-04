package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;

	@Test
	public void validUserShouldBeAbleToLogin() {

		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSigninButton();
		
		//Alternate Way
//		loginPage.logIn("demo@techfios.com", "abc123");
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage();
		dashboardPage.clickCustomerMenuButton();
		dashboardPage.clickAddCustomerMenuButton();
		
//		BrowserFactory.tearDown();

	}

}
