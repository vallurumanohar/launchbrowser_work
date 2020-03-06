package browser;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc3 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		//click on help
				
				
				ArrayList<String> allwindows = new ArrayList<>(driver.getWindowHandles());
				
				//for (int j = 0; j <allwindows.size(); j++) {
				
				//System.out.println(allwindows.get(0));
				
				//driver.switchTo().window(allwindows.get(0));
				
				//click on help
				
				driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
				driver.findElement(By.xpath("//input[@placeholder='Describe your issue']")).sendKeys("hello");
				Thread.sleep(3000);
				driver.switchTo().window(parentwindow);
				
				driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
				Thread.sleep(3000);
									
					driver.switchTo().window(parentwindow);
					Thread.sleep(3000);
					driver.switchTo().window(allwindows.get(1));
							
					Thread.sleep(3000);
					
					driver.switchTo().window(parentwindow);
					//click on  privacy
					
					
					driver.switchTo().window(allwindows.get(2));
					Thread.sleep(3000);
					
					driver.switchTo().window(parentwindow);
					
					Thread.sleep(5000);
					
					driver.switchTo().window(allwindows.get(3));
					Thread.sleep(3000);
					
					driver.switchTo().window(parentwindow);
					Thread.sleep(5000);
					driver.quit();
				



	
				}
		
		
		
		
	}


