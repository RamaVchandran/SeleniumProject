package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Types {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver locator =new ChromeDriver();
		locator.get("https://www.facebook.com/");
		WebElement userName =locator.findElement(By.id("email"));
		userName.sendKeys("ramac660@gamil.com");
		WebElement password = locator.findElement(By.name("pass"));
		password.sendKeys("Rama@1591");
		locator.close();
		
		WebDriver locator1 =new ChromeDriver();
		locator1.get("https://www.redbus.in/");
		WebElement from =locator1.findElement(By.id("src"));
		from.sendKeys("Chennai");
		WebElement to = locator1.findElement(By.id("dest"));
		to.sendKeys("madurai");
		locator1.close();
		
		WebDriver locator2 =new ChromeDriver();
		locator2.get("https://twitter.com/login");
		WebElement username1 =locator2.findElement(By.xpath("(//input[@type='text'])[2]"));
		username1.sendKeys("ashwingowtham10@gmail.com");
		WebElement password2 = locator2.findElement(By.xpath("(//input[@type='password'])[2]"));
		password2.sendKeys("123456");
		locator2.close();
		
		//hdfc cant able use the xpath
		/*WebDriver locator3 =new ChromeDriver();
		locator3.get("https://netbanking.hdfcbank.com/netbanking/");
		WebElement username2 =locator3.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		username2.sendKeys("ashwingowtham10@gmail.com");
		WebElement password3 = locator2.findElement(By.xpath("//td[@width='400']"));
		password3.click();		
		locator3.quit();*/
		
		//cant able to access the tags
		/*WebDriver locator4 =new ChromeDriver();
		locator4.get("https://www.lvbankonline.in/index.html?module=login");
		WebElement username2 =locator2.findElement(By.xpath("(//input[@type='text'])[2]"));
		username2.sendKeys("ashwingowtham10@gmail.com");
		WebElement password3 = locator2.findElement(By.xpath("(//input[@type='password'])[2]"));
		password3.sendKeys("123456");
		locator4.quit();*/
		
		WebDriver locator4 =new ChromeDriver();
		locator4.get("https://www.swiggy.com/");
		WebElement location =locator4.findElement(By.xpath("//input[@type='text']"));
		location.sendKeys("Annanagar");
		locator4.close();
		
		WebDriver locator5 =new ChromeDriver();
		locator5.get("https://www.snapdeal.com/login");
		WebElement username3 =locator5.findElement(By.xpath("//input[@name='username']"));
		username3.sendKeys("9003209516");
		WebElement button = locator5.findElement(By.xpath("//button[@id='checkUser']"));
		button.click();
		Thread.sleep(1000);
		WebElement email = locator5.findElement(By.xpath("//input[@id='j_username_new']"));
		email.sendKeys("ramav660@gmail.com");
		WebElement name = locator5.findElement(By.xpath("//input[@name='j_name']"));
		name.sendKeys("Ramachandran");
		WebElement DOB = locator5.findElement(By.xpath("//input[@id='j_dob']"));
		DOB.sendKeys("01/07/2019");
		WebElement pass = locator5.findElement(By.xpath("//input[@id='j_password']"));
		pass.sendKeys("ramachandran");
		locator5.close();
		

		WebDriver locator6 =new ChromeDriver();
		locator6.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
		Thread.sleep(2000);
		WebElement username4 =locator6.findElement(By.xpath("//input[@name='username']"));
		username4.sendKeys("9003209516");
		WebElement password4 = locator6.findElement(By.xpath("//input[@name='password']"));
		password4.sendKeys("356565666666");
		locator6.close();
		
		WebDriver locator7 =new ChromeDriver();
		locator7.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		WebElement username5 =locator6.findElement(By.xpath("(//input[@type='text'])[1]"));
		username5.sendKeys("9003209516");
		locator7.quit();
		
		
		
		
	}

}
