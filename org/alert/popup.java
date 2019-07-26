package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		//simple alert
		WebElement simalt =driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		simalt.click();
		Thread.sleep(5000);
		WebElement simple =driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simple.click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(5000);
		al.accept();
		//confirm alert
		WebElement con =driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		con.click();
		WebElement pop =driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		pop.click();
		Thread.sleep(5000);
		Alert alt = driver.switchTo().alert();
		Thread.sleep(5000);
		alt.dismiss();
		//prompt alert
		WebElement porm =driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		porm.click();
		Thread.sleep(5000);
		WebElement pormt =driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		pormt.click();
		Alert alrt = driver.switchTo().alert();
		Thread.sleep(5000);
		alrt.sendKeys("Rama");
		Thread.sleep(5000);
		alrt.dismiss();
		
		
		
		
		

	}

}
