package SeleniumPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class TakeScreenshotExample {
	@Test
	public void takeScreenshottest() throws IOException {
		System.setProperty("webdriver.gecko.driver","/Users/Sateesh/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/Sateesh/eclipse-workspace/TestingPractice/src/test/java/SeleniumPractice/google.png"));
		driver.quit();
	}

}

