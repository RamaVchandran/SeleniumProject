package org.day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskmis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("chrome.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/index.html");
		

	}

}
