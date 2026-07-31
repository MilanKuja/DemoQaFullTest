package Cortech.CortechPagesRM.Dialogs;

import Cortech.CortechPagesRM.Labels.CompaniesLabels;
import Cortech.CortechPagesRM.SuperAdmin.Companies;
import org.openqa.selenium.WebDriver;
import resources.XpathLocators;

public class AddEditCompanyDialog extends Companies {
    public AddEditCompanyDialog(WebDriver driver) {
        super(driver);
    }

    public AddEditCompanyDialog fillInFirstName(String name) {
        sendKeys(XpathLocators.dialogInputField(CompaniesLabels.FIRST_NAME), name);
        return this;
    }

    public AddEditCompanyDialog fillInLastName(String lastName) {
        sendKeys(XpathLocators.dialogInputField(CompaniesLabels.LAST_NAME), lastName);
        return this;
    }

    public AddEditCompanyDialog fillInPhoneNumber(String number) {
        sendKeys(XpathLocators.dialogInputField(CompaniesLabels.PHONE_NUMBER), number);
        return this;
    }

    public AddEditCompanyDialog fillInEmailAddress(String email) {
        sendKeys(XpathLocators.logInInputField(CompaniesLabels.EMAIL), email);
        sendKeys(XpathLocators.dialogInputField(CompaniesLabels.EMAIL_CONFIRMATION), email);
        return this;
    }

    public  AddEditCompanyDialog clIckSetYouOwnPasswordCheckBox() {
        click(XpathLocators.dialogCheckBoxField(CompaniesLabels.SET_YOUR_OWN_PASSWORD));
        return this;
    }

    public AddEditCompanyDialog fillInCompanyName(String companyName) {
        scrollToElement(XpathLocators.logInInputField(CompaniesLabels.COMPANY_NAME));
        sendKeys(XpathLocators.logInInputField(CompaniesLabels.COMPANY_NAME), companyName);
        return this;
    }

    public AddEditCompanyDialog fillInAddressInput(String address) {
        scrollToElement(XpathLocators.logInInputField(CompaniesLabels.ADDRESS));
        sendKeys(XpathLocators.dialogInputField(CompaniesLabels.ADDRESS), address);
        return this;
    }

    public AddEditCompanyDialog fillInZipCode(String zip) {
        scrollToElement(XpathLocators.logInInputField(CompaniesLabels.ZIP));
        sendKeys(XpathLocators.dialogInputField(CompaniesLabels.ZIP), zip);
        return this;
    }

    public AddEditCompanyDialog fillInCity(String city) {
        scrollToElement(XpathLocators.logInInputField(CompaniesLabels.CITY));
        sendKeys(XpathLocators.dialogInputField(CompaniesLabels.CITY), city);
        return this;
    }









}
