package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbLoginEnabled {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		boolean login = driver.findElement(By.xpath("//button[@type=\"submit\"]")).isEnabled();
		if(login==true)
		{
			System.out.println("button is enabled");
		}
		else {
			System.out.println("button is not enabled");
		}
		driver.close();
	}
}
