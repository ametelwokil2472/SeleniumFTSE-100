package test;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.Faller;
import pages.HomePage;
import pages.Risers;
import pages.rise;

public class FtseTest {

	private static WebDriver driver;

	@BeforeClass
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		// driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

	}

	@Before
	public void setup() {

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		try {
			driver.get(HomePage.getUrl());
		} catch (TimeoutException e) {

		}
	}

	@AfterClass
	public static void teardown() {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException, ParseException {
		String urlTextString;

		HomePage nav = PageFactory.initElements(driver, HomePage.class);
		rise lg = PageFactory.initElements(driver, rise.class);
//		Faller fl = PageFactory.initElements(driver, Faller.class);

		nav.Riser();
		Thread.sleep(10000);

		nav.faller();
		Thread.sleep(10000);

//		lg.maxValue();
//		Thread.sleep(10000);

	}
}
