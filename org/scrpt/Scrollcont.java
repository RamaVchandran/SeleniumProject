package org.scrpt;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollcont {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/infinite_scroll");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(5000);
		long intialHeight = (long) (js.executeScript("return document.body.scrollHeight"));
		
		while(true) {
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			long currentHeight = (long) (js.executeScript("return document.body.scrollHeight"));
			if(intialHeight ==currentHeight) {
				break;
			}
			
			intialHeight=currentHeight;
		}
		
		
	}

}
