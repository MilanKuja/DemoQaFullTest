package DemoQaFullTest;

import DemoQaPages.DemoQaHomePage;
import XpathLocators.XpathLocators;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoQaTest extends DemoQaHomePage{

    @BeforeEach
    public void startUp(){
        openUrl("https://demoqa.com/");
    }


    @Test
    public void testing(){
        DemoQaHomePage demoQaHomePage = new DemoQaHomePage();
        demoQaHomePage.clickOnElements()
                //TextBox
                .clickOnTextBoxDrop()
                .verifyPlaceHolderFullName("Full Name").verifyPlaceHolderEmail("name@example.com").verifyPlaceholderCurrentAddress("Current Address")
                .verifyHeaderTextBox("Text Box").verifyLabelFullName("Full Name").verifyLabelEmail("Email").verifyLabelCurrentAddress("Current Address").verifyLabelPermanentAddress("Permanent Address")
                .verifySubmitButtonText("Submit")
                .typeFullNameText("Gavrilo Ilic").typeEmailText("crnigavrilo@gmail.com").typeCurrentAddressText("Zikice Jovanovica Spanca 15").typePermanentAddressText("Svetozara Markovica 88").clickSubmitButton()
                .verifyFirstNameOutput("Gavrilo Ilic").verifyEmailOutput("crnigavrilo@gmail.com").verifyCurrentAddressOutput("Zikice Jovanovica Spanca 15").verifyPermanentAddressOutput("Svetozara Markovica 88")
                //CheckBox
                .clickOnCheckBoxDropDown()
                //Home CheckBox
                .clickOnHomeExtandButton().clickOnHomeCheckBox().verifyAllCheckBoxesAreCheck()
                .verifyResoultText("You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile")
                .clickOnHomeCheckBox().verifyAllCheckBoxesAreUnCheck().confirmationMessageIsNotVisible()
                //Desktop CheckBox
                .clickOnDesktopExtandButton().clickOnDesktopCheckBox().verifyAllDesktopCheckBoxesAreChecked()
                .verifyResoultText("You have selected : desktop notes commands").clickOnDesktopCheckBox()
                .clickOnNotesCheckBox().verifyHomeIsPartialCheck().verifyDesktopIsPartialCheck().verifyResoultText("You have selected : notes")
                .clickOnNotesCheckBox().clickOnDesktopExtandButton()
                //Documents CheckBox
                .clickOnDocumentsExtandButton().clickOnDocumentsCheckBox().verifyHomeIsPartialCheck().verifyDocumentsCheckBoxIsChecked()
                .clickOnDocumentsCheckBox().clickOnDocumentsExtandButton()
                .clickOnDocumentsExtandButton().clickOnOfficeExtandButton().clickOnWorkSpaceExtandButton().clickOnOfficeExtandButton()
                .clickOnReactCheckBox().clickOnAngularCheckBox().clickOnPrivateOfficeCheckBox().clickOnClassifiedOfficeCheckBox()
                .verifyDocumentsIsPartialCheck()
                .clickOnWorkSpaceCheckBox().clickOnOfficeCheckBox()
                .verifyOfficeCheckBoxIsChecked().verifyWorkSpaceCheckBoxIsChecked().verifyHomeIsPartialCheck()
                .clickOnOfficeCheckBox().clickOnWorkSpaceCheckBox().clickOnDocumentsExtandButton()
                .clickOnDownloadsExtandButton().clickOnDownloadsCheckBox()
                .clickOnWordFileDownloadsCheckBox().verifyDownloadsCheckBoxIsPartialChecked()
                .clickOnExpandAll().allElementsAreVisible()
                .clickOnCollapseAll()
                .clickOnRadioButtonDrop()

                //Radio buttons
                .verifyNoRadioButtonIsDisabled()
                .clickOnYesRadioButton()
                .verifyResultMessage("Yes")
                .clickOnImpressiveRadioButton()
                .verifyResultMessage("Impressive")
                .clickOnWebTablesDropDown()
                //WebTalbes
                .clickOnDeleteRecord(1).clickOnEditRecord(2)
                .deleteInput(XpathLocators.addFirstNameInput).typeFirstName("Gavrilo")
                .deleteInput(XpathLocators.addLastNameInput).typeLastName("Ilic")
                .deleteInput(XpathLocators.addEmailInput).typeEmail("crnigavra@gmail.com")
                .deleteInput(XpathLocators.addAgeInput).typeAge("4")
                .deleteInput(XpathLocators.addSalaryInput).typeSalary("35000")
                .deleteInput(XpathLocators.addDepartmantInput).typeDepartmant("Kucni pas").clickOnSubmitButton()
                .clickOnDeleteRecord(3)
                .clicOnAddButton()
                .typeFirstName("Milutin")
                .typeLastName("Ilic")
                .typeEmail("zutimica@gmail.com")
                .typeAge("5")
                .typeSalary("800000")
                .typeDepartmant("Gazda na kucu").clickOnSubmitButton()
                .searchRecord("Gavrilo")
                .clickOnFirstNameHeader()
                .clickOnButtonsDrop()
                .doubleClickButtonDoubleClick().verifyDoubleClickMessage("You have done a double click")
                .rightClickRightClickButton().veirfyRightClickMessage("You have done a right click")
                .clickOnClickMeButton().verifyClickMeButtonMessage("You have done a dynamic click")
                .clickOnLinksDropDown()
                .clickOnSimpleLink();



















    }


    @AfterEach
    public void tareDown(){
        quitDriver();
    }




}
