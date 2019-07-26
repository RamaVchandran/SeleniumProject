package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task18 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		user.sendKeys("ramac660@gmail.com");
		WebElement pass= driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		pass.sendKeys("Rama@1591");
		
		WebElement sub = driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
		sub.click();
		
		Thread.sleep(5000);
		WebElement mouseOne = driver.findElement(By.xpath("//span[text()='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouseOne).perform();
		
		WebElement foot = driver.findElement(By.xpath("(//a[text()='Footwear'])[2]"));
		foot.click();
		
		Thread.sleep(5000);
		WebElement flat = driver.findElement(By.xpath("(//a[@title='Flats'])[2]"));
		flat.click();
		
		driver.quit();
	}

}
