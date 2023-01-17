package qspider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fyp {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String attri = driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		String tg = driver.findElement(By.linkText("Forgot your password?")).getAttribute("href");
		System.out.println(attri);
		System.out.println(tg);
		driver.close();
	}
}
