package pages;

import constains.IConstains;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthorizationPage extends BasePage implements IConstains {
    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    public static void openPage() {
        openPage(URL);
    }

    public static void autgorizationAccount(String login, String password) {
     driver.findElement(By.id("username")).sendKeys(login);
     driver.findElement(By.id("password")).sendKeys(password);
    }

    public static void clickAuthorizationButton() {
        driver.findElement(AUTHORIZATION_BUTTON_CLICK).click();
    }
}
