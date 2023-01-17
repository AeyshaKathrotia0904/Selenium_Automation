package jspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dob {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		
		WebElement dlb = driver.findElement(By.id("day"));
		Thread.sleep(3000);
		Select sd= new Select(dlb);
		sd.selectByIndex(8);
		Thread.sleep(3000);
		
		WebElement mlb = driver.findElement(By.id("month"));
		Thread.sleep(3000);
		Select sm=new Select(mlb);
		Thread.sleep(3000);
		sm.selectByVisibleText("Apr");
		Thread.sleep(3000);
		
		WebElement ylb = driver.findElement(By.id("year"));
		Thread.sleep(3000);
		Select sy=new Select(ylb);
		Thread.sleep(5000);
		sy.selectByValue("1997");;

	}

}
