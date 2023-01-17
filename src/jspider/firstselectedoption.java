package jspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstselectedoption {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Hotel.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select sc= new Select(mtr);
		sc.selectByIndex(0);
		sc.selectByValue("k");
		sc.selectByVisibleText("lemon");
		boolean mul = sc.isMultiple();
		System.out.println(mul); 
	}

}
