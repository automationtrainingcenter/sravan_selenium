package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Window;

import utilities.BrowserHelper;

public class BrowserManageMethods extends BrowserHelper {
	public static void main(String[] args) throws InterruptedException {
		launch("chrome", "google.com");
		Window window = driver.manage().window();

//		get size of the browser window
		Dimension d = window.getSize();
		System.out.println("height of window is " + d.getHeight());
		System.out.println("width of browser window is " + d.getWidth());
		Thread.sleep(2000);

//		set size of the browser window
		Dimension dim = new Dimension(500, 500);
		window.setSize(dim);

//		get the position of browser window
		Point position = window.getPosition();
		System.out.println("window distance from x axis " + position.getX());
		System.out.println("window distance from y axis " + position.getY());

//		set the position of the browser window
		window.setPosition(new Point(500, 250));
		Thread.sleep(2000);

//		maximize the browser window
		window.maximize();

//		full screen mode of browser window
		window.fullscreen();

	}

}
