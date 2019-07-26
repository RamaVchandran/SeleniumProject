package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver7 = new ChromeDriver();
		driver7.get("https://www.flipkart.com/");
		WebElement user = driver7.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		user.sendKeys("ramac660@gmail.com");
		WebElement pass= driver7.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		pass.sendKeys("Rama@1591");
		
		WebElement sub = driver7.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
		sub.click();
		WebElement user4 =driver7.findElement(By.xpath("//span[text()='Electronics']"));
		String elec = user4.getText();
		System.out.println(elec);
		WebElement tv =driver7.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		String tv1 = tv.getText();
		System.out.println(tv1);
		WebElement men =driver7.findElement(By.xpath("//span[text()='Men']"));
		String men1 = men.getText();
		System.out.println(men1);
		WebElement women2 =driver7.findElement(By.xpath("//span[text()='Women']"));
		String baby =  women2.getText();
		System.out.println(baby);
		WebElement home =driver7.findElement(By.xpath("//span[text()='Baby & Kids']"));
		String home1 = home.getText();
		System.out.println(home1);
		driver7.close();
		
	}

}
