package DemoQaPages;

import XpathLocators.XpathLocators;

public class DemoQaRadioButtonPage extends DemoQaHomePage{

    public DemoQaRadioButtonPage clickOnYesRadioButton(){
        click(XpathLocators.radioYesButton);
        return this;
    }

    public DemoQaRadioButtonPage clickOnImpressiveRadioButton(){
        click(XpathLocators.radioImpressiveButton);
        return this;
    }

    public DemoQaRadioButtonPage clickOnNoRadioButton(){
        click(XpathLocators.radioNoButton);
        return this;
    }

    public DemoQaRadioButtonPage verifyNoRadioButtonIsDisabled() {
        verifyElementIsDisabled(XpathLocators.radioNoButton);
        return this;
    }

    public DemoQaRadioButtonPage verifyResultMessage(String message){
        verifyText(XpathLocators.radioButtonResultMessage,message,"Radio button message is not correct.");
        return this;
    }

    public DemoQaWebTablesPage clickOnWebTablesDropDown(){
        click(XpathLocators.webTablesDrop);
        return new DemoQaWebTablesPage();
    }
}
