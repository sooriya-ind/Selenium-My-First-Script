package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class googleSearch {

    WebDriver driver;

    @FindBy(name = "q")
    WebElement txtSearchBox;

    public googleSearch(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void search(String searchContext) {

        // Wait For Web Element To Be Visible - Used Explicit Wait
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(txtSearchBox));

        // Enter SearchContext Text in Search Box
        txtSearchBox.sendKeys(searchContext);

        // Click Enter Button
        txtSearchBox.sendKeys(Keys.ENTER);

    }

}
