package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
	
		
		WebDriver driver4 = new ChromeDriver();
		driver4.get("http://www.adactin.com/HotelApp/");
		
		WebElement user3 =driver4.findElement(By.id("username"));
		user3.sendKeys("ramav660@gmail.com");
		String text4 = user3.getAttribute("value");
		System.out.println(text4);
		
		WebElement pass4 =driver4.findElement(By.id("password"));
		pass4.sendKeys("rama@1591");
		String text3 = pass4.getAttribute("value");
		
		System.out.println(text3);
		driver4.close();
	}

}
