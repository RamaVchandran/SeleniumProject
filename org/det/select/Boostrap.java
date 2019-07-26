package org.det.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boostrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
		driver.manage().window().maximize();
		List <WebElement> li = driver.findElements(By.xpath("//div[@class='dropdown-menu'and @aria-labelledby='dropdownMenuButton']//a"));
		int size  = li.size();
		System.out.println(size);
		for (WebElement el : li) {
		String element = el.getText();
		System.out.println(element);
			
		}
	
		}
		

	

}

