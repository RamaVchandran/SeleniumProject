package org.day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/webhp");
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		WebElement butNon=	driver.findElement(By.xpath("//div[@class='gb_Hf']"));
		butNon.click();
		
		WebElement img=	driver.findElement(By.xpath("//span[text()='Gmail']"));
		img.click();

	}

}

