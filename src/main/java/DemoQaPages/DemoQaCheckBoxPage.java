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

    public DemoQaCheckBoxPage clickOnDekstopCheckBox(){
        click(XpathLocators.desktopCheckBox);
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
        return this;
    }

    public DemoQaCheckBoxPage verifyResoultText(){
        verifyTexts(XpathLocators.resoultText,
                "You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile",
                "Resoult text is not correct");
        return this;
    }

    public DemoQaCheckBoxPage verifyAllCheckBoxesAreUnCheck() {
        verifyCheckBoxChecked(XpathLocators.desktopCheckBox, "class", "rct-icon-uncheck", "Desktop checkbox is checked.");
        verifyCheckBoxChecked(XpathLocators.documentsCheckBox, "class", "rct-icon-uncheck","Documents checkbox is checked.");
        verifyCheckBoxChecked(XpathLocators.downloadsCheckBox, "class", "rct-icon-uncheck","Downloads checkbox is checked.");
        return this;
    }

    public DemoQaCheckBoxPage confirmationMessageIsNotVisible(){
        elementIsNotVisible(XpathLocators.resoultText);
        return this;
    }


    public DemoQaCheckBoxPage verifyAllDesktopCheckBoxesAreChecked(){
        verifyCheckBoxChecked(XpathLocators.notesChcekBox, "class", "rct-icon-check","Notes checkbox is not checked.");
        verifyCheckBoxChecked(XpathLocators.commandsCheckBox, "class", "rct-icon-check","Commands checkbox is not checked.");
        return this;
    }


}
