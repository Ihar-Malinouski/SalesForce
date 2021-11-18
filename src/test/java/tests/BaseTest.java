package tests;

import constans.ITestConstans;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import pages.AccountListPage;
import pages.AuthorizationPage;
import pages.NewAccountModalPage;

public class BaseTest {

    WebDriver driver;
    NewAccountModalPage newAccountModalPage;
    AuthorizationPage authorizationPage;
    AccountListPage accountListPage;

    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        newAccountModalPage = new NewAccountModalPage(driver);
        authorizationPage = new AuthorizationPage(driver);
        accountListPage = new AccountListPage(driver);
    }
}
