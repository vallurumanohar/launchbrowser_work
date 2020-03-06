package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.chromedriver","C:\\Users\\Manohar\\Desktop\\seleniumProject\\jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https:\\facebook.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("vallurumanohar@gmail.com");

		Thread.sleep(5000);
		WebElement password = driver.findElement(By.id("pass"));

		password.sendKeys("manohar@1");

		Thread.sleep(5000);
		driver.findElement(By.id("u_0_b")).click();

		Thread.sleep(5000);
		driver.findElement(By.id("userNavigationLabel")).click();

		//Thread.sleep(5000);
		driver.findElement(By.id("u_o_5")).click();



	}

}
