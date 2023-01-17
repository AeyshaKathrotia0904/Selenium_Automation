package jspider;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertPopup2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]")).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		a.dismiss();
		boolean text = driver.findElement(By.xpath("//*[@id=\"demo\"]")).isDisplayed();
		System.out.println(text);

	}
}