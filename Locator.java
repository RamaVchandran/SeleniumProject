import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.navigate().to("https://www.facebook.com/");
		
		Dimension d = new Dimension(500,500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		Point p = new Point(250,250);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
	}

}
