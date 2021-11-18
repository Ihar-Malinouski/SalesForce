package constains;

import org.openqa.selenium.By;

public interface IConstains {
    String URL = "https://tms4.my.salesforce.com/";
    String URL_NEW = "https://tms4.lightning.force.com/lightning/o/Account/new";
    String URL_LIST = "https://tms4.lightning.force.com/lightning/o/Account/list";
    By ADD_INFO = By.xpath("//*[contains(text(),'Additional Information')]");
    By LIST_PAGE = By.xpath("//*[@class='slds-grid']");
    By AUTHORIZATION_BUTTON_CLICK = By.id("Login");
    String SAVE_BUTTON_CLICK = "//button[contains(@class,'forceActionButton')]//span[text()='Save']";
    String LIST_NAME = "//*[contains(text(),'Account Name')]//ancestor::*[contains(@class,'slds-form-element')]//div[contains(@class,'slds-form-element__control')]/span";
}
