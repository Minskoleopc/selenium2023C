import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandlesS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com");
		String parentTab = driver.getWindowHandle();
		System.out.println(parentTab);
		driver.findElement(By.id("contact-us")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		Iterator<String> it = handles.iterator();

		String parentT = it.next(); // 66AF7707CB6FA104936865CDAE442CD4
		String childT = it.next();
		driver.switchTo().window(childT);
		System.out.println(driver.getTitle());
	
		// filling contact us form
		driver.findElement(By.cssSelector("input[name=\"first_name\"]")).sendKeys("chinmay");
		driver.switchTo().window(parentT);
		System.out.println(driver.getTitle());
	}

}
