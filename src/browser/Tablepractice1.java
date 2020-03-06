package browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablepractice1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.dbs.com.sg/personal/investments/unit-trusts/get-to-know-unit-trusts?cid=sg:en:cbg:bsd:sem:goo:na:na:fpg:cen_fpg_sem_2019:na:%22mutual+fund%22&gclid=Cj0KCQiAm4TyBRDgARIsAOU75soam52Onk1j0kZyErJhAgJimaOiTX0AS72TwthGjjdoeSw5YKXkQ70aAnWjEALw_wcB&gclsrc=aw.ds");
		
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//*[@id=\"bodywrapper\"]/div[1]/section/div[1]/div[2]/div/div[5]/table"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("number of rows::"+ rows.size());
		
		for(WebElement eachrow: rows)
		{
			List<WebElement> cols = table.findElements(By.tagName("td"));
		
			for(WebElement eachcol: cols) {
				String celltext = eachcol.getText();
				
				System.out.println("\n"+celltext);
			}
			//System.out.println();
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		}

	}

}
