package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class statuscheckbox {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		boolean checkbox = driver.findElement(By.id("keepMeLoggedInCaptionContainer")).isSelected();
		if(checkbox==true)
		{
			System.out.println("selected");	
		}
		else {
			System.out.println("not selected");
		}
		driver.close();
	}
}
