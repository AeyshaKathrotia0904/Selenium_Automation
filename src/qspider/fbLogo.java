package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbLogo {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
boolean logo = driver.findElement(By.xpath("// img[@alt=\"Facebook\"]")).isDisplayed();
if(logo==true)
{
	System.out.println("Logo is displayed");
	}
else
	System.out.println("logo is displayed");
driver.close();
	}

}
