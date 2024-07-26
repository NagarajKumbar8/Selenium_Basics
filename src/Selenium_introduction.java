import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_introduction {

	public static void main(String[] args) {
		
		//invoking Browser
		// Selenium manager - automatically download the compatible web driver and run
		//System.setProperty("WebDriver.chrome.driver", "Path")
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		//driver.close(); close only current page/browser
		driver.quit(); // closes all the associated windows 
	}

}
