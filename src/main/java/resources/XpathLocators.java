package resources;

public class XpathLocators {
    public static String logInInputField (String inputField) {
        return String.format("//mat-form-field//input[@formcontrolname= '%s']", inputField);
    }

    public static String logInButton (String buttonName) {
        return String.format("//button//span[normalize-space(text()) = '%s']/ancestor::button", buttonName);
    }

    public static String addCompaniesButton(String buttonName) {
        return String.format("//button//span[normalize-space(text())='%s']/ancestor::button[1]", buttonName);
    }

    public static String superAdminDialog(String dialogName) {
        return String.format("//span[normalize-space(text()) = '%s']//ancestor::mat-dialog-container",dialogName);
    }

    public static String dialogInputField(String inputFiledName) {
        return String.format("//mat-dialog-content//mat-dialog-content//input[@formcontrolname = '%s']", inputFiledName);
    }

    public static String dialogCheckBoxField(String checkBoxName) {
        return String.format("//mat-dialog-content//*[normalize-space(text())= '%s']//ancestor::mat-checkbox//input", checkBoxName);
    }

    public static String dialogSelectDropDown(String dropDownName) {
        return String.format("//mat-dialog-content//mat-select[@formcontrolname = '%s']", dropDownName);
    }


}
