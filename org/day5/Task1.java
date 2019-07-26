package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html ");
		
		WebElement debit = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement amount = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		WebElement bank = driver.findElement(By.id("bank"));
		
		WebElement bank1= driver.findElement(By.id("amt7"));
		
		Actions acc = new Actions(driver);
		
		acc.dragAndDrop(debit,bank ).perform();
		
		acc.dragAndDrop(amount, bank1).perform();
		
		WebElement cerdit = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		WebElement drag = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		WebElement drop = driver.findElement(By.id("loan"));
		
		
		WebElement drop1 = driver.findElement(By.id("amt8"));
		
		
		acc.dragAndDrop(cerdit, drop).perform();
		
		acc.dragAndDrop(drag, drop1).perform();
		//driver.quit();
	
	}
}
