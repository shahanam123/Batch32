package bluestone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoldMine2
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='Gold Mine 10+1 Monthly Scheme']")).click();
        driver.findElement(By.id("amount")).sendKeys("1000");
        driver.findElement(By.id("Email")).sendKeys("shahanam687@gmail.com");
        driver.findElement(By.id("tahLpSubmit")).click();
	}

}
