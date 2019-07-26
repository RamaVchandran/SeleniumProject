package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver6 = new ChromeDriver();
		driver6.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement user3 =driver6.findElement(By.xpath("//input[@aria-label='First name']"));
		user3.sendKeys("Rama");
		String text4 = user3.getAttribute("value");
		System.out.println(text4);
		WebElement pass4 =driver6.findElement(By.xpath("//input[@aria-label='Last name']"));
		pass4.sendKeys("chandran");
		String text3 = pass4.getAttribute("value");
		System.out.println(text3);
		WebElement pass5 =driver6.findElement(By.xpath("//input[@aria-label='Username']"));
		pass5.sendKeys("ramac660@gmail.com");
		String text5 = pass5.getAttribute("value");
		System.out.println(text5);
		WebElement pass6 =driver6.findElement(By.xpath("//input[@aria-label='Password']"));
		pass6.sendKeys("rama@1591");
		String text6 = pass6.getAttribute("value");
		System.out.println(text6);
		WebElement pass7 =driver6.findElement(By.xpath("//input[@aria-label='Confirm']"));
		pass7.sendKeys("rama@1591");
		String text7 = pass7.getAttribute("value");
		System.out.println(text7);
		driver6.close();
		
	}

}
