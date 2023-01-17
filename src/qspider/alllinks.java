package qspider;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alllinks {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();	
		System.out.println("Enter the website you want");
		Scanner sc=new Scanner(System.in);
		String url=sc.nextLine();

		driver.get(url);
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));

		int count = alllinks.size();
		System.out.println(count);

		for(int i=0;i<count;i++) {
			String text=alllinks.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}

}
