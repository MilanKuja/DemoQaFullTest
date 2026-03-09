//package DemoQaFullTest;
//
//import DemoQaPages.DemoQaHomePage;
//import XpathLocators.XpathLocators;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//public class DemoQaTest extends DemoQaHomePage{
//
//    @BeforeEach
//    public void startUp(){
//        openUrl("https://demoqa.com/");
//    }
//
//
//    @Test
//    public void testing() throws InterruptedException {
//        DemoQaHomePage demoQaHomePage = new DemoQaHomePage();
//        demoQaHomePage.clickOnElements()
//                //TextBox
//
//
//
//
//                //Buttons
//                .doubleClickButtonDoubleClick().verifyDoubleClickMessage("You have done a double click")
//                .rightClickRightClickButton().veirfyRightClickMessage("You have done a right click")
//                .clickOnClickMeButton().verifyClickMeButtonMessage("You have done a dynamic click")
//                .clickOnLinksDropDown()
//                //Links
//                .clickOnSimpleLink().returnToMainTab()
//                .clickOnDynamicLink().returnToMainTab()
//                .clickOnCreatedLink().verifyResponseForCreated()
//                .clickOnNoContent().verifyResponseForNoContent()
//                .clickOnMoved().verifyResponseForMoved()
//                .clickOnBadRequest().verifyResponseForBadRequest()
//                .clickOnUnauthorized().verifyResponseForUnauthorized()
//                .clickOnForbidden().verifyResponseForForbidden()
//                .clickOnNotFound().verifyResponseForNotFound()
//                //Broken links
//                .clickOnBrokenLinksDrop().verifyBrokenImages()
//                .clickOnUploadAndDownLoadDrop()
//                .clickOnDownloadButton().uploadFile().verifyUploadedFile("sampleFile.jpeg");
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//
//
//    @AfterEach
//    public void tareDown(){
//        quitDriver();
//    }
//
//
//
//
//}
