package DemoQaFullTest;

import DemoQaPages.DemoQaCheckBoxPage;
import DemoQaPages.DemoQaHomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoQaCheckBoxTest extends DemoQaCheckBoxPage {
    @BeforeEach
    public void startUp(){openUrl("https://demoqa.com/");}



    @Test
    public void testing(){
        DemoQaHomePage demoQaHomePage = new DemoQaHomePage();

        demoQaHomePage.clickOnElements()
                .clickOnCheckBoxDropDown()
                //Home CheckBox
                .clickOnHomeExtandButton().clickOnHomeCheckBox()
                .verifyAllCheckBoxesAreCheck()
                .verifyResoultText("You have selected : home desktop documents downloads notes commands workspace office wordFile excelFile react angular veu public private classified general")
                .clickOnHomeCheckBox()
                .verifyAllCheckBoxesAreUnCheck().confirmationMessageIsNotVisible()
                //Desktop CheckBox
                .clickOnDesktopExtandButton().clickOnDesktopCheckBox().verifyAllDesktopCheckBoxesAreChecked()
                .verifyResoultText("You have selected : desktop notes commands")
                .clickOnDesktopCheckBox()
                .clickOnNotesCheckBox().verifyHomeIsPartialCheck().verifyDesktopIsPartialCheck().verifyResoultText("You have selected : notes")
                .clickOnNotesCheckBox().clickOnDesktopExtandButton()
                //Documents CheckBox
                .clickOnDocumentsExtandButton().clickOnDocumentsCheckBox().verifyHomeIsPartialCheck().verifyDocumentsCheckBoxIsChecked()
                .clickOnDocumentsCheckBox().clickOnDocumentsExtandButton()
                .clickOnDocumentsExtandButton().clickOnOfficeExtandButton().clickOnWorkSpaceExtandButton().clickOnOfficeExtandButton()
                .clickOnReactCheckBox().clickOnAngularCheckBox()
                .clickOnOfficeExtandButton()
                .clickOnPrivateOfficeCheckBox().clickOnClassifiedOfficeCheckBox()
                .verifyDocumentsIsPartialCheck()
                .clickOnWorkSpaceCheckBox().clickOnOfficeCheckBox()
                .verifyOfficeCheckBoxIsChecked().verifyWorkSpaceCheckBoxIsChecked().verifyHomeIsPartialCheck()
                .clickOnOfficeCheckBox().clickOnWorkSpaceCheckBox().clickOnDocumentsExtandButton()
                .clickOnDownloadsExtandButton().clickOnDownloadsCheckBox()
                .clickOnWordFileDownloadsCheckBox().verifyDownloadsCheckBoxIsPartialChecked()
                ;
    }

    @AfterEach
    public void tareDown(){
        quitDriver();
    }
}


