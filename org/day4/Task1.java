package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		Thread.sleep(5000);
		WebElement User = driver.findElement(By.xpath("//h2[contains(text(),'Overall ')]"));
		String text= User.getText();
		System.out.println(text);
		driver.close();
		
		
		
	
	}

}
