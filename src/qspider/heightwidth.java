package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class heightwidth {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 WebElement txtbox = driver.findElement(By.id("email"));
		int h = txtbox.getSize().getHeight();
		int w = txtbox.getSize().getWidth();
		System.out.println(h);
		System.out.println(w);
		driver.close();
}
}