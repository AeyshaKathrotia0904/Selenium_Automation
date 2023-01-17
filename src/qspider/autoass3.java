package qspider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoass3 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
//enter the url		
		driver.get("https://www.flipkart.com/"); 
		driver.findElement(By.xpath("(//button)[2]")).click();
//type java in search box		
		driver.findElement(By.name("q")).sendKeys("iphone"); 
		Thread.sleep(4000);
//find all the auto suggestions
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'iphone')]"));
//print the count we use size();
		int count=allsugg.size();
		System.out.println(count);
//print the text of all auto suggestions
		for(int i=0;i<count;i++) {
			String text = allsugg.get(i).getText();
			System.out.println(text);
		}
//to select last auto suggestion		
		allsugg.get(count-1).click(); 
	}

	

	

}
