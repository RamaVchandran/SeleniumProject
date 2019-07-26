package org.Browserlaunch;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {
	
	public static void main(String[] args) throws InterruptedException {
		//configure the browser
		System.setProperty("webdriver.ie.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		//Launch the gmail browser
		driver.get("https://accounts.google.com/servicelogin/signinchooser?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//find current url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//find the title
		String ti = driver.getTitle();
		System.out.println(ti);
		//quit browser
		driver.quit();
		
		//Launch the filpkart browser
		WebDriver driver1 = new InternetExplorerDriver();
		driver1.get("https://demoqa.com/");
		//find current url
		String url1 = driver1.getCurrentUrl();
		System.out.println(url1);
		//find the title
		String t2 = driver1.getTitle();
		System.out.println(t2);
		//quit browser
		driver1.quit();
		
		// Launch Greens technology
		WebDriver driver2 = new InternetExplorerDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		Alert alert = driver2.switchTo().alert();
		alert.dismiss();
		//find current url
		String url2 = driver2.getCurrentUrl();
		System.out.println(url2);
		//find the title
		String t3 = driver2.getTitle();
		System.out.println(t3);
		//quit browser
		driver2.quit();
	}				

}
