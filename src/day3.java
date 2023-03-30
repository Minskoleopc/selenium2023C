import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
//		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//		
//		// Locate by ID attribute
//		driver.findElement(By.id("checkboxes")).isDisplayed();		
//			
//		// Locate Element by attribute Name
//		driver.findElement(By.name("vegetable")).isDisplayed();
//		
//		//Locate the element by tagName 
//		driver.findElement(By.tagName("form")).isDisplayed();
//		
//		// Locate the element by Css selector
//		driver.findElement(By.cssSelector("#checkboxes")).isDisplayed();
		
		//<h1 id = "a"  class = "b"  name = "nm">Hello</h1>
		
		driver.get("http://www.webdriveruniversity.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		// Locate the element by Link
		driver.findElement(By.linkText("Automationteststore")).isDisplayed();
		
		// Locate the element by Partial link text
		
		driver.findElement(By.partialLinkText("PORTAL")).isDisplayed();
		
		
		// Locate the element by className
		
		driver.findElement(By.className("caption")).isDisplayed();
		
		// Locate the element by Xpath
		
		driver.findElement(By.xpath("//*[@id=\"ajax-loader\"]/div/div[1]/h1")).isDisplayed();
		
		
		
		
		
		
		
		
		
		

		
		
		driver.quit();
		
		
		
	}

}
