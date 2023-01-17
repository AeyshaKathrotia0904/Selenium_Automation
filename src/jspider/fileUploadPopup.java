package jspider;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Naukri.html");
		Thread.sleep(3000);
		File f=new File("./data/Naukri.html");

		String path=f.getAbsolutePath();
		driver.findElement(By.id("CV")).sendKeys(path);
}
}