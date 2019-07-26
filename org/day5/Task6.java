package org.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task6 {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		
		WebElement sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions act = new Actions(driver);
		act.moveToElement(sports).perform();
		
		WebElement gain= driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		gain.click();
		
		String pwid =driver.getWindowHandle();
		System.out.println(pwid);
		
		Set<String> s =driver.getWindowHandles();
		System.out.println(s);
		
		List<String> li = new ArrayList<>();
			li.addAll(s);
					
					driver.switchTo().window(li.get(1));
				
				Thread.sleep(5000);
				WebElement prod = driver.findElement(By.xpath("//img[@src='https://cdn.shopclues.com/images/thumbnails/55281/320/1/a1489602378.jpg']"));
				prod.click();
				
				
					driver.switchTo().window(li.get(2));
					
				
					WebElement cart = driver.findElement(By.xpath("//button[@id='add_cart']"));  
					cart.click();
					
					WebElement price = driver.findElement(By.xpath("//span[@class='f_price']"));
					String box = price.getText();
					System.out.println(box);
				
				
				
			}
			
		
		

}





