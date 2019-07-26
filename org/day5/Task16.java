package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		

		WebElement mouse = driver.findElement(By.xpath("(//span[text()='Account & Lists'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(mouse).perform();
		
		Thread.sleep(5000);
		WebElement sign = driver.findElement(By.xpath("(//a[@rel='nofollow'])[2]"));
		sign.click();
		
		WebElement userName= driver.findElement(By.id("ap_customer_name"));
		userName.sendKeys("Ramachandran");
		
		WebElement mobileNo= driver.findElement(By.id("ap_phone_number"));
		mobileNo.sendKeys("9003209516");

		WebElement mail= driver.findElement(By.id("ap_email"));
		mail.sendKeys("ramac660@gmail.com");
		
		WebElement pass= driver.findElement(By.id("ap_password"));
		pass.sendKeys("9003209516");
		
		driver.quit();
	}

}
