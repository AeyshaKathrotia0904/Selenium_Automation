package jspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getWrapper {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Hotel.html");	
		WebElement mlb = driver.findElement(By.id("checkpost"));
		Select sc= new Select(mlb);
		 String text = sc.getWrappedElement().getText();
		System.out.println(text);
		}
}
