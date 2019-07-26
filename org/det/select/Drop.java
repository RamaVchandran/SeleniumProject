package org.det.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gettyimages.in/editorial-images");
		WebElement element =driver.findElement(By.xpath("//div[@class='header-search-bar__media-filter']"));
		element.click();
		WebElement click = driver.findElement(By.xpath("//label[text()='Video']"));
		click.click();
		
		
		

	
		

	}

}
