package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.BrowserHelper;

public class LIstBoxDemo extends BrowserHelper{
	public static void main(String[] args) throws InterruptedException {
		launch("chrome", "learn.letskodeit.com/p/practice");
		
//		locate the list box and store in a webelement reference
		WebElement fruitDD = driver.findElement(By.id("multiple-select-example"));
//		create Select class object
		Select fruitSelect = new Select(fruitDD);
		
//		isMultiple() return true if a select tag allows multiple selection
		if(fruitSelect.isMultiple()) {
//			select by index
			fruitSelect.selectByIndex(2);
			Thread.sleep(2000);
//			select by value attribute value
			fruitSelect.selectByValue("apple");
			Thread.sleep(2000);
		
//			getAllSelectedOption() : which will return a list of webelement which are selected option of 
//			list box or drop down list
			List<WebElement> allSelectedOptions = fruitSelect.getAllSelectedOptions();
			System.out.println("selected options are:");
			for(WebElement option : allSelectedOptions) {
				System.out.println(option.getText());
			}
			
			
//			select by visible text
			fruitSelect.selectByVisibleText("Orange");
			Thread.sleep(2000);
//			deSelectAll() deselects all selected options
//			fruitSelect.deselectAll();
			
//			deSelect an option based on index
			fruitSelect.deselectByIndex(0);
			Thread.sleep(2000);
//			deSelect an option based on value attribute value
			fruitSelect.deselectByValue("orange");
			Thread.sleep(2000);
//			deSelect an option based on visible text
			fruitSelect.deselectByVisibleText("Peach");
			Thread.sleep(2000);
		}else {
			fruitSelect.selectByVisibleText("Orange");
		}
		
//		getOptions() : returna list of WebElements which are options of list box or dropdown list
		List<WebElement> options = fruitSelect.getOptions();
		System.out.println("all options are: ");
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		driver.close();
	}
}
