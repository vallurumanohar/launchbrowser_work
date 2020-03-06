package browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.geeksforgeeks.org/");
		driver.manage().window().maximize();
		
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window,scrollBy(0,1000)");
		
		Actions ac = new Actions(driver);
		Thread.sleep(4000);
		ac. sendKeys(Keys.PAGE_DOWN).perform();	
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Java")).click();
		
		
		
		List<WebElement> allframes= driver.findElements(By.tagName("iframes"));
		
		driver.findElement(By.xpath("//iframe[@id='google_ads_frame0']")).click();
		
		driver.close();
	

	}

}
