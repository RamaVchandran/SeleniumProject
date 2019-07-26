package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		
		WebDriver driver3 =new ChromeDriver();
		driver3.get("https://www.google.com/");
		WebElement user2 = driver3.findElement(By.xpath("//input[@maxlength='2048']"));
		user2.sendKeys("greens velmurugan");
		WebElement pass3= driver3.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		pass3.click();
		WebElement link = driver3.findElement(By.xpath("//h3[contains(text(),'Technologys')]"));
		link.click();
		driver3.close();
}
}
