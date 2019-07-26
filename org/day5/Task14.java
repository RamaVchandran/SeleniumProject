package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		
		WebElement mouse = driver.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouse).perform();
		
		WebElement mouseSec = driver.findElement(By.xpath("//span[text()='New Launches Covers']"));
		act.moveToElement(mouseSec).perform();
		
		Thread.sleep(3000);
		mouseSec.click();
		driver.quit();

	}

}
