package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public void maxBrowser() {
		driver.manage().window().maximize();
	}

	public void toGetPageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public void toGetCurrentPageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public void closeBrowser() {
		driver.close();
	}

	public void dataFill(WebElement element, String userData) {
		element.sendKeys(userData);
	}

	public void buttonClick(WebElement element) {
		element.click();
	}

	public void toMousehover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public void toMouseHoverClick(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).click();
	}

	public void doubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public void dragAndDrop(WebElement start, WebElement end) {
		Actions a = new Actions(driver);
		a.dragAndDrop(start, end).perform();
		;

	}

	public void toPerformEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public void toPerformCopy() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public void toPerformPaste() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}
}
