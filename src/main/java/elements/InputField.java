package elements;

import constains.IModalConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputField implements IModalConstants {
    WebDriver driver;
    String label;

    public InputField(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeText(String text){
        driver.findElement(By.xpath(String.format(INPUT_XPATH, label))).sendKeys(text);
    }
}
