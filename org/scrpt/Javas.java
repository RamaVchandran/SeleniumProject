package org.scrpt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement Scr =driver.findElement(By.xpath("//span[text()='+91- 8148772629']"));
		WebElement up = driver.findElement(By.xpath("//font[text()='GREENS TECHNOLOGY']"));
		
		JavascriptExecutor jk = (JavascriptExecutor)driver;
		Thread.sleep(5000);
		jk.executeScript("arguments[0].scrollIntoView(true);", Scr);
		Thread.sleep(4000);
		jk.executeScript("arguments[0].scrollIntoView(false);", up);
		
		Thread.sleep(2000);
		jk.executeScript("window.scrollBy(0,1500)");
		
		Thread.sleep(1500);
		jk.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
    }
		
	}


