package org.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Time {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		
		WebElement btN=driver.findElement(By.id("loginbutton"));
		WebElement name=driver.findElement(By.name("firstname"));
		name.sendKeys("rama");
		String txt = name.getText();
		System.out.println(txt);
		btN.click();
	}

}
