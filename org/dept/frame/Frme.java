package org.dept.frame;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frme {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		List<WebElement> li = driver.findElements(By.tagName("frameset"));
		int size = li.size();
		System.out.println(size);
		driver.switchTo().frame(0);
		WebElement btn =driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
		btn.click();
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		al.accept();

	}

}
