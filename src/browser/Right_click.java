package browser;


		import java.awt.Robot;
		import java.awt.event.KeyEvent;
		import java.util.ArrayList;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		public class Right_click {
		public static void main(String[] args)throws Throwable {
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
				Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();		
		//creata object for robot
		Robot r=new Robot();
		//down arrow two times
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(6000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(6000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(6000);
		ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(brw.get(1));
		Thread.sleep(6000);
		//click on signin
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
		ArrayList<String>brw1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(brw1.get(2));
		Thread.sleep(6000);
		driver.findElement(By.name("identifier")).sendKeys("pranga2010");
		Thread.sleep(6000);
		driver.quit();
			}

		}