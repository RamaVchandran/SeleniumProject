package org.day4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		
		WebDriver driver5 = new ChromeDriver();
		driver5.get("https://www.snapdeal.com/");
		driver5.manage().window().maximize();
		WebElement user3 =driver5.findElement(By.id("inputValEnter"));
		user3.sendKeys("shirt");
		WebElement pass4 =driver5.findElement(By.xpath("//span[text()='Search']"));
		pass4.click();
		WebElement user4 =driver5.findElement(By.xpath("(//p[@title='Routeen 100 Percent Cotton Shirt'])[1]"));
		user4.click();
		
		String pwid = driver5.getWindowHandle();
		System.out.println(pwid);
		
		Set<String> childWind = driver5.getWindowHandles();
		System.out.println(childWind);
		
		for (String x : childWind) {
			if(!pwid.equals(x)) {
				driver5.switchTo().window(x);

				Thread.sleep(3000);
				WebElement user5 =driver5.findElement(By.xpath("//div[@id='add-cart-button-id']"));
				user5.click();
				
				WebElement user6 =driver5.findElement(By.xpath("//div[text()='You Pay: ']"));
				String price= user6.getText();
				System.out.println(price);
				
				
			}
			
		}
		
		driver5.quit();

	}

}
