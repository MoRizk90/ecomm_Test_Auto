package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends pageBase {

	public HomePage(WebDriver driverforBasePage) {
		super(driverforBasePage);
		jsExec = (JavascriptExecutor) driverforBasePage;
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath= "//a[@class='ico-register']")
	WebElement registerLink;

	@FindBy(xpath = "//a[@class='ico-login']")
	WebElement loginLink;

	@FindBy(xpath= "//*[@id=\"small-searchterms\"]")
	WebElement searchTxtBox;

	@FindBy(id= "ui-id-2")
	List<WebElement> dropDownItem;

	@FindBy(xpath= "//*[@id=\"small-search-box-form\"]/input[2]")
	WebElement SearchBtn;

	@FindBy(xpath= "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div/div/div/div[2]/h2/a")
	public WebElement prodcutSearchResult;

	@FindBy(xpath= "/html/body/div[6]/div[3]/div[1]/ul")
	public List<WebElement> breadCrumbs;

	@FindBy(xpath= "//a[contains(text(),'Contact us')]")
	WebElement contactlink;

	public void openRegisterationpage() {
		clickWebElement(registerLink);
	}

	public void openLoginPage() {
		clickWebElement(loginLink);
	}

	public void productSearch(String productName) {
		writeInElement(searchTxtBox, productName);
		clickWebElement(SearchBtn);
	}

	public void usingAutoSuggest(String productName) throws InterruptedException {
		writeInElement(searchTxtBox, productName);
		Thread.sleep(5000);
		dropDownItem.get(0).click();
	}

	public void openContactUsLink() throws InterruptedException {
		scrollingDown();
		clickWebElement(contactlink);
		Thread.sleep(5000);

	}

}
