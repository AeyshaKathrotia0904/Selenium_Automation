package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class copypaste2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/sele.html");
		driver.findElement(By.xpath(" /html/body/input[1]")).sendKeys(Keys.CONTROL+"ac");
		driver.findElement(By.xpath(" /html/body/input[2]")).sendKeys(Keys.CONTROL+"av");
}}
