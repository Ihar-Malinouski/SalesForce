package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage {

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        waitForElementListPage();
    }

    public static String saveName() {
        return driver.findElement(By.xpath(String.format(LIST_NAME))).getText();
    }


}
