package org.dept.frame;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com");
		
		try {
		WebElement pay =driver.findElement(By.xpath("//div[text()='Log In/Sign Up']"));
		pay.click();
	
		}
		catch(StaleElementReferenceException e)
		{
			WebElement pay =driver.findElement(By.xpath("//div[text()='Log In/Sign Up']"));
			pay.click();	
		}
		
	
		List <WebElement> li = driver.findElements(By.tagName("iframe"));
		int size = li.size();
		System.out.println(size);
		WebElement element = driver.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']"));
		element.click();
		

	}

}
