package DemoQaFullTest;

import DemoQaPages.DemoQaHomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoQaButtonsTest extends DemoQaHomePage {
    @BeforeEach
    public void startUp(){openUrl("https://demoqa.com/");}



    @Test
    public void testing(){
        DemoQaHomePage demoQaHomePage = new DemoQaHomePage();

        demoQaHomePage.clickOnElements().clickOnButtonsDrop()
                .doubleClickButtonDoubleClick().verifyDoubleClickMessage("You have done a double click")
                .rightClickRightClickButton().veirfyRightClickMessage("You have done a right click")
                .clickOnClickMeButton().verifyClickMeButtonMessage("You have done a dynamic click")
                .clickOnLinksDropDown();

    }

    @AfterEach
    public void tareDown(){
        quitDriver();
    }



}
