package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseHoverExample {

	@Test
	public void mouseHovertest() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/Users/Sateesh/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Login / Signup"))).build().perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.linkText("SpiceCash/SpiceClub Members"))).build().perform();
		Thread.sleep(2000);
		//action.moveToElement(driver.findElement(By.linkText("Member Login"))).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.linkText("Member Login")));
//		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.linkText("Member Login"))); 
	}
}
