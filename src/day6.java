import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankurjain\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5501/DOM/index.html");
		
		
//		driver.get("https://www.amazon.in/");
//		System.out.println(driver.findElement(By.id("nav-logo-sprites")).getSize());
//		
//		Dimension d = driver.findElement(By.id("nav-logo-sprites")).getSize();
//		System.out.println(d.height);
//		System.out.println(d.width);
		
//		
//		System.out.println(driver.findElement(By.id("nav-logo-sprites")).getLocation());
//		Point p = driver.findElement(By.id("nav-logo-sprites")).getLocation();
//		System.out.println(p.x);
//		System.out.println(p.y);
//		driver.quit();
		
		
//		String h = driver.findElement(By.id("nav-logo-sprites")).getAttribute("class");
//		System.out.println(h);
//		
		
		
//		String h = driver.findElement(By.id("nav-logo-sprites")).getTagName();
//		System.out.println(h);
		
//		String h1 = driver.findElement(By.className("one")).getCssValue("color");
//		System.out.println(h1);
//		
//		
	
		// userAction 
		
		// element add,
		// element update 
		// element retrive
		// element delete
		
		// attribute add
		// attribute update 
		// attribute retrive
		// attribute delete
		
		
		driver.quit();
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
