package DemoQaPages;

import XpathLocators.XpathLocators;

public class DemoQaCheckBoxPage extends DemoQaTextBoxPage {


    public DemoQaCheckBoxPage clickOnHomeExtandButton() {
        click(XpathLocators.homeExpandButton);
        return this;
    }

    public DemoQaCheckBoxPage clickOnDesktopExtandButton() {
        click(XpathLocators.desktopExpandButton);
        return this;
    }

    public DemoQaCheckBoxPage clickOnDocumentsExtandButton() {
        click(XpathLocators.documentsExpandButton);
        return this;
    }

    public DemoQaCheckBoxPage clickOnDownloadsExtandButton() {
        click(XpathLocators.downloadsExpandButton);
        return this;
    }

    public DemoQaCheckBoxPage clickOnWorkSpaceExtandButton(){
        click(XpathLocators.workSpaceExpandButton);
        return this;
    }

    public DemoQaCheckBoxPage clickOnOfficeExtandButton(){
        click(XpathLocators.officeExpandButton);
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
        click(XpathLocators.generalOfficeCheckBox);
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


    public DemoQaCheckBoxPage clickOnExpandAll(){
        click(XpathLocators.plusExpandAll);
        return this;
    }

    public DemoQaCheckBoxPage clickOnCollapseAll(){
        click(XpathLocators.minusCollapseAll);
        return this;
    }

    public DemoQaCheckBoxPage verifyAllCheckBoxesAreCheck() {
        verifyCheckBoxChecked(XpathLocators.desktopCheckBox, "class", "rc-tree-checkbox rc-tree-checkbox-checked", "Desktop checkbox is not checked.");
        verifyCheckBoxChecked(XpathLocators.documentsCheckBox, "class", "rc-tree-checkbox rc-tree-checkbox-checked","Documents checkbox is not checked.");
        verifyCheckBoxChecked(XpathLocators.downloadsCheckBox, "class", "rc-tree-checkbox rc-tree-checkbox-checked","Downloads checkbox is not checked.");
        verifyCheckBoxChecked(XpathLocators.homeCheckBox,"class","rc-tree-checkbox rc-tree-checkbox-checked","Home checkbox is checked");
        return this;
    }

    public DemoQaCheckBoxPage verifyAllDesktopCheckBoxesAreChecked(){
        verifyCheckBoxChecked(XpathLocators.notesCheckBox, "class", "rc-tree-checkbox rc-tree-checkbox-checked","Notes checkbox is not checked.");
        verifyCheckBoxChecked(XpathLocators.commandsCheckBox, "class", "rc-tree-checkbox rc-tree-checkbox-checked","Commands checkbox is not checked.");
        verifyCheckBoxChecked(XpathLocators.desktopCheckBox,"class","rc-tree-checkbox rc-tree-checkbox-checked","Desktop checkbox is checked");
        return this;
    }

    public DemoQaCheckBoxPage verifyAllCheckBoxesAreUnCheck() {
        verifyCheckBoxChecked(XpathLocators.desktopCheckBox, "aria-checked", "false", "Desktop checkbox is checked.");
        verifyCheckBoxChecked(XpathLocators.documentsCheckBox, "aria-checked", "false","Documents checkbox is checked.");
        verifyCheckBoxChecked(XpathLocators.downloadsCheckBox, "aria-checked", "false","Downloads checkbox is checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyHomeIsPartialCheck(){
        verifyCheckBoxChecked(XpathLocators.homeCheckBox, "aria-checked", "mixed","Home checkbox is not partial checked.");
        return this;
    }
    //Desktop
    public DemoQaCheckBoxPage verifyDesktopIsPartialCheck(){
        verifyCheckBoxChecked(XpathLocators.desktopCheckBox, "aria-checked", "mixed","Desktop checkbox is not partial checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyDesktopCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.notesCheckBox, "aria-checked", "true","Desktop checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyNotesCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.notesCheckBox, "aria-checked", "true","Notes checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyCommandsCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.commandsCheckBox, "aria-checked", "true","Commands checkbox is not checked.");
        return this;
    }
    //Documents
    public DemoQaCheckBoxPage verifyDocumentsIsPartialCheck(){
        verifyCheckBoxChecked(XpathLocators.documentsCheckBox, "aria-checked", "mixed","Documents checkbox is not partial checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyDocumentsCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.documentsCheckBox, "aria-checked", "true","Documents checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyWorkSpaceCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.workSpaceCheckBox, "aria-checked", "true","WorkSpace checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyWorkSpaceCheckBoxIsPartialChecked(){
        verifyCheckBoxChecked(XpathLocators.workSpaceCheckBox, "aria-checked", "mixed","WorkSpace checkbox is not partial checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyReactCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.reactWorkSpaceCheckBox, "aria-checked", "true","React checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyAngularCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.angularWorkSpaceCheckBox, "aria-checked", "true","Angular checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyVeuCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.veuWorkSpaceCheckBox, "aria-checked", "true","Veu checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyOfficeCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.officeCheckBox, "aria-checked", "true","Office checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyOfficeCheckBoxIsPartialChecked(){
        verifyCheckBoxChecked(XpathLocators.officeCheckBox, "aria-checked", "mixed","Office checkbox is not partial checked.");
        return this;
    }


    public DemoQaCheckBoxPage verifyPublicCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.publicOfficeCheckBox, "aria-checked", "true","Public checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyPrivateCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.privateOfficeCheckBox, "aria-checked", "true","Private checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyClassifiedCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.classifiedOfficeCheckBox, "aria-checked", "true","Classified checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyGeneralCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.generalOfficeCheckBox, "aria-checked", "true","General checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyDownloadsCheckBoxIsChecked(){
        verifyCheckBoxChecked(XpathLocators.downloadsCheckBox, "aria-checked", "true","Downloads checkbox is not checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyDownloadsCheckBoxIsPartialChecked(){
        verifyCheckBoxChecked(XpathLocators.downloadsCheckBox, "aria-checked", "mixed","Downloads checkbox is not partial checked.");
        return this;
    }

    public DemoQaCheckBoxPage verifyResoultText(String string){
        verifyTexts(XpathLocators.resultText,
                string,
                "Resoult text is not correct");
        return this;
    }

    public DemoQaCheckBoxPage confirmationMessageIsNotVisible(){
        elementIsNotVisible(XpathLocators.resultText);
        return this;
    }

    public DemoQaCheckBoxPage allElementsAreVisible(){
        try {
            elementIsVisible(XpathLocators.desktopCheckBox);
            elementIsVisible(XpathLocators.notesCheckBox);
            elementIsVisible(XpathLocators.commandsCheckBox);
            elementIsVisible(XpathLocators.desktopExpandButton);
            elementIsVisible(XpathLocators.documentsCheckBox);
            elementIsVisible(XpathLocators.workSpaceCheckBox);
            elementIsVisible(XpathLocators.officeCheckBox);
            elementIsVisible(XpathLocators.workSpaceExpandButton);
            elementIsVisible(XpathLocators.officeExpandButton);
            elementIsVisible(XpathLocators.reactWorkSpaceCheckBox);
            elementIsVisible(XpathLocators.angularWorkSpaceCheckBox);
            elementIsVisible(XpathLocators.veuWorkSpaceCheckBox);
            elementIsVisible(XpathLocators.publicOfficeCheckBox);
            elementIsVisible(XpathLocators.privateOfficeCheckBox);
            elementIsVisible(XpathLocators.classifiedOfficeCheckBox);
            elementIsVisible(XpathLocators.downloadsCheckBox);
            elementIsVisible(XpathLocators.wordFileCheckBox);
            elementIsVisible(XpathLocators.excelFileCheckBox);
            elementIsVisible(XpathLocators.downloadsExpandButton);
        } catch (Exception e){
            System.out.println("Element is not visible");
        }

        return this;
    }











}
