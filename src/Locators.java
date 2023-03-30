import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5501/index.html");

		// locator by id
		WebElement p1 = driver.findElement(By.id("One"));
		if (p1.getText().contains("Para")) {
			System.out.println("Testcase pass 1");
		}
		;

		// by class name
		WebElement p2 = driver.findElement(By.className("Two"));
		if (p2.getText().contains("Para")) {
			System.out.println("Testcase pass 2");
		}
		;

		// by name

		WebElement p3 = driver.findElement(By.name("nm"));
		if (p3.isDisplayed()) {
			System.out.println("Testcase pass 3");
		}

		// by linkText

		WebElement p4 = driver.findElement(By.linkText("Facebook"));
		if (p4.isDisplayed()) {
			System.out.println("Testcase pass 4");
		}

		// by partial link text
		
		WebElement p5 = driver.findElement(By.partialLinkText("book"));
		if (p5.isDisplayed()) {
			System.out.println("Testcase pass 5");
		}
		
		// byTagName 
		
		WebElement p6 = driver.findElement(By.tagName("h1"));
		if (p6.isDisplayed()) {
			System.out.println("Testcase pass 6");
		}

		// by xpath
		WebElement p7 = driver.findElement(By.xpath("/html/body/h1"));
		if (p7.isDisplayed()) {
			System.out.println("Testcase pass 7");
		}
		
		// by css
		WebElement p8 = driver.findElement(By.cssSelector("p[id='One']"));
		if (p8.isDisplayed()) {
			System.out.println("Testcase pass 8");
		}

		
		//<h3 id = "one" class = "two" name = "nm">Heading3</h3>
		// h3
		// #one
		// .two
		// h3[name = "nm"]
		
		driver.close();
		
		
		
	}

}
