package qspider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class alignment {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int x1=driver.findElement(By.name("username")).getLocation().getX();
		int x2=driver.findElement(By.name("pwd")).getLocation().getX();
		if(x1==x2) {
			System.out.println("aligned");
		}
		else {
			System.out.println("not aligned");
		}
		driver.close();
	}}