import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleGoogleSearch {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe"); // your ChromeDriver path
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void searchGoogle() throws InterruptedException {
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver" + Keys.ENTER);
        Thread.sleep(2000); // simple wait for results
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Selenium WebDriver"), "Search failed!");
        System.out.println("Search successful: " + title);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}
