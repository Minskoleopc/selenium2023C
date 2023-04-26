import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		
		// Action ---- object ----- methods ---- bulid ----- perform
		
		Actions a = new Actions(driver);
//		WebElement e = driver.findElement(By.cssSelector("#double-click"));
//		a.doubleClick(e).build().perform();
//		if(e.getAttribute("class").equals("div-double-click double")) {
//			System.out.println("Test case pass");
//		}
//		
		
		// drag and drop
//		
//		WebElement draggable=  driver.findElement(By.cssSelector("#draggable"));
//		WebElement droppabble =  driver.findElement(By.cssSelector("#droppable"));
//		System.out.println(droppabble.getText());
//		a.dragAndDrop(draggable, droppabble).build().perform();
//		System.out.println(droppabble.getText());
		
		
		// click and hold
//		WebElement e = driver.findElement(By.cssSelector("#click-box"));
//		a.clickAndHold(e).build().perform();
//		System.out.println(e.getText());
//		if(e.getText().equals("Well done! keep holding that click now.....")) {
//			System.out.println("Testcase pass");
//		}
		
		
		//contextClick()
//		WebElement e = driver.findElement(By.cssSelector("#double-click"));
//		a.contextClick().build().perform();
		
		//#div-hover > div:nth-child(3)
		
		//hover over the element
		WebElement e = driver.findElement(By.cssSelector("#div-hover > div:nth-child(3)"));
		a.moveToElement(e).build().perform();
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
