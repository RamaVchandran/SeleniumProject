package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.facebook.com/");
		WebElement user1 =driver2.findElement(By.xpath("//input[@data-testid='royal_email']"));
		user1.sendKeys("ramav660@gmail.com");
		String text1 = user1.getAttribute("value");
		System.out.println(text1);
		WebElement pass2 =driver2.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		pass2.sendKeys("rama@1591");
		String text2 = pass2.getAttribute("value");
		System.out.println(text2);
		driver2.close();

	}

}
