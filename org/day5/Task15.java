package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task15 {
	
	public static void main(String[] args) throws InterruptedException {	
	System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	
	
	WebElement mouse = driver.findElement(By.xpath("(//a[@class='menuLinks leftCategoriesProduct '])[7]"));
	Actions act = new Actions(driver);
	act.moveToElement(mouse).perform();
	
	WebElement mouseSec = driver.findElement(By.xpath("(//span[text()='Footwear'])[2]"));
	mouseSec.click();
	
	WebElement mousethid = driver.findElement(By.xpath("//p[@title='Heels']"));
	
	Thread.sleep(3000);
	mousethid.click();
	driver.quit();


	}
}
