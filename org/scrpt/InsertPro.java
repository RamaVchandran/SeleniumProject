package org.scrpt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.adactin.com/HotelApp/");
		WebElement userName = driver.findElement(By.id("username"));
		WebElement pass= driver.findElement(By.id("password"));
		WebElement but = driver.findElement(By.id("login"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Ramachandran15')",userName);
		js.executeScript("arguments[0].setAttribute('value','Rama#1591')",pass);
		Object obj = js.executeScript("return arguments[0].getAttribute('value')", userName);
		String txt = (String) obj;
		System.out.println(txt);
		js.executeScript("arguments[0].click()",but);
		
		

	}

}
