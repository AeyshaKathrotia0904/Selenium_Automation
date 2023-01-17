package qspider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bbcnews {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> d1 = driver.findElements(By.xpath("(//ul)[14]/li"));
		////*[@id="page"]/section[7]/div/div/div[2]/div/ul
				
	int count=d1.size();
	System.out.println(count);
	
	for(WebElement d2:d1) {
		 String d3=d2.getText();
		 System.out.println(d3);
	}
	driver.close();
	}

}
