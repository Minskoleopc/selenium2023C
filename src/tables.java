import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Tables
		// Get the total number of tables
		// Get the total numbers of rows
		// Get total number of columns
		// Iterate rows and columns and print text of element
		// Text of element

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
		
		WebElement table1 = driver.findElement(By.cssSelector("#t02"));
		
		//*[@id="t01"]/tbody/tr[1]
		
		List<WebElement> rows   = table1.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		int sum = 0;
		
		for(int i = 2 ; i <= rows.size() ; i++) {
			//System.out.println(rows.get(i).getText());
			String g = driver.findElement(By.xpath("//*[@id=\"t02\"]/tbody/tr["+i+"]/td[3]")).getText();
			System.out.println(g);
			sum = sum + Integer.parseInt(g);
		}
		
		System.out.println(sum);

	}

}
