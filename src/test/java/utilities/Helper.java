package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	public static void captureScreenShot(WebDriver driverForHelper, String screenShot) {
		Path dest = Paths.get("./screenshots",screenShot+".png");
		try {
			Files.createDirectories(dest.getParent());
			@SuppressWarnings("resource")
			FileOutputStream out = new FileOutputStream(dest.toString());
			out.write(((TakesScreenshot)driverForHelper).getScreenshotAs(OutputType.BYTES));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
