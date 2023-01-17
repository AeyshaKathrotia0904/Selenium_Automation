package qspider;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iphone_ass {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max"+ Keys.ENTER);
		 List<WebElement> allproducts = driver.findElements(By.xpath("//div [contains (text(), 'APPLE iPhone 14 Pro Max')]"));
		  List<WebElement> allprices = driver.findElements(By.xpath("//div [contains (text(),\"APPLE iPhone 14 Pro Max\")]/../../div[2]/div[1]/div[1]/div"));
		for(int i=0;i<allprices.size();i++)
		{
			String productName=(allproducts).get(i).getText();
			String price=allprices.get(i).getText();
			System.out.println(productName +"--->"+ price);
		}
		driver.close();
	}
}
