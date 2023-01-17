package jspider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectedOptions {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Hotel.html");	
        WebElement mlb = driver.findElement(By.id("checkpost"));
          Select sc= new Select(mlb);  
          List<WebElement> aso = sc.getAllSelectedOptions();
        int count=aso.size();
        System.out.println(count);
//        for(int i=0;i<count;i++)
//        {
//        	String text = aso.get(i).getText();
//        	System.out.println(text);
//        }
        for(WebElement txt:aso) {
        	
			System.out.println(txt.getText());
        }
	}

}
