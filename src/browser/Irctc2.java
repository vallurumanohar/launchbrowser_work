package browser;

import java.util.ArrayList;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		
		String parentwindow = driver.getWindowHandle();
		
		//click on help
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		
		//click on privacy
		//driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
		
		//get collections of all windows
		
		//Set<String> allwindows = driver.getWindowHandles();
		
		ArrayList<String> allwindows = new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(allwindows.get(1));
		
		for (String each:allwindows)
		{
		//parent window shpuld not equal to

			if(!parentwindow.equals(each))
			{
			
			//switch to help window
				
				//driver.switchTo().window(each);
				
				driver.findElement(By.xpath("//input[@placeholder='Describe your issue']")).sendKeys("hello");
				
				Thread.sleep(3000);
				
				driver.switchTo().window(parentwindow);
				
				Thread.sleep(3000);
				
				//click on  privacy
				driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
				
				driver.switchTo().window(allwindows.get(2));
				Thread.sleep(3000);
				
				driver.findElement(By.linkText("FAQ")).click();
Thread.sleep(3000);			

driver.switchTo().window(parentwindow);



//click on  terms
driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();

//driver.switchTo().window(allwindows.get(3));
Thread.sleep(3000);

driver.findElement(By.name("Welcome to Google!"));
Thread.sleep(3000);

driver.quit();
	}
		
		}
}}