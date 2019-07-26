package org.act;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acttwo {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		Actions acc=new Actions(driver);
		acc.keyDown(login,Keys.SHIFT).sendKeys(login,"ramachandran").keyUp(login, Keys.SHIFT).perform();
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		//driver.findElement(By.xpath("//input[@type='password']"));
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);

	}

}
