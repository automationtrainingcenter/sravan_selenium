package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		navigate to a website using Navigation inteface
		driver.navigate().to("http://www.google.com");
		Thread.sleep(2000);
//		navigate to back 
		driver.navigate().back();
		Thread.sleep(2000);
//		navigate forward
		driver.navigate().forward();
		Thread.sleep(2000);
//		refresh the page
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
	}
}

