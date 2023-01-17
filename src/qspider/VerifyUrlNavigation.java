package qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlNavigation {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org/");
		Thread.sleep(3000);
		String expectedUrl = "https://www.selenium.dev/";
		String actualUrl = driver.getCurrentUrl();
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("Url is navigating");
		}
		else {
			System.out.println("Url not navigating");
		}

		driver.close();
	}}
