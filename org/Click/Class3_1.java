package org.Click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		/*WebDriver locator =new ChromeDriver();
		locator.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		locator.manage().window().maximize();
		Thread.sleep(2000);
		WebElement userName2 =locator.findElement(By.xpath("(//a[@class='ng-star-inserted'])[2]"));
		userName2.click();
		WebElement password2 = locator.findElement(By.id("userName"));
		password2.sendKeys("Ramachandran");
		WebElement pass = locator.findElement(By.id("usrPwd"));
		pass.sendKeys("Rama@1591");
		WebElement pass1 = locator.findElement(By.id("cnfUsrPwd"));
		pass1.sendKeys("Rama@1591");
		WebElement ques = locator.findElement(By.id("month"));
		ques.sendKeys("2");
		WebElement month = locator.findElement(By.id("month"));
		month.sendKeys("july");
		WebElement year = locator.findElement(By.id("year"));
		year.sendKeys("1991");
		WebElement gender = locator.findElement(By.xpath("//input[@value='2']"));
		gender.click();
		locator.close();*/
		
		WebDriver locator2 =new ChromeDriver();
		locator2.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		Thread.sleep(3000);
		locator2.manage().window().maximize();
		Thread.sleep(2000);
		WebElement userName3 =locator2.findElement(By.name("email"));
		userName3.sendKeys("ramac660@gmail.com");
		WebElement password4 = locator2.findElement(By.name("password"));
		password4.sendKeys("new@123");
		WebElement mob1 = locator2.findElement(By.name("mobile"));
		mob1.sendKeys("9003209516");
		WebElement pass2 = locator2.findElement(By.name("gender"));
		pass2.click();
		locator2.close();
		
		WebDriver locator3 =new ChromeDriver();
		locator3.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
		Thread.sleep(3000);
		locator3.manage().window().maximize();
		Thread.sleep(2000);
		WebElement userName4 =locator3.findElement(By.id("navbar_username"));
		userName4.sendKeys("ramac660@gmail.com");
		WebElement password5 = locator3.findElement(By.id("navbar_password"));
		password5.sendKeys("new@123");
		WebElement pass3 = locator3.findElement(By.xpath("//input[@name='cookieuser']"));
		pass3.click();
		WebElement pass4 = locator3.findElement(By.xpath("//input[@value='Log in']"));
		pass4.click();
		locator3.close();
		
		WebDriver locator4 =new ChromeDriver();
		locator4.get("https://www.swiggy.com/");
		Thread.sleep(3000);
		locator4.manage().window().maximize();
		Thread.sleep(2000);
		WebElement userName6 =locator4.findElement(By.xpath("//a[@class='r2iyh']"));
		userName6.click();
		WebElement userName5 =locator4.findElement(By.xpath("//a[@tabindex='1']"));
		userName5.sendKeys("9003209516");
		WebElement password6 = locator4.findElement(By.id("navbar_password"));
		password6.sendKeys("new@123");
		WebElement pass6 = locator4.findElement(By.xpath("//input[@name='cookieuser']"));
		pass6.click();
		WebElement pass5 = locator4.findElement(By.xpath("//input[@value='Log in']"));
		pass5.click();
		locator4.close();

	}

}
