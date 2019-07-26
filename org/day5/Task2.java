package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement User = driver.findElement(By.xpath("//span[text()='Category']"));
		Actions act = new Actions(driver);
		act.moveToElement(User).perform();
		
		WebElement mouseTwo = driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		act.moveToElement(mouseTwo).perform();
		
		WebElement power=driver.findElement(By.xpath("//span[text()='Power Banks']"));
		power.click();
		driver.quit();
		
	}

}
