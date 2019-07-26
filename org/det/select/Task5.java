package org.det.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement com = driver.findElement(By.id("selenium_commands"));
		Select s = new Select(com);
		List<WebElement> li = s.getOptions();
		li.size();
		for(int i=0; i<li.size();i++) {
			WebElement evennum =  li.get(i);
			String drop = evennum.getAttribute("value");
			System.out.println(drop);
			}
			
		for(int i=0; i<li.size();i++) {
			WebElement txt = li.get(i);
			String down = txt.getText();
			System.out.println(down);
		}
			driver.quit();
	}
		
	
		
		
	}
		

	


