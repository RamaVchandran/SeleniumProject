package org.dept.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sprint {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sprint.com/");
		WebElement signin = driver.findElement(By.xpath("//p[text()='Sign In']"));
		signin.click();
		WebElement sub = driver.findElement(By.xpath("//button[@id='loginHeaderButton']"));
		Thread.sleep(5000);
		sub.click();
		
	}
	

}
