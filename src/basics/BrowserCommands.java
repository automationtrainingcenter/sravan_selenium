package basics;

import java.io.File;

import utilities.BrowserHelper;

public class BrowserCommands extends BrowserHelper{
	public static void main(String[] args) {
		launch("chrome", "facebook.com");
		
//		getTitle() will return a string value which is title of the current web page launched
		System.out.println(driver.getTitle());
		
//		getCurrentUrl()  will return a string value which is url of the current page
		System.out.println("url is "+driver.getCurrentUrl());
		
//		getPageSource() will return a string value which is complete source code the current page
		String pageSource = driver.getPageSource();
		System.out.println(pageSource.contains("Sign Up"));
		
//		getWindowHandle() with return id of the current browser window
		System.out.println(driver.getWindowHandle());
		
//		getWindowHandles() will return ids of the all browser windows opened by driver instance
		System.out.println(driver.getWindowHandles().size());
		
//		close() will close the current browser window
		driver.close();
		
//		quit() will close all browser windows opened by driver instance
		driver.quit();
		
		
	}
}
