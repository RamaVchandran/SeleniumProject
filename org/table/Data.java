package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.toolsqa.com/automation-practice-table/");
List <WebElement> tData = driver.findElements(By.tagName("td"));
for(int i=0;i<tData.size();i++) {
	WebElement data = tData.get(i);
	String text = data.getText();
	System.out.println(text);
}
		
	}

}
