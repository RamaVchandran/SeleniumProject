package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		
		
		WebElement mouse = driver.findElement(By.xpath("//a[text()='All Departments']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouse).perform();
		
		WebElement mouseSec = driver.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"));
		act.moveToElement(mouseSec).perform();
		
		WebElement mouseth = driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		act.moveToElement(mouseth).perform();
		
		
		WebElement mouClick = driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		Thread.sleep(3000);
		mouClick.click();
		driver.quit();
		
	}

}
