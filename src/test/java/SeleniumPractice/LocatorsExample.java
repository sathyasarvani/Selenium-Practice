package SeleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LocatorsExample {
	String fileName = "config.properties";
	@Test
	public void locatorsTest() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","/Users/Sateesh/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		Properties prop = new Properties();
		ClassLoader classLoader = getClass().getClassLoader();
		String path = classLoader.getResource(fileName).getFile();
		FileInputStream configFile = new FileInputStream(path);
		prop.load(configFile);
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.id(prop.getProperty("firstName_id"))).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.id(prop.getProperty("lastName_id"))).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.id(prop.getProperty("dob_id"))).sendKeys(prop.getProperty("dob"));
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id(prop.getProperty("address_id"))).sendKeys(prop.getProperty("address"));
		driver.findElement(By.id(prop.getProperty("city_id"))).sendKeys(prop.getProperty("city"));
		Select state = new Select(driver.findElement(By.id(prop.getProperty("state_id"))));
		state.selectByVisibleText(prop.getProperty("state"));
		driver.findElement(By.id("txtZipCode")).sendKeys("94087");
		driver.findElement(By.id("txtPhoneNum1")).sendKeys("6504958024");
		Select securityQuestion = new Select(driver.findElement(By.id("cboSecurityQues")));
		securityQuestion.selectByVisibleText("What is your favorite pet's name?");
		driver.findElement(By.id("txtAns")).sendKeys("Tommy");
		driver.findElement(By.id("button-continue")).click();
		driver.quit();
		//WebDriverWait wait1 = new WebDriverWait(driver,10);
		//wait1.until(ExpectedConditions.elementToBeClickable(By.id("menu-signup"))).click();
		//driver.findElement(By.id("menu-login")).click();
		//WebElement element = driver.findElement(By.id("menu-signup"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
