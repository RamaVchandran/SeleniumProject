package org.det.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		WebElement com = driver.findElement(By.id("dcdrLocation"));
		Select s = new Select(com);
		List<WebElement> li = s.getOptions();
		li.size();
		for(int i=0; i<li.size();i++) {
			WebElement evennum =  li.get(i);
			String drop = evennum.getText();
			System.out.println(drop);
		
	}

}
}