package constains;

public interface IModalConstants {
    String TEXT_AREA_INPUT_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'InputTextArea')]//textarea";
    String INPUT_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInput')]//input";
}
