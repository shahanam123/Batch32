package bluestone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class scenario11
{

	public static void main(String[] args)
	{
		System.out.println("verifying");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.bluestone.com/");
		WebElement db=driver.findElement(By.xpath("//li/a[text()='Offers ']"));
		Actions act=new Actions(driver);
		act.moveToElement(db).perform();
		driver.findElement(By.xpath("//li/span[text()='Flat 5% Off']")).click();
		List<WebElement> ls=driver.findElements(By.xpath("//div/span[@class='p-wrap']"));
		System.out.println(ls.size());
		for(WebElement wb:ls)
		{
			System.out.println(wb.getText());
		}
		String ExpMsg="(5% off)";
		List<WebElement> ActMsg=ls;
		if(ActMsg.contains(ExpMsg))
		{
			System.out.println("PASS");
		}
		
		

	}

}
