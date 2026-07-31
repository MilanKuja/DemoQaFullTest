package resources;

import DriverSetup.Driver;

public class XpathLocators extends Driver {
    public String logInInputField (String inputField) {
        return String.format("//mat-form-field//input[@formcontrolname= '%s']", inputField);
    }

    public String logInButton (String buttonName) {
        return String.format("//button//span[normalize-space(text()) = '%s']/ancestor::button", buttonName);
    }
}
