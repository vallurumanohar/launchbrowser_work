import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.wordpress.org/?locale=en_US");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user_login")).sendKeys("demo123");
		driver.findElement(By.id("user_pass")).sendKeys("admin1");
				Thread.sleep(5000);
		//driver.findElement(By.id("rememberme")).click();
		boolean check = driver.findElement(By.id("rememberme")).isSelected();
		System.out.println(check);
		Thread.sleep(5000);
		driver.close();

	}

}
