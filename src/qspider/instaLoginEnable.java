package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instaLoginEnable {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		boolean insta = driver.findElement(By.xpath("//button[@type=\"submit\"]")).isEnabled();
		if(insta==true)
		{
			System.out.println("enabled");
		}
		else {
			System.out.println("disabled");
	}
		driver.close();
		}
}
