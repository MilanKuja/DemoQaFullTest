package DemoQaPages;

import XpathLocators.XpathLocators;

public class DemoQaCheckBoxPage extends DemoQaTextBoxPage {


    public DemoQaCheckBoxPage clickOnHomeExtandButton() {
        click(XpathLocators.homeExtandButton);
        return this;
    }

    public DemoQaCheckBoxPage clickOnDesktopExtandButton() {
        click(XpathLocators.desktopExtandButton);
        return this;
    }

    public DemoQaCheckBoxPage clickOnDocumentsExtandButton() {
        click(XpathLocators.documentsExtandButton);
        return this;
    }

    public DemoQaCheckBoxPage clickOnDownloadsExtandButton() {
        click(XpathLocators.downloadsExtandButton);
        return this;
    }

    public DemoQaCheckBoxPage clickOnHomeCheckBox() {
        click(XpathLocators.homeCheckBox);
        return this;
    }

    public DemoQaCheckBoxPage clickOnDesktopCheckBox(){
        click(XpathLocators.desktopCheckBox);
        return this;
    }

    public DemoQaCheckBoxPage clickOnNotesCheckBox(){
        click(XpathLocators.notesCheckBox);
        return this;
    }

    public DemoQaCheckBoxPage clickOnDocumentsCheckBox(){
        click(XpathLocators.documentsCheckBox);
        return this;
    }

    public DemoQaCheckBoxPage clickOnDownLoadsCheckBox(){
        click(XpathLocators.downloadsCheckBox);
        return this;
    }



    public DemoQaCheckBoxPage verifyAllCheckBoxesAreCheck() {
        verifyCheckBoxChecked(XpathLocators.desktopCheckBox, "class", "rct-icon-check", "Desktop checkbox is not checked.");
        verifyCheckBoxChecked(XpathLocators.documentsCheckBox, "class", "rct-icon-check","Documents checkbox is not checked.");
        verifyCheckBoxChecked(XpathLocators.downloadsCheckBox, "class", "rct-icon-check","Downloads checkbox is not checked.");
        verifyCheckBoxChecked(XpathLocators.homeCheckBox,"class","rct-icon-check","Home checkbox is checked");
        return this;
    }

    public DemoQaCheckBoxPage verifyAllDesktopCheckBoxesAreChecked(){
        verifyCheckBoxChecked(XpathLocators.notesCheckBox, "class", "rct-icon-check","Notes checkbox is not checked.");
        verifyCheckBoxChecked(XpathLocators.commandsCheckBox, "class", "rct-icon-check","Commands checkbox is not checked.");
        verifyCheckBoxChecked(XpathLocators.desktopCheckBox,"class","rct-icon-check","Desktop checkbox is checked");
        return this;
    }

    public DemoQaCheckBoxPage verifyAllCheckBoxesAreUnCheck() {
        verifyCheckBoxChecked(XpathLocators.desktopCheckBox, "class", "rct-icon-uncheck", "Desktop checkbox is checked.");
        verifyCheckBoxChecked(XpathLocators.documentsCheckBox, "class", "rct-icon-uncheck","Documents checkbox is checked.");
        verifyCheckBoxChecked(XpathLocators.downloadsCheckBox, "class", "rct-icon-uncheck","Downloads checkbox is checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyHomeIsPartialCheck(){
        verifyCheckBoxChecked(XpathLocators.homeCheckBox, "class", "rct-icon-half-check","Home checkbox is not partial checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyDesktopIsPartialCheck(){
        verifyCheckBoxChecked(XpathLocators.desktopCheckBox, "class", "rct-icon-half-check","Desktop checkbox is not partial checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyDesktopCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.notesCheckBox, "class", "rct-icon-check","Desktop checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyNotesCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.notesCheckBox, "class", "rct-icon-check","Notes checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyCommandsCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.commandsCheckBox, "class", "rct-icon-check","Commands checkbox is not checked.");
        return this;
    }





    public DemoQaCheckBoxPage verifyResoultText(String string){
        verifyTexts(XpathLocators.resoultText,
                string,
                "Resoult text is not correct");
        return this;
    }

    public DemoQaCheckBoxPage confirmationMessageIsNotVisible(){
        elementIsNotVisible(XpathLocators.resoultText);
        return this;
    }









}
