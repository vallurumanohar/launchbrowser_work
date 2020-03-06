package browser;

import java.io.File;
//import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		DateFormat sdf= new SimpleDateFormat("dd_MM_yyyy hh_mm_ss");
		Date d= new Date();
		
		String datef = sdf.format(d);
		
		File Screen= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(Screen,new File("C:\\Users\\Manohar\\Desktop\\seleniumProject\\Screenshot\\"+datef+"homepage.png"));
		
		driver.close();
		
	}

}
