import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
//	public static void main(String[] args) {
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://google.com");
//		driver.close();
//		driver.quit();
//	}
	
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void searchGoogle() throws InterruptedException {
//		driver.get("https://www.google.com");
//		WebElement searchBox = driver.findElement(By.name("q"));
//		searchBox.sendKeys("Selenium WebDriver" + Keys.ENTER);
//		Thread.sleep(2000); // simple wait for results
//		String title = driver.getTitle();
//		Assert.assertTrue(title.contains("Selenium WebDriver"), "Search failed!");
//		System.out.println("Search successful: " + title);
		
		driver.get("https://demowebshop.tricentis.com/login");
	}

	@AfterMethod
	public void tearDown() {
		if (driver != null)
			driver.quit();
	}


}
