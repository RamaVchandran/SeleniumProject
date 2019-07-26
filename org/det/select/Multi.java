package org.det.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//select[@ id='fruits']"));
		Select s = new Select(ele);
		s.isMultiple();
		s.selectByValue("orange");
		s.selectByIndex(1);
		s.selectByVisibleText("Grape");
		
		//deselect
		s.deselectByValue("orange");
		s.deselectByIndex(1);
		System.out.println(s.getFirstSelectedOption().getText());
		
		List<WebElement> li= driver.findElements(By.xpath("//select[@ id='fruits']"));
		int size = li.size();
		for (WebElement x : li) {
			x.getText().contains("orange");
			String str = x.getText();
			System.out.println(str);
			
			
		}
		
		
		
		
	}

}
