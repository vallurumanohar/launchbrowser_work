package browser;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_class {
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
//driver.manage().window().maximize();
Actions ac= new Actions(driver);
ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
//robot class
Robot r = new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(5000);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(5000);
ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(brw.get(1));
Thread.sleep(5000);
//click on sign in
driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
ArrayList<String> brw1 = new ArrayList<String>(driver.getWindowHandles());
//System.out.println(brw1);
driver.switchTo().window(brw1.get(2));
Thread.sleep(6000);
driver.findElement(By.name("identifier")).sendKeys("pranga2010");
Thread.sleep(6000);
driver.quit();
	}

}