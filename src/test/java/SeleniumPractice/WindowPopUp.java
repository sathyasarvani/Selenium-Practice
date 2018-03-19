package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowPopUp {
	
	@Test
	public void windowPopUpTest() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/Users/Sateesh/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("/html/body/p/a")).click();
		String MainWindow = driver.getWindowHandle();
		Set<String> handlers = driver.getWindowHandles();
		Iterator<String> itr = handlers.iterator();
		while(itr.hasNext()) {
			String childWindow = itr.next();
			if(!MainWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				driver.findElement(By.name("emailid")).sendKeys("test123@gmail.com");
				driver.findElement(By.cssSelector("input[type='submit']")).click();
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
		driver.quit();
	}
	
}
