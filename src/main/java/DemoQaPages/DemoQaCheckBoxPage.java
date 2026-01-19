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

    public DemoQaCheckBoxPage clickOnWorkSpaceExtandButton(){
        click(XpathLocators.workSpaceExtandButton);
        return this;
    }

    public DemoQaCheckBoxPage clickOnOfficeExtandButton(){
        click(XpathLocators.officeExtandButton);
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

    public DemoQaCheckBoxPage clickOnWorkSpaceCheckBox(){
        click(XpathLocators.workSpaceCheckBox);
        return this;
    }

    public DemoQaCheckBoxPage clickOnReactCheckBox(){
        click(XpathLocators.reactWorkSpaceCheckBox);
        return this;
    }

    public DemoQaCheckBoxPage clickOnAngularCheckBox(){
        click(XpathLocators.angularWorkSpaceCheckBox);
        return this;
    }

    public DemoQaCheckBoxPage clickOnVeuCheckBox(){
        click(XpathLocators.veuWorkSpaceCheckBox);
        return this;
    }

    public DemoQaCheckBoxPage clickOnOfficeCheckBox(){
        click(XpathLocators.officeCheckBox);
        return this;
    }

    public DemoQaCheckBoxPage clickOnPublicCheckBox(){
        click(XpathLocators.publicOfficeCheckBox);
        return this;
    }

    public DemoQaCheckBoxPage clickOnPrivateOfficeCheckBox(){
        click(XpathLocators.privateOfficeCheckBox);
        return this;
    }

    public DemoQaCheckBoxPage clickOnClassifiedOfficeCheckBox(){
        click(XpathLocators.classifiedOfficeCheckBox);
        return this;
    }

    public DemoQaCheckBoxPage clickOnGeneralOfficeCheckBox(){
        click(XpathLocators.generalOffice);
        return this;
    }

    public DemoQaCheckBoxPage clickOnDownloadsCheckBox(){
        click(XpathLocators.downloadsCheckBox);
        return this;
    }

    public DemoQaCheckBoxPage clickOnWordFileDownloadsCheckBox(){
        click(XpathLocators.wordFileCheckBox);
        return this;
    }

    public DemoQaCheckBoxPage clickOnExcelFileDownloadsCheckBox(){
        click(XpathLocators.excelFileCheckBox);
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
    //Desktop
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
    //Documents
    public DemoQaCheckBoxPage verifyDocumentsIsPartialCheck(){
        verifyCheckBoxChecked(XpathLocators.documentsCheckBox, "class", "rct-icon-half-check","Documents checkbox is not partial checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyDocumentsCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.documentsCheckBox, "class", "rct-icon-check","Documents checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyWorkSpaceCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.workSpaceCheckBox, "class", "rct-icon-check","WorkSpace checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyWorkSpaceCheckBoxIsPartialChecked(){
        verifyCheckBoxChecked(XpathLocators.workSpaceCheckBox, "class", "rct-icon-half-check","WorkSpace checkbox is not partial checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyReactCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.reactWorkSpaceCheckBox, "class", "rct-icon-check","React checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyAngularCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.angularWorkSpaceCheckBox, "class", "rct-icon-check","Angular checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyVeuCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.veuWorkSpaceCheckBox, "class", "rct-icon-check","Veu checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyOfficeCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.officeCheckBox, "class", "rct-icon-check","Office checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyOfficeCheckBoxIsPartialChecked(){
        verifyCheckBoxChecked(XpathLocators.officeCheckBox, "class", "rct-icon-half-check","Office checkbox is not partial checked.");
        return this;
    }


    public DemoQaCheckBoxPage verifyPublicCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.publicOfficeCheckBox, "class", "rct-icon-check","Public checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyPrivateCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.privateOfficeCheckBox, "class", "rct-icon-check","Private checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyClassifiedCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.classifiedOfficeCheckBox, "class", "rct-icon-check","Classified checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyGeneralCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.generalOffice, "class", "rct-icon-check","General checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyDownloadsCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.downloadsCheckBox, "class", "rct-icon-check","Downloads checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyDownloadsCheckBoxIsPartialChecked(){
        verifyCheckBoxChecked(XpathLocators.downloadsCheckBox, "class", "rct-icon-half-check","Downloads checkbox is not partial checked.");
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
