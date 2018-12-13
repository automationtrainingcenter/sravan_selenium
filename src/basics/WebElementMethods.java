package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.BrowserHelper;

public class WebElementMethods extends BrowserHelper{
	public static void main(String[] args) throws InterruptedException {
		launch("chrome", "facebook.com");
		
//		locate first name field
		WebElement firstName = driver.findElement(By.name("firstname"));
		
//		locate Forgotten account link
		WebElement forgottenAccount = driver.findElement(By.linkText("Forgotten account?"));
		
		/*sendKeys() : can be used on text fields and text area it accepts String argument which
		 * is data we want to enter in text fields.
		 */
		firstName.sendKeys("sravan");
		Thread.sleep(2000);
		
		/*clear() : it will clear the data which is already present in text field or text area*/
		firstName.clear();
		Thread.sleep(2000);
		
		/*click() : can be used on any element on the page*/
//		locate sign up button and click on it
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
		
//		locate male radio button and click on it
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(2000);
		
//		click on forgotten account link
//		forgottenAccount.click();
		Thread.sleep(2000);
		
		/*getAttribute() : it accepts a string argument which is name of the attribute and it returns 
		 * value of that given attribute*/
		String attrValue = firstName.getAttribute("aria-label");
		System.out.println("attribute value is "+attrValue);
		
		/*cssValue() : it accepts a string argument which is name of the css property and it return that
		 * property value
		 */
		String borderRadius = firstName.getCssValue("border-radius");
		System.out.println("border radius of text fields is "+borderRadius);
		
		/*getText() : it will return the inner text (text in between opening and closing tag) of element */
		String signUpText = driver.findElement(By.name("websubmit")).getText();
		System.out.println("inner text of sign up button is " +signUpText);
		System.out.println("inner text of forgotten account link is "+forgottenAccount.getText());
		
		/*getLocation() : it will return Point class object which is x and y coordinate values
		 * of the element from top left corner of the browser window
		 */
		Point forgottenAccountLoc = forgottenAccount.getLocation();
		System.out.println("x = "+forgottenAccountLoc.getX()+" y = "+forgottenAccountLoc.getY());
		
		/*getSize() : it will return Dimension class object which is height and width of the element*/
		Dimension firstNameSize = firstName.getSize();
		System.out.println("height = "+firstNameSize.getHeight()+" width = "+firstNameSize.getWidth());
		
		/*getTagName() : it will return tag name of the given element*/
		System.out.println("tag name of the first name field is "+firstName.getTagName());
		
		/*isDisplayed() : can be used on any element it will return true if element is present in the page*/
		System.out.println("first name fields is visible "+firstName.isDisplayed());
		System.out.println("confirm email field is visible "+driver.findElement(By.name("reg_email_confirmation__")).isDisplayed());
		
		/*isSelected() : can be used on list box, drop down list options, radio buttons and check boxes it will return true if given option 
		 * is selected */
		Select yearSelect = new Select(driver.findElement(By.id("year")));
		yearSelect.selectByVisibleText("1994");
		System.out.println("1994 selected "+driver.findElement(By.xpath("//option[text()='1994']")).isSelected());
		
		/*isEnabled() : can be used on any element it will return true if an element is enabled*/
		System.out.println("first name is enabled "+firstName.isEnabled());
		
		/*submit() : it will submit a form to the server*/
//		locate password field in login form and submit the form
		driver.findElement(By.id("pass")).submit();
		
		closeBrowser();
		
	}

}
