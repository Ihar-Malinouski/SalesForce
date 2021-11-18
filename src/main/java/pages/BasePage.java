package pages;

import constains.IConstains;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage implements IConstains {

    static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public void waitForElementLocated(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void waitForElementAdditionalInformation() {
        waitForElementLocated(ADD_INFO, 10);
    }

    public void waitForElementListPage() {
        waitForElementLocated(LIST_PAGE, 10);
    }

}
