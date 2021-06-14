package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	private static final String URL = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100";
	private WebDriver driver;
	public WebElement WebElement;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "//strong[contains(text(),'Risers')]")
	private WebElement riser;

	@FindBy(xpath = "//strong[contains(text(),'Fallers')]")
	private WebElement faller;

	public static String getUrl() {
		return URL;
	}

	public void Riser() {
		riser.click();
	}

	public void faller() {
		faller.click();
	}

}
