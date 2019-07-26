package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		
		Thread.sleep(9000);
		WebElement mouse = driver.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouse).perform();
		
		
		Thread.sleep(5000);
		WebElement click = driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
		click.click();
		driver.quit();
		
		
	}

}
