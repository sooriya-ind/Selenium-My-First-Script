package pomTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.googleSearch;

public class GoogleTest {

    WebDriver driver;

    @BeforeTest
    public void setUp() {

        // From The Use Of Selenium Manager We don't Need To Give Driver & Location
        driver = new ChromeDriver();

        // Load The URL
        driver.get("https://www.google.com");

        // Maximize The Browser
        driver.manage().window().maximize();

    }

    @Test
    public void sampleTest() {

        // Initialize Page Objects
        googleSearch gs = new googleSearch(driver);

        // Enter your search context
        gs.search("Hi This is my selenium first script");

    }

    @AfterTest(enabled = false)
    public void tearDown() {

        // Closes Current Window
        driver.close();

        // Closes Whole Driver
        driver.quit();

    }

}
