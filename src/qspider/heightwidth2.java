package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class heightwidth2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");
		int Eheight = driver.findElement(By.name("username")).getSize().getHeight();
		int Ewidth = driver.findElement(By.name("username")).getSize().getWidth();

		int Pheight = driver.findElement(By.name("pwd")).getSize().getHeight();
		int Pwidth = driver.findElement(By.name("pwd")).getSize().getWidth();
		if(Eheight==Pheight && Ewidth==Pwidth) {
			System.out.println("Height and width are same");
		}
		else {
			System.out.println("Height and width are not same");
		} driver.close();
	}
}