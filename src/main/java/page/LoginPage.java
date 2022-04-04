package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//WebElement
	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@name='login' and @type='submit']") WebElement SIGNIN_BUTTON_ELEMENT;
	
	//Intractable methods
	public void insertUserName(String username) {
		USERNAME_ELEMENT.sendKeys(username);
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickSigninButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}
	
	//Alternate way
	public void logIn(String username, String password) {
		USERNAME_ELEMENT.sendKeys(username);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNIN_BUTTON_ELEMENT.click();
	}
	
}
