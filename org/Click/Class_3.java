package org.Click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_3 {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver locator =new ChromeDriver();
		//greenstechnology
		locator.get("http://www.greenstechnologys.com/contact.php");
		WebElement Name =locator.findElement(By.name("name"));
		Name.sendKeys("Ramachandrn V");
		WebElement email = locator.findElement(By.id("InputEmail1"));
		email.sendKeys("ramac660@gmail.com");
		WebElement mobile = locator.findElement(By.id("InputSubject"));
		mobile.sendKeys("9003209516");
		WebElement course = locator.findElement(By.name("courses"));
		course.sendKeys("Selenium");
		WebElement branch =locator.findElement(By.name("branch"));
		branch.sendKeys("OMR");
		WebElement time = locator.findElement(By.name("time"));
		time.sendKeys("Immediately");
		WebElement message = locator.findElement(By.name("comments"));
		message.sendKeys("Hi all");
		Thread.sleep(5000);
		locator.close();
		
		//facebook
		WebDriver locator1 =new ChromeDriver();
		locator1.get("https://www.facebook.com/");
		WebElement userName1 =locator1.findElement(By.xpath("//input[@name='email']"));
		userName1.sendKeys("ramac660@gamil.com");
		WebElement password1 = locator1.findElement(By.xpath("//input[@name='pass']"));
		password1.sendKeys("Rama@1591");
		WebElement click = locator1.findElement(By.xpath("//input[@value='Log In']"));
		click.click();
		locator1.close();
		
		//toolsqa
		WebDriver locator2 =new ChromeDriver();
		locator2.get("https://www.toolsqa.com/contacts-us/");
		WebElement Name1 =locator2.findElement(By.name("your-name"));
		Name1.sendKeys("Ramachandrn V");
		WebElement email2 = locator2.findElement(By.name("your-email"));
		email2.sendKeys("ramac660@gmail.com");
		WebElement mobile1 = locator2.findElement(By.xpath("//input[@name='your-mobile']"));
		mobile1.sendKeys("9003209516");
		WebElement course1 = locator2.findElement(By.xpath("//input[@name='your-city']"));
		course1.sendKeys("Chennai");
		WebElement branch1 =locator2.findElement(By.xpath("//input[@name='your-country']"));
		branch1.sendKeys("India");
		WebElement time1 = locator2.findElement(By.xpath("//input[@name='your-company']"));
		time1.sendKeys("cts");
		WebElement message1 = locator2.findElement(By.xpath("//textarea[@name='your-message']"));
		message1.sendKeys("Hi all");
		Thread.sleep(5000);
		locator2.close();
		
		//greentech click the link
		WebDriver locator6 =new ChromeDriver();
		locator6.get("http://greenstech.in/selenium-course-content.html");
		WebElement userName5 =locator6.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']"));
		userName5.click();
		locator6.close();
		
		//redbus tooltip UI and goes to OTP
		/*WebDriver locator4 =new ChromeDriver();
		locator4.get("https://www.redbus.in/");
		WebElement Name2 =locator4.findElement(By.xpath("//i[@id='i-icon-profile']"));
		Name2.click();
		WebElement email3 = locator4.findElement(By.xpath("//li[@id='signInLink']"));
		email3.click();
		WebElement mobile2 = locator4.findElement(By.xpath("//input[@name='your-mobile']"));
		mobile2.sendKeys("9003209516");
		WebElement course2 = locator4.findElement(By.xpath("//input[@name='your-city']"));
		course2.sendKeys("Chennai");
		WebElement branch2 =locator4.findElement(By.xpath("//input[@name='your-country']"));
		branch2.sendKeys("India");
		WebElement time2 = locator2.findElement(By.xpath("//input[@name='your-company']"));
		time2.sendKeys("cts");
		WebElement message2 = locator2.findElement(By.xpath("//textarea[@name='your-message']"));
		message2.sendKeys("Hi all");
		Thread.sleep(5000);
		locator2.close();*/
		
		//greentech click the link//greentech click the link
		WebDriver locator5 =new ChromeDriver();
		locator5.get("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(3000);
		locator5.manage().window().maximize();
		WebElement userName4 =locator5.findElement(By.xpath("//a[@href='http://traininginchennai.in/core%20java%20material.pdf']"));
		userName4.click();
		locator5.close();
		
		//facebook
		WebDriver locator3 =new ChromeDriver();
		locator3.get("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement userName2 =locator3.findElement(By.name("firstname"));
		userName2.sendKeys("Ramachandran");
		WebElement password2 = locator3.findElement(By.name("lastname"));
		password2.sendKeys("venugopal");
		WebElement mob = locator3.findElement(By.name("reg_email__"));
		mob.sendKeys("9003209516");
		WebElement pass1 = locator3.findElement(By.name("reg_passwd__"));
		pass1.sendKeys("24568");
		WebElement day = locator3.findElement(By.id("day"));
		day.sendKeys("2");
		WebElement month = locator3.findElement(By.id("month"));
		month.sendKeys("july");
		WebElement year = locator3.findElement(By.id("year"));
		year.sendKeys("1991");
		WebElement gender = locator3.findElement(By.xpath("//input[@value='2']"));
		gender.click();
		locator3.close();
}
}
