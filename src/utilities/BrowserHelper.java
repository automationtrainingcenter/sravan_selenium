package utilities;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserHelper {
	public static WebDriver driver;
	
	public static String getFilePath(String folderName, String fileName) {
		return System.getProperty("user.dir")+File.separator+folderName+File.separator+fileName;
	}

	public static void launch(String browserName, String url) {
		browserName = browserName.toLowerCase();
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", getFilePath("drivers", "chromedriver.exe"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", getFilePath("drivers", "geckodriver.exe"));
			driver = new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("browser name not matched");
		}
		driver.get("http://www."+url);
	}
	
	public static void closeBrowser() {
		if(driver.getWindowHandles().size()>1) {
			driver.quit();
		}else {
			driver.close();
		}
	}

}
