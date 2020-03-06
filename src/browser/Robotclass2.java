package browser;

//import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.server.handler.GetElementAttribute;

public class Robotclass2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");

driver.manage().window().maximize();

Actions ac = new Actions(driver);

ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();

//robotic class

Robot r = new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(4000);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(4000);
r.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(6000);

ArrayList<String> abc = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(abc.get(1));
Thread.sleep(4000);

driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();

ArrayList<String> abc1 = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(abc1.get(2));
Thread.sleep(5000);
driver.findElement(By.name("identifier")).sendKeys("vallurumanohar@gmail.com");
Thread.sleep(6000);

driver.quit();


	}
	

}
