package browser;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Manohar/Desktop/seleniumProject/Scripts/feb10/qedgetable.html");
		driver.manage().window().maximize();
		//get specific row data from table
String text=driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]")).getText();
System.out.println(text);
//store table into webelement
WebElement table=driver.findElement(By.name("qedgetech"));
//count no of rows in a table which are stored in tr tag
List<WebElement>rows=table.findElements(By.tagName("tr"));
System.out.println("no of rows are::"+rows.size());
for(int i=1;i<rows.size();i++)
{
	//get collection of columns which are stored into td tag
List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
System.out.println("Row Number"+i+"    "+"No of columns::"+cols.size());
}
driver.close();
		
		
		
		
		
		
		

	}

}
