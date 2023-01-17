package jspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Hotel.html");
		WebElement cplb = driver.findElement(By.id("checkpost"));
		Select sc= new Select(cplb);
		String fco = sc.getFirstSelectedOption().getText();
		System.out.println(fco);
	}

}


