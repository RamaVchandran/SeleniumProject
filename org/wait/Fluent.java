package org.wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		Wait w = new FluentWait (driver).withTimeout(500, TimeUnit.SECONDS).pollingEvery(10,TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);		
		WebElement element =(WebElement) w.until(ExpectedConditions.elementToBeClickable(By.id("loginbutton")));
		element.click();
		
	
	}

}
