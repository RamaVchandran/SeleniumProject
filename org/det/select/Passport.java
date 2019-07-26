package org.det.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Passport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		WebElement com = driver.findElement(By.id("dcdrLocation"));
		Select s = new Select(com);
		s.selectByVisibleText("Chennai");
		WebElement txtbox = driver.findElement(By.xpath("//input[@name='givenName']"));
		txtbox.sendKeys("Ramachandran");
		WebElement surName = driver.findElement(By.xpath("//input[@name='surname']"));
		surName.sendKeys("V");
		WebElement dob = driver.findElement(By.xpath("//input[@name='dob']"));
		dob.sendKeys("04-03-2019");
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("ramac660@gmail.com");
		
		
		
		
		
	}

}
