	
		package browser;
		import java.util.List;
		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		public class Iframe {
		public static void main(String[] args)throws Throwable {
			WebDriver driver=new ChromeDriver();
			driver.get("https://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			Actions ac=new Actions(driver);
			ac.sendKeys(Keys.PAGE_DOWN).perform();
			//get collections of frames in a page
		List<WebElement>Olist=driver.findElements(By.tagName("iframe"));
		System.out.println("no of frames are::"+Olist.size());
		//switch to frame
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dst=driver.findElement(By.id("droppable"));
		ac.dragAndDrop(src, dst).perform();
		if(dst.getText().contains("Dropped"))
		{
		System.out.println("drag and drop succes");
		}
			else
			{
			System.out.println("drag and drop Fail");
			}
		//come out frame
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
		Thread.sleep(5000);
		//driver.close();
			}
		
	}


