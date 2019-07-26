package org.Browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	
	public static void main(String[] args) throws InterruptedException {
		//configure the browser
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launch the gmail browser
		driver.get("https://accounts.google.com/servicelogin/signinchooser?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//find current url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//find the title
		String ti = driver.getTitle();
		System.out.println(ti);
		//close browser
		driver.close();
		
		//Launch the filpkart 
		WebDriver driver1 = new ChromeDriver();
		Thread.sleep(3000);
		driver1.get("https://www.flipkart.com/");
		//find current url
		String url1 = driver1.getCurrentUrl();
		System.out.println(url1);
		//find the title
		String t2 = driver1.getTitle();
		System.out.println(t2);
		//close browser
		driver1.quit();
		
		// Launch Greens technology
		WebDriver driver2 = new ChromeDriver();
		Thread.sleep(3000);
		driver2.get("http://greenstech.in/selenium-course-content.html");
		//find current url
		String url2 = driver2.getCurrentUrl();
		System.out.println(url2);
		//find the title
		String t3 = driver2.getTitle();
		System.out.println(t3);
		//close browser
		driver2.quit();
		
				
		
	}

}
