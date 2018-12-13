package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.BrowserHelper;

/*
 * To work with drop down list or list box selenium provides Select class
 * In this Select class we have several method which help us to select and de-select the options
 */
public class DropDownListDemo extends BrowserHelper{
	public static void main(String[] args) throws InterruptedException {
		launch("chrome", "facebook.com");
		
//		locate the drop down list and store in a variable
		WebElement dayDD = driver.findElement(By.id("day"));
//		create a Select class object by passing a web element which is drop down list or list box you want to select
		Select daySelect = new Select(dayDD);
//		get default selected option
		System.out.println("default day is "+daySelect.getFirstSelectedOption().getText());
//		selectByValue() : which will an option based on value attribute value
		daySelect.selectByValue("21");
		Thread.sleep(2000);
		
//		select month
		WebElement monthDD = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDD);
		System.out.println("default month is "+monthSelect.getFirstSelectedOption().getText());
//		selectByIndex() : select an optin based on index value of the option and index starts with 0
		monthSelect.selectByIndex(5);
		Thread.sleep(2000);
		
//		select year
		Select yearSelect = new Select(driver.findElement(By.id("year")));
//		get the default selected year
		System.out.println("default year is "+yearSelect.getFirstSelectedOption().getText());
		
//		selectByVisibleText() : select an option based on inner text of the option tag
		yearSelect.selectByVisibleText("1996");
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
