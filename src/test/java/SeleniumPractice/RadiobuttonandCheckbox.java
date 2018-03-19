package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RadiobuttonandCheckbox {
	
	@Test
	public void radioandcheckboxtest() {
		System.setProperty("webdriver.gecko.driver","/Users/Sateesh/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().deleteAllCookies();
		//Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)
		boolean isSelected = driver.findElement(By.id("sex-1")).isSelected();
		if(!isSelected) {
			driver.findElement(By.id("sex-1")).click();
		}
		//Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
		boolean isExpSelected = driver.findElement(By.id("exp-2")).isSelected();
		if(!isExpSelected) {
			driver.findElement(By.id("exp-2")).click();
		}
		//Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
		boolean isProfSelected = driver.findElement(By.xpath("//input[@value='Automation Tester']")).isSelected();
		if(!isProfSelected) {
			driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		}
		//Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
		boolean isToolSelected = driver.findElement(By.cssSelector("input[value='Selenium IDE']")).isSelected();
		if(!isToolSelected) {
			driver.findElement(By.cssSelector("input[value='Selenium IDE']")).click();
		}
		driver.quit();
	}

}
