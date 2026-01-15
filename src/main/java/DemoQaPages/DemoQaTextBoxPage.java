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

}
