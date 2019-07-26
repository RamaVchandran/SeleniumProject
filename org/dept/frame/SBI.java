package org.dept.frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		WebElement cont = driver.findElement(By.xpath("//a[@class='login_button']"));
		cont.click();
		//Alert al1= driver.switchTo().alert();
		//al1.accept();
		
		WebElement element = driver.findElement(By.xpath("//input[@id='Button2']"));
		element.click();
		Thread.sleep(5000);
		Alert al = driver.switchTo().alert();
		al.accept();
		

	}

}
