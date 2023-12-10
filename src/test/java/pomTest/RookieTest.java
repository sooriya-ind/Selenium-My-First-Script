package pomTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RookieTest {

    public static void main(String[] args) throws InterruptedException {

        // There Are So Many Options Choose Wisely
//        WebDriver driver = new EdgeDriver();
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();
//        WebDriver driver = new InternetExplorerDriver();

        // Load URL
        driver.get("https://www.google.com");

        // Maximize Browser
        driver.manage().window().maximize();

        // Wait For 20 Sec To Load ( 1000 - 1 Second )
        Thread.sleep(20000);

        // Enter Text In Search Bar
        driver.findElement(By.name("q")).sendKeys("Selenium My First Script");

        // Click Enter
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        // Wait For 10 Sec To Load ( 1000 - 1 Second )
        Thread.sleep(10000);

        // Quit Driver
        driver.quit();

    }

}
