package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
//		to launch any browser we have to create an object of that browser driver class by providing driver 
//		executable path
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwares\\drivers\\geckodriver.exe");
		FirefoxDriver fobj = new FirefoxDriver();
//		navigate to a url using get()
		fobj.get("http://www.google.com");

		
//		to launch Chrome browser create an object of ChromeDriver class
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\softwares\\drivers\\chromedriver.exe");
		ChromeDriver cObj = new ChromeDriver();
		cObj.get("http://facebook.com");
		
	}

}
