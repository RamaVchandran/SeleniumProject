package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// configure Driver
		
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		//launch webpage
		Thread.sleep(5000);
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		Thread.sleep(4000);
		
		WebElement popup = driver.findElement(By.xpath("//button[@class='close']"));
		popup.click();
		
		WebElement User1 = driver.findElement(By.xpath("//*[@id=\"article-wrapper\"]/p[4]/text()[2]"));
		Actions acc = new Actions(driver);
		acc.click().doubleClick(User1).doubleClick(User1).perform();
		String text1= User1.getText();
		
		System.out.println(text1);
		driver.close();

	}

}
