package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import utilities.BrowserHelper;
/*To handle alerts Selenium provides Alert class with several methods
 * Steps to follow to handle alerts
 * 1. switch the driver focus to alert from web page using switchTo() of WebDriver interface
 * 	driver.switchTo().alert()
 * 2. to get the text of alert use getText() of Alert class
 * 3. to fill some value inside the alert text box use sendKeys() of Alert class
 * 4. to click on OK button of alert use accept() 
 * 5. to click on Cancel button of alert use dismiss()
 * 
 */
public class AlertsDemo extends BrowserHelper{
	public static void main(String[] args) throws InterruptedException {
		launch("chrome", "learn.letskodeit.com/p/practice");
//		locate button which will open alert and click on it
		driver.findElement(By.id("alertbtn")).click();
		
//		switch to alert using switchTo()
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
//		get the alert text and print on the console	
		System.out.println("alert came with alert text: "+alert.getText());
//		click on OK button of the alert
		alert.accept();
		Thread.sleep(2000);
		
//		locate button which will open confirm alert and click on it
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
//		switch the driver focus to alert
		Alert confirmAlert = driver.switchTo().alert();
//		get the alert text of confirm alert and print on the console
		System.out.println(confirmAlert.getText());
//		click on Cancel button of confirm alert
		confirmAlert.dismiss();
		
		Thread.sleep(2000);
		closeBrowser();
	}
}
