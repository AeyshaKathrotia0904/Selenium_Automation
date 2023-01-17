package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbcolor {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String clr = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
		String size = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
		String family=driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
		System.out.println(clr);
		System.out.println(size);
		System.out.println(family);
		driver.close();
	}
}
