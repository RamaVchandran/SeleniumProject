package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Row {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> tRow =  driver.findElements(By.tagName("tr"));
		for(int i=0;i<tRow.size();i++) {
			WebElement row = tRow.get(i);
			List<WebElement> tData= row.findElements(By.tagName("td"));
			for(int j=0;j<tData.size();j++) {
				WebElement data = tData.get(j);
				String text = data.getText();
				System.out.println(text);
			}
		}
	}

}
