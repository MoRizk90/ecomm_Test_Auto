package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import utilities.Helper;

public class testBase extends AbstractTestNGCucumberTests {
	public static WebDriver testBaseDriver;
	
	@BeforeSuite
	@Parameters({"browser"})
	public void startDriver(@Optional("chrome") String theBrowser) {
		
		if(theBrowser.equalsIgnoreCase("chrome")) {
			String driverPaths= System.getProperty("user.dir") + "/drivers/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPaths);
			testBaseDriver = new ChromeDriver();
		}else if (theBrowser.equalsIgnoreCase("firefox")) {
			String driverPaths= System.getProperty("user.dir") + "/drivers/geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", driverPaths);
			testBaseDriver = new FirefoxDriver();
		}else if (theBrowser.equalsIgnoreCase("ie")) {
			String driverPaths= System.getProperty("user.dir") + "/drivers/ieDriverServer.exe";
			System.setProperty("webdriver.ie.driver", driverPaths);
			testBaseDriver = new InternetExplorerDriver();
			//headless browser testing
		}else if (theBrowser.equalsIgnoreCase("headless")) {
			String driverPaths= System.getProperty("user.dir") + "/drivers/phantomjs.exe";
			System.setProperty("webdriver.ie.driver", driverPaths);
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setJavascriptEnabled(true);
			cap.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, driverPaths);
			String[] phantomArgs = {"--web-security=no","--ignore-ssl-errors=yes"};
			cap.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, phantomArgs);
			testBaseDriver = new PhantomJSDriver(cap);
			
			
		}
		System.out.println("The driver from inside the test base class : " + testBaseDriver);
		testBaseDriver.navigate().to("https://demo.nopcommerce.com/");

	}
	
	@AfterSuite
	public void killDriver() {
		testBaseDriver.quit();
	}
	
	//Capturing ScreenShot on failure
	@AfterMethod
	public void failuersScreenShot(ITestResult current_result) {
		if (current_result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed, taking screenshot ...");
			Helper.captureScreenShot(testBaseDriver, current_result.getName());
			
		}
	}
}
