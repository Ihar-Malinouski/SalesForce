package pages;

import constains.IConstains;
import elements.DropDown;
import elements.InputField;
import elements.TextArea;
import objects.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountModalPage extends BasePage implements IConstains {
    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        openPage(URL_NEW);
        waitForElementAdditionalInformation();
    }

    public void createAccount(Account account) {
        new InputField(driver, "Account Name").writeText(account.getAccountName());
        new InputField(driver, "Website").writeText(account.getWebSite());
        new InputField(driver, "Parent Account").writeText(account.getParentAccount());
        new InputField(driver, "Phone").writeText(account.getPhone());
        new InputField(driver, "Fax").writeText(account.getFax());
        new InputField(driver, "Employees").writeText(account.getEmployees());
        new InputField(driver, "Annual Revenue").writeText(account.getAnnualRevenue());
        new InputField(driver, "Billing City").writeText(account.getBillingCity());
        new InputField(driver, "Billing State/Province").writeText(account.getBillingState());
        new InputField(driver, "Shipping City").writeText(account.getShippingCity());
        new InputField(driver, "Shipping State/Province").writeText(account.getShippingState());
        new InputField(driver, "Billing Zip/Postal Code").writeText(account.getBillingZip());
        new InputField(driver, "Billing Country").writeText(account.getBillingCountry());
        new InputField(driver, "Shipping Zip/Postal Code").writeText(account.getZipPostalCode());
        new InputField(driver, "Shipping Country").writeText(account.getShippingCountry());
        new TextArea(driver, "Description").writeText(account.getDescription());
        new TextArea(driver, "Billing Street").writeText(account.getBillingStreet());
        new TextArea(driver, "Shipping Street").writeText(account.getShippingStreet());
        new DropDown(driver, "Type").selectOption(account.getTypeAnalitic());
        new DropDown(driver, "Industry").selectOption(account.getTypeAnaliticIn());
        clickSave();
    }

    public void clickSave() {
        driver.findElement(By.xpath(SAVE_BUTTON_CLICK)).click();
    }
}
