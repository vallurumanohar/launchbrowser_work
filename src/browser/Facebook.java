package browser;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	
		
		public class Facebook {
			public static void main(String[] args) throws Throwable {
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				//get window id 
				String parent=driver.getWindowHandle();
				System.out.println("parent id::"+parent);
				Thread.sleep(5000);
				//click on terms links
				driver.findElement(By.xpath("(//*[text()='Terms'])[1]")).click();	
				Thread.sleep(5000);
				//get collection of all window ids
				Set<String>allwindows=driver.getWindowHandles();
				System.out.println("all window id::"+allwindows);
				for(String each:allwindows)
				{
					//parent window id should not be equal to each window
					if(!parent.equals(each))
					{
						//switch to child window
						driver.switchTo().window(each);
						Thread.sleep(5000);
						//click on sign up
						driver.findElement(By.xpath("(//*[text()='Sign Up'])[1]")).click();	
						Thread.sleep(5000);
						//switch back to parent
						driver.switchTo().window(parent);
						Thread.sleep(5000);
						driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@gmail.com");
						driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Test@gmail.com");
						driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.ENTER);
						Thread.sleep(5000);
						driver.quit();
					}
				}

	}

}
