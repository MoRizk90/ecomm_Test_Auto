package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class pageBase {
	protected WebDriver basePageDriver;
	
	public pageBase(WebDriver driverforBasePage) {
		PageFactory.initElements(driverforBasePage, this);
		
	}
	
	public void clickWebElement(WebElement elementToClick) {
		elementToClick.click();
	}
	
	public void writeInElement(WebElement elementTowriteInsideIt, String targetedText) {
		elementTowriteInsideIt.sendKeys(targetedText);
	}
	
	
	
}
