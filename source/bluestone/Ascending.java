package bluestone;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ascending
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("rings");
		act.sendKeys(Keys.ENTER).perform();
		List<WebElement> lst=driver.findElements(By.xpath("//div[@class='p-image']/following-sibling::span[@class='p-wrap']/descendant::span[@class='new-price']"));
		int n=lst.size();
		List<String> a1=new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			String s=lst.get(i).getText();
			a1.add(s);
			System.out.println(a1);
		}
		TreeSet<String> set=new TreeSet<String>(a1);
		System.out.println(set);
		//System.out.println(a1);
		
	}

}
