package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sprint.com/");
		driver.manage().window().maximize();
		
		WebElement User = driver.findElement(By.xpath("(//span[text()='Shop Plans'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(User).perform();
		
		Thread.sleep(5000);
		WebElement mouseTwo = driver.findElement(By.xpath("(//a[@href='/en/shop/plans/unlimited-cell-phone-plan.html?INTNAV=TopNav:Shop:UnlimitedPlans'])[1]"));
		mouseTwo.click();
		
		driver.quit();
	}

}
