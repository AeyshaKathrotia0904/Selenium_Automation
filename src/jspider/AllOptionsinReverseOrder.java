package jspider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionsinReverseOrder {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Hotel.html");	
		WebElement mlb = driver.findElement(By.id("checkpost"));
		Select sc= new Select(mlb);  
		List<WebElement> alloptions = sc.getOptions();
		int count=alloptions.size();
		for(int i=count-1;i>=0;i--)
		{
			 String text = alloptions.get(i).getText();
System.out.println(text);
		}
		
	}

}
