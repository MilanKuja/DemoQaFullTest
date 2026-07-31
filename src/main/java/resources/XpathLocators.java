package resources;

public class XpathLocators {
    public static String logInInputField (String inputField) {
        return String.format("//mat-form-field//input[@formcontrolname= '%s']", inputField);
    }

    public static String logInButton (String buttonName) {
        return String.format("//button//span[normalize-space(text()) = '%s']/ancestor::button", buttonName);
    }
}
