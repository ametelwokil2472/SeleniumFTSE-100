package pages;

import java.text.NumberFormat;
import java.text.ParseException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rise {

	private static final String URL = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100";

	private WebDriver driver;
	public WebElement WebElement;

	String max;
	double n = 0, p = 0;

	public void maxValue() throws ParseException {

		// No of Columns
		List<WebElement> columns = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("No of columns : " + columns.size());

		// No of Rows
		List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("No of rows : " + rows.size());

		for (int i = 1; i < rows.size(); i++) {
			max = driver.findElement(
					By.xpath("html[1]/body[1]/main[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[2]/table[1]/tbody[1]/tr["
							+ (i + 1) + "]/td[4]"))
					.getText();
			NumberFormat f = NumberFormat.getNumberInstance();
			Number num = f.parse(max);
			max = num.toString();
			n = Double.parseDouble(max);
			if (n > p) {
				p = n;
			}
		}
		System.out.println("The web table current price : " + p);

	}

}
