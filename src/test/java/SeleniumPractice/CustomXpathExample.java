package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CustomXpathExample {
	@Test
	public void customxpathtest() {
		System.setProperty("webdriver.gecko.driver","/Users/Sateesh/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.westernunion.com/us/en/send-money/app/register");
		driver.findElement(By.xpath("//input[@id='txtFName']")).sendKeys("Jack");
		driver.findElement(By.xpath("//input[@id='txtLName']")).sendKeys("Henry");
		driver.findElement(By.xpath("//input[@id='mergeDob']")).sendKeys("10/23/1990");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("jack12@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Welcome123");
		driver.findElement(By.xpath("//input[contains(@id,'txtAddr')]")).sendKeys("123 Main Street");
		driver.findElement(By.xpath("//input[contains(@id,'txtCity')]")).sendKeys("Sunnyvale");
		Select state = new Select(driver.findElement(By.id("cboState")));
		state.selectByVisibleText("California");
		driver.findElement(By.xpath("//input[starts-with(@id,'txtZip')]")).sendKeys("94087");
		driver.findElement(By.xpath("//input[starts-with(@id,'txtPhone')]")).sendKeys("6504958024");
		Select securityQuestion = new Select(driver.findElement(By.id("cboSecurityQues")));
		securityQuestion.selectByVisibleText("What is your favorite pet's name?");
		driver.findElement(By.id("txtAns")).sendKeys("Tommy");
		driver.findElement(By.xpath("//button[contains(@id,'button-continue')]")).click();
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='button']"))).click();
		driver.quit();
	}

}
