package qspider;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class autosugg {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
//enter the url		
		driver.get("https://www.google.com/"); 
//type java in search box		
		driver.findElement(By.name("q")).sendKeys("java"); 
		Thread.sleep(4000);
//find all the auto suggestions
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
//print the count we use size();
		int count=allsugg.size();
		System.out.println(count);
//print the text of all auto suggestions
		for(int i=0;i<count;i++) {
			String text = allsugg.get(i).getText();
			System.out.println(text);
		}
//to select 1st auto suggestion		
		allsugg.get(0).click(); 
	}
}
