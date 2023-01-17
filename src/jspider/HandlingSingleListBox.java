package jspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleListBox {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		Thread.sleep(3000);
		   WebElement mtb = driver.findElement(By.id("month"));
		   Select sc= new Select(mtb);
		   sc.selectByIndex(0);
		   Thread.sleep(3000);
		   sc.selectByValue("4");
		   Thread.sleep(3000);
		   sc.selectByVisibleText("Aug");
	}

}
