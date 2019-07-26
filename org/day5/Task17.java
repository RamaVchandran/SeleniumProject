package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task17 {

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
		
		Thread.sleep(5000);
		WebElement alAccount= driver.findElement(By.xpath("//a[@class='a-link-emphasis']"));
		alAccount.click();
		
		WebElement user = driver.findElement(By.id("ap_email"));
		user.sendKeys("ramav660@gmail.com");
		
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("Rama@1591");
		
		WebElement log = driver.findElement(By.id("signInSubmit"));
		log.click();
		
		driver.quit();
		

	}

}
