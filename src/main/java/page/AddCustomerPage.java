package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver =  driver;
	}

	@FindBy(how =How.XPATH, using = "//h5[contains(text(),'Add Contact')]") WebElement ADD_CONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account']") WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']") WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='email']") WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']") WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='address']") WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='city']") WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='state']") WebElement STATE_REGION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']") WebElement ZIP_POSTALCODE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='country']") WebElement COUNTRY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']") WebElement SAVE_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Contacts')]") WebElement CONTACTS_HEADER_ELEMENT;
	
	public void verifyAddContactPage() {
		
		waitForElement(driver, 10, ADD_CONTACT_HEADER_ELEMENT);
		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), "Add Contact", "Add Contact Page not found !!");
	}
	
	public void insertFullName(String fullName) {
		String insertedName = fullName + generateRandom(999);
		FULL_NAME_ELEMENT.sendKeys(insertedName);
	}
	
	public void selectCompanyDropdown(String company) {		
		selectFromDropdown(COMPANY_DROPDOWN_ELEMENT, company);
	}
	
	public void insertEmail(String email) {
		String insertedEmail = generateRandom(999) + email;
		EMAIL_ELEMENT.sendKeys(insertedEmail);
	}
	
	public void insertPhone(String phone) {
		String insertedPhone = phone + generateRandom(9999);
		PHONE_ELEMENT.sendKeys(insertedPhone);
	}
	
	public void insertAddress(String address) {
		ADDRESS_ELEMENT.sendKeys(address);
	}
	
	public void insertCity(String city) {
		CITY_ELEMENT.sendKeys(city);
	}
	
	public void insertStateRegion(String state) {
		STATE_REGION_ELEMENT.sendKeys(state);
	}
	
	public void insertZipPostalCode(String zip) {
		ZIP_POSTALCODE_ELEMENT.sendKeys(zip);
	}
	
	public void selectCountryDropdown(String country) {
		selectFromDropdown(COUNTRY_DROPDOWN_ELEMENT, country);
	}
	
	public void clickSaveButton() {
		SAVE_BUTTON_ELEMENT.click();
	}
	
	public void verifyContactsPage() {
		waitForElement(driver, 10, CONTACTS_HEADER_ELEMENT);
		Assert.assertEquals(CONTACTS_HEADER_ELEMENT.getText(), "Contacts", "Wrong Page !!");
	}
	
}
