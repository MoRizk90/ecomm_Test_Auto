package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class pageBase {
	protected WebDriver basePageDriver;
	public JavascriptExecutor jsExec;
	
	public pageBase(WebDriver driverforBasePage) {
		PageFactory.initElements(driverforBasePage, this);
	}
	
	public void clickWebElement(WebElement elementToClick) {
		elementToClick.click();
	}
	
	public void writeInElement(WebElement elementTowriteInsideIt, String targetedText) {
		elementTowriteInsideIt.sendKeys(targetedText);
	}
	
	public void scrollingDown() throws InterruptedException {
		//In order to use the javascript exeucter it needed to assined during the constructor intilization 
		jsExec.executeScript("scrollBy(0,2500)");
		Thread.sleep(5000);
	}
	
	
	
}
