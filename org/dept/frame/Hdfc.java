package org.dept.frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		List <WebElement> li =driver.findElements(By.tagName("frameset"));
		int size= li.size();
		System.out.println(size);
		WebElement element1 = driver.findElement(By.xpath("//frame[@src='RSLogin.html?v=11']"));
		driver.switchTo().frame(element1);
		WebElement element =	driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		element.sendKeys("6424956");
		WebElement btn =driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
		btn.click();
		Thread.sleep(4000);
		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		pass.sendKeys("Rama#1991");
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].setAttribute('value','Rama#1991');", pass);
		
		
		
	}

}
