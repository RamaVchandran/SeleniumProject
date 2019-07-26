package org.day5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {
	public static void main(String[] args) throws InterruptedException, AWTException {
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
		WebElement mouseOne = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouseOne).perform();
		
		Thread.sleep(5000);
		WebElement chair = driver.findElement(By.xpath("//a[@title='Chairs']"));
		chair.click();
		
		Thread.sleep(4000);
		WebElement pin = driver.findElement(By.xpath("//span[text()='Change']"));
		pin.click();
		
		WebElement enterPin = driver.findElement(By.xpath("//input[@id='pincodeInputId']"));
		enterPin.clear();
		Thread.sleep(5000);
		enterPin.sendKeys("600059");
		
		WebElement click =driver.findElement(By.xpath("//span[text()='Check']"));
		click.click();
		
		/*Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		
		//WebElement drpdown = driver.findElement(By.xpath("//span[@class='_3tSqpH']"));
		//drpdown.click();
		
		Thread.sleep(5000);
		WebElement link=driver.findElement(By.xpath("(//a[text()='DZYN Furnitures Linen Office Executive Chair'])[2]"));
		link.click();
		
		WebElement cart = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		cart.click();
		
		driver.quit();
	}

}
