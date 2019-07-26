package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		driver.manage().window().maximize();
		
		WebElement edit = driver.findElement(By.xpath("(//a[text()='EDITORIAL'])[2]"));
		edit.click();
		
		WebElement enter= driver.findElement(By.xpath("//a[text()='Entertainment']"));
		enter.click();
		driver.quit();
		
		

	}

}
