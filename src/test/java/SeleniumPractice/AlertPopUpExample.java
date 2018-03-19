package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertPopUpExample {
	WebDriver driver;
	
	@Test
	public void popUpTest() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","/Users/Sateesh/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().setPosition(new Point(-2000, 0));
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		Thread.sleep(2000);
		driver.quit();
		
	}
	

}
