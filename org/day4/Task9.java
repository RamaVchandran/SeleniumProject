package org.day4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		
		WebDriver driver5 = new ChromeDriver();
		driver5.get("https://www.shopclues.com/wholesale.html");
		driver5.manage().window().maximize();
		
		WebElement search =driver5.findElement(By.xpath("//input[@id='autocomplete']"));
		search.sendKeys("fasttrack watches");
		
		WebElement click =driver5.findElement(By.xpath("//a[text()='Search']"));
		click.click();
		
		WebElement add =driver5.findElement(By.xpath("//h2[text()='Fastrack Party Analog Black Dial Mens Watch - NE1474SM0']"));
		add.click();
		
		String pwid =driver5.getWindowHandle();
		System.out.println(pwid);
		
		Set<String> childwin = driver5.getWindowHandles();
		System.out.println(childwin);
		
		for (String x : childwin) {
			if(!pwid.equals(x)) {
				driver5.switchTo().window(x);
				System.out.println(x);
				Thread.sleep(5000);
				WebElement user5 =driver5.findElement(By.xpath("//button[@id='add_cart']"));
				user5.click();
				
				WebElement user6 =driver5.findElement(By.xpath("//span[@class='f_price']"));
				String price= user6.getText();
				System.out.println(price);
			}
			
		}
	
		driver5.close();
		

	}

}
