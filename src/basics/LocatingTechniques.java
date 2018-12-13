package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.BrowserHelper;
/*
 * To locate elements selenium provides 8 locating mechanisms in By class
 * id - id attribute value of the element tag
 * name - name attribute value of the element tag
 * link text - complete text in between opening and closing a(anchor) tag
 * partial link text - part of the text in between opening and closing a(anchor) tag
 * xpath - xml path
 * css selector - 
 * we can prepare xpath or css selector using any attribute value of the element tag
 * tag name - name of the element tag
 * class name - class attribute value
 * 
 * In WebDriver interface we have two methods which will locate the elements inside current page
 * using any one of the above locating mechanisms of By class
 * 
 * findElement(By arg) returns a WebElement interface reference if element located else it will throw 
 * NoSuchElementException
 * 
 * findElements(By arg) return a List of WebElement type objects if elements located else it will return a 
 * List of size zero
 */

public class LocatingTechniques extends BrowserHelper{
	public static void main(String[] args) {
		launch("chrome", "facebook.com");
		
//		id
		By usernameId = By.id("email");
		WebElement username = driver.findElement(usernameId);
		
//		name
		WebElement password = driver.findElement(By.name("pass"));
		
//		linkText
		WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgotten account?"));
		
//		partialLinkText
		WebElement whyDateOfBirthLink = driver.findElement(By.partialLinkText("date of birth"));
		
//		xpath
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value= '1']"));
		
//		css selector
		WebElement maleRadioButton = driver.findElement(By.cssSelector("input[value = '2']"));
		
//		tagName
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("number of the links in the page "+links.size());
		
//		class name
		List<WebElement> textfields = driver.findElements(By.className("inputtext"));
		System.out.println("number of text fields "+textfields.size());
		
		driver.close();
	}

}
