package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Risers {

	private static final String URL = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100";

	private WebDriver driver;
	public WebElement WebElement;

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "//strong[contains(text(),'Risers')]")
	private WebElement riser;

	public static String getUrl() {
		return URL;
	}

	public void largestRiser() {
		riser.click();
	}
}
