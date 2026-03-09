package DemoQaFullTest;

import DemoQaPages.DemoQaHomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoQaLinksTest extends DemoQaHomePage{
    @BeforeEach
    public void startUp(){openUrl("https://demoqa.com/");}



    @Test
    public void testing() throws InterruptedException {
        DemoQaHomePage demoQaHomePage = new DemoQaHomePage();

        demoQaHomePage.clickOnElements().clickOnLinksDrop()
                .clickOnSimpleLink().returnToMainTab()
                .clickOnDynamicLink().returnToMainTab()
                .clickOnCreatedLink().verifyResponseForCreated()
                .clickOnNoContent().verifyResponseForNoContent()
                .clickOnMoved().verifyResponseForMoved()
                .clickOnBadRequest().verifyResponseForBadRequest()
                .clickOnUnauthorized().verifyResponseForUnauthorized()
                .clickOnForbidden().verifyResponseForForbidden()
                .clickOnNotFound().verifyResponseForNotFound();
    }

    @AfterEach
    public void tareDown(){
        quitDriver();
    }
}
