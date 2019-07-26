import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumbasic {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browser = scr.nextLine();
		WebDriver driver = null;
		if(browser.equals("Firefox")) {
			
			System.setProperty("webdriver.gecko.diver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();	
		}	
		
		
		if(browser.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
		}
				
		
			else {
				System.out.println("Invalid browser");
			}
		
		
		
	}
}
	


