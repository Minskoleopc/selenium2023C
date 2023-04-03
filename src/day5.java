import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		// WebElements
//		WebElement fn = driver.findElement(By.cssSelector("input[name='first_name']"));
//		WebElement ln = driver.findElement(By.cssSelector("input[name='last_name']"));
//		WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
//		WebElement message = driver.findElement(By.cssSelector("textarea[name='message']"));
//		WebElement btn = driver.findElement(By.cssSelector("input[type='submit']"));
//		WebElement h2 = driver.findElement(By.tagName("h2"));

		// isDisplayed()
//		if (h2.isDisplayed()) {
//			System.out.println("testcase pass");
//		}
//
//		else {
//			System.out.println("testcase fail");
//		}

//		// sendKeys() //input/textArea
//		fn.sendKeys("chinmay");
//		fn.clear();
//		ln.sendKeys("deshpande");
//		email.sendKeys("chinmaydeshpande010@gmail.com");
//		message.sendKeys("hello i am learning js");

		// button <form> <form>

		//btn.click();
		//btn.submit();
		
		
//		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//		System.out.println(driver.findElement(By.cssSelector("input[value= 'lettuce']")).isEnabled());
//		System.out.println(driver.findElement(By.cssSelector("input[value= 'cabbage']")).isEnabled());
//		System.out.println(driver.findElement(By.cssSelector("input[value= 'pumpkin']")).isSelected());
//		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		
		
		
		
		

	}

}
