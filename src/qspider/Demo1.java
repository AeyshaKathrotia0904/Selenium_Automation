package qspider;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 public class Demo1 {
	 static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	  public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
driver.get("https://demo.opensourcebilling.org/");
Thread.sleep(3000);
driver.close();
	  }

}
