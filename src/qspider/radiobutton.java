package qspider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class radiobutton {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		int y1 = driver.findElement(By.xpath("//label[text()=\"Female\"]")).getLocation().getY();
		int y2=driver.findElement(By.xpath("//label[text()=\"Male\"]")).getLocation().getY();
		int y3=driver.findElement(By.xpath("//label[text()=\"Custom\"]")).getLocation().getY();
		if(y1==y2 && y2==y3&& y3==y1)
		{
			System.out.println("aligned equal");
		}
		else {
			System.out.println("not equal");
		}
		driver.close();
	}}