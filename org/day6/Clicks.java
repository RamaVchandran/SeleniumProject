package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clicks {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// robot class
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement userTxT = driver.findElement(By.id("email"));
		userTxT.sendKeys("ramav660");
		
		//copy the data 
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"c");
		
		//paste the data
		
		driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"V");
		
		
		

	}

}

















