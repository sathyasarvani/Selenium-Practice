package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FindElementsExample {
	@Test
	public void tagNametest() {
		System.setProperty("webdriver.gecko.driver","/Users/Sateesh/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.westernunion.com/us/en/home-new.html");
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("No.of links:"+linkList.size());
		List<WebElement> inputList = driver.findElements(By.tagName("input"));
		System.out.println("No of input tags:"+inputList.size());
		List<WebElement> buttonList = driver.findElements(By.tagName("button"));
		System.out.println("No of buttons:"+buttonList.size());
		driver.quit();
	}

}
