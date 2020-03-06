package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class other {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

driver.get("https://amazon.in/");

driver.manage().window().maximize();
//driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span[@class='nav-icon nav-arrow']")).click();
//click on sign in button
driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")).click();
//user name 
driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("vallurumanohar@gmail.com");
//click on continue button
driver.findElement(By.xpath("//input[@id='continue']")).click();
//password
driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("manohar@1");
//click on login
driver.findElement(By.xpath("//input[@id='signInSubmit']")).submit();
//reenter password
driver.findElement(By.id("ap_password")).sendKeys("manohar@1");

//click on login button
Thread.sleep(20000);
driver.findElement(By.id("signInSubmit")).submit();

driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span[@class='nav-icon nav-arrow']")).click();

//click on logout
driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();

Thread.sleep(10000);

driver.close();

//driver.findElement(By.id("search")).click();
}

}
