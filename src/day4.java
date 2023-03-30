import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		//<h1 id = "one" class = "two" name = "nm">Hello</h1>
		WebElement  checkBoxOne = driver.findElement(By.cssSelector("input[value ='option-1']"));
	
		// sendKeys()
		// isDisplayed()
		// isSelected()
		// submit()
		// isEnabled()
		// getLocation()
		// clear()
		// getText()
		// getTagName()
		// getCssValue()
		// getAttribute()
		// click()
		// getSize()
		
		
	
		
		
		
		
		
		
		
		System.out.println(checkBoxOne.getLocation());
		
		
		
		
		

	}

}
