import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dayTwo {

	public static void main(String[] args) throws InterruptedException {
		
		
		// valid login 
		
		// Arrange 
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Action 
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(5000);
//		WebElement username = driver.findElement(By.cssSelector("input[name=\"username\"]"));
//		WebElement password = driver.findElement(By.cssSelector("input[name=\"password\"]"));
//		WebElement loginButton = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
//		
//		username.sendKeys("Admin");
//		password.sendKeys("admin12asdsa3");
//		loginButton.click();
//		Thread.sleep(5000);
		
		
// Test case one 		
		
		
//		WebElement dashBoard = driver.findElement(By.cssSelector("img[alt=\"client brand banner\"]"));
//		
//		boolean logo  = dashBoard.isDisplayed();
//		if(logo){
//			System.out.println("Testcase pass");
//		}	
//		else {
//			System.out.println("Testcase fail");
//		}
//		
//		driver.close();
		

// Test case two
		
//		WebElement ele = driver.findElement(By.cssSelector("div[class = \"oxd-alert-content oxd-alert-content--error\"]"));
//		
//		if(ele.isDisplayed()) {
//			System.out.println("Testcase pass");
//		}
//		else {
//			System.out.println("Testcase fail");
//		}
//		driver.quit();
// Test case three
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("p[class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).click();
//			
//		String currentUrl = driver.getCurrentUrl();
//		if(currentUrl.contains("requestPasswordResetCode")) {
//			System.out.println("testcase pass");
//		}
//		else {
//			System.out.println("testcase fail");
//		}
//		driver.quit();
		
	// Test case four
		
		if(driver.findElement(By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-branding > img")).isDisplayed()) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Testcase fail");
		}
		driver.quit();
		
		
		
		
		//<h1 id = "one"  class = "two" name = "nm">Hello<h1>
		// Css selector
		// #one
		//.two
		// h1[id = "one"]
		// h1
		
		
		
		
		
		// Assertion
		
		
		
		
		// invalid login 
		
		
		
		
		// forgot password 
		
		
		
		// dashboard logo
		
		

	}

}
