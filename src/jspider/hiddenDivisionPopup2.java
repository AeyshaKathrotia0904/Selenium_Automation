package jspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hiddenDivisionPopup2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");

		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[1]"));
		Select sm=new Select(month);
		sm.selectByValue("3");
		WebElement year = driver.findElement(By.xpath("//select[2]"));
		Select sy=new Select(year);
		sy.selectByValue("1997");
        driver.findElement(By.xpath("//a[text()=\"9\"]")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.xpath("//button[text()=\"Lets Renew\"]")).click();
		boolean text = driver.findElement(By.xpath("//span[text()=\"Please enter valid Policy No.\"]")).isDisplayed();
		System.out.println(text);
	}
}