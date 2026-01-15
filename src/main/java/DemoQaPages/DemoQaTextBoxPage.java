package DemoQaPages;

import XpathLocators.XpathLocators;

public class DemoQaTextBoxPage extends DemoQaHomePage {
    public DemoQaTextBoxPage clickOnElementsDropDown() {
        click(XpathLocators.elementsDropDown);
        return this;
    }

    public DemoQaTextBoxPage clickOnTextBoxDrop() {
        click(XpathLocators.textBoxDrop);
        return this;
    }

    public DemoQaTextBoxPage verifyPlaceHolderFullName(String text){
        verifyPlaceHolder(XpathLocators.fullNameInput, text);
        return this;
    }

    public DemoQaTextBoxPage verifyPlaceHolderEmail(String text){
        verifyPlaceHolder(XpathLocators.emailInput,text);
        return this;
    }

    public DemoQaTextBoxPage verifyPlaceholderCurrentAddress(String text){
        verifyPlaceHolder(XpathLocators.currentAddressInput,text);
        return this;
    }

    public DemoQaTextBoxPage verifyLabelFullName(String text){
        verifyText(XpathLocators.fullNameTextLabel,text,"Full name label text is not correct!!!");
        return this;
    }

    public DemoQaTextBoxPage verifyLabelEmail(String text){
        verifyText(XpathLocators.emailLabel,text,"Email label text is not correct!!!");
        return this;
    }

    public DemoQaTextBoxPage verifyLabelCurrentAddress(String text){
        verifyText(XpathLocators.currentAddressLabel,text,"Current address label text is not correct!!!");
        return this;
    }

    public DemoQaTextBoxPage verifyLabelPermanentAddress(String text){
        verifyText(XpathLocators.permanentAddressLabel,text,"Permanent label text is not correct!!!");
        return this;
    }

    public DemoQaTextBoxPage verifyHeaderTextBox(String text){
        verifyText(XpathLocators.textBoxHeader,text,"Header text is not correct!!!");
        return this;
    }

    public DemoQaTextBoxPage verifySubmitButtonText(String text){
        verifyText(XpathLocators.submitButton,text,"Submit button text is not correct!!!");
        return this;
    }

    public DemoQaTextBoxPage typeFullNameText(String text){
        sendKeys(XpathLocators.fullNameInput, text);
        return this;
    }

    public DemoQaTextBoxPage typeEmailText(String text){
        sendKeys(XpathLocators.emailInput, text);
        return this;
    }

    public DemoQaTextBoxPage typeCurrentAddressText(String text){
        sendKeys(XpathLocators.currentAddressInput, text);
        return this;
    }

    public DemoQaTextBoxPage typePermanentAddressText(String text){
        sendKeys(XpathLocators.permanentAddressInput, text);
        return this;
    }

    public DemoQaTextBoxPage clickSubmitButton(){
        click(XpathLocators.submitButton);
        return this;
    }

    public DemoQaTextBoxPage verifyFirstNameOutput(String text){
        verifyText(XpathLocators.nameOutput, "Name:" + text,"First Name output text is not correct!!!");
        return this;
    }

    public DemoQaTextBoxPage verifyEmailOutput(String text){
        verifyText(XpathLocators.emailOutput, "Email:" + text,"Email output text is not correct!!!");
        return this;
    }

    public DemoQaTextBoxPage verifyCurrentAddressOutput(String text){
        verifyText(XpathLocators.currentAddressOutput, "Current Address :" + text, "Current address output text is not correct!!!");
        return this;
    }

    public DemoQaTextBoxPage verifyPermanentAddressOutput(String text){
        verifyText(XpathLocators.permanentAddressOutput, "Permananet Address :" + text, "Permanent output text is not correct!!!");
        return this;
    }





}
