package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task19 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sprint.com/");
		driver.manage().window().maximize();
		
		WebElement User = driver.findElement(By.xpath("//span[text()='My Sprint']"));
		Actions act = new Actions(driver);
		act.moveToElement(User).perform();
		
		Thread.sleep(5000);
		WebElement mouseTwo = driver.findElement(By.xpath("(//a[@href='/en/my-sprint/payment-center.html?INTNAV=TopNav:MyS:Paybill#/make-a-payment'])[2]"));
		mouseTwo.click();
		
		driver.quit();
	}

}
