package Practice.com.practice.tests.TestNGPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParameterizingWithDataProvider {
	public WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	@Test(dataProvider="userData" ,dataProviderClass=DataProviderClass.class)
	public void registrationTest(String firstName,String lastName,String email,String tel) {
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys(firstName);
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(lastName);
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(email);
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys(tel);
		driver.navigate().refresh();
	}

}
