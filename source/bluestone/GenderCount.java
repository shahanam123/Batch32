package bluestone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GenderCount 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("gender");
		act.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//span/child::a[@title='Rings']")).click();
		WebElement wb=driver.findElement(By.xpath("//span[text()='Gender']"));
		act.moveToElement(wb).perform();
		WebElement eb=driver.findElement(By.xpath("//span[text()=' Women ']/child::span[@class='items-count']"));
		act.moveToElement(eb).perform();
		String s=eb.getText();
		System.out.println(s);
		driver.close();
		
	}

}
