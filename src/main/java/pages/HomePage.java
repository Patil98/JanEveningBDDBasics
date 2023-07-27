package pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;

	WebDriverWait wait;

	@FindBy(xpath = "//*[@id='acUserMenu-aco']")
	WebElement signin;

	@FindBy(xpath = "//*[@id='bkmgFlights_destination_trip_1']")
	WebElement cityField;

	@FindBy(xpath = "//*[@id='bkmgFlights_destination_trip_1SearchResult0']")
	WebElement searchResult;

	@FindBy(xpath = "//*[@id='bkmgFlights_travelDates_1-formfield-1']")
	WebElement departure;

	@FindBy(xpath = "//*[@class='abc-calendar-wrapper']")
	WebElement calendar;

	@FindBy(xpath = "(//*[normalize-space(text())='29'])[1]")
	WebElement depDate;

	@FindBy(xpath = "(//*[normalize-space(text())='23'])[2]")
	WebElement retDate;
	
	@FindBy(xpath = "//*[@id='bkmgFlights_travelDates_1_confirmDates']")
	WebElement confirmDate;
	
	@FindBy(xpath = "//*[@id='bkmgFlights_findButtonContent']")
	WebElement searchButton;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public String fetchTitleOfPage() {
		String title = driver.getTitle();

		return title;
	}

	public boolean isSigninDisplay() {
		boolean isdisplay = signin.isDisplayed();

		return isdisplay;
	}

	public void enterCityName(String cityname) {
		cityField.sendKeys(cityname);

		Actions act = new Actions(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		wait.until(ExpectedConditions.visibilityOf(searchResult));

		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

	}

	public void selectDepartureAndReturn() {
		departure.click();

		wait.until(ExpectedConditions.visibilityOf(calendar));

		depDate.click();
		
		retDate.click();
		
		confirmDate.click();

	}
	
	public void clickOnSearchFlight()
	{
		searchButton.click();
	}

}
