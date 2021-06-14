package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Faller {

	private static final String URL = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100";

	private  WebDriver driver;
	public WebElement WebElement;
			
	public WebDriver getDriver() {
		return driver;
	}
	
	
	@FindBy(xpath = "//strong[contains(text(),'Fallers')]")
	private WebElement faller;
	
	
	public static String getUrl() {
		return URL;
	}
	public void faller() {
		faller.click();
	}
}
