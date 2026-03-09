package DemoQaFullTest;

import DemoQaPages.DemoQaHomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoQaRadioButtonsTest extends DemoQaHomePage {

    @BeforeEach
    public void startUp() {
        openUrl("https://demoqa.com/");
    }


    @Test
    public void testing() {
    DemoQaHomePage demoQaHomePage = new DemoQaHomePage();
    //Radio buttons
                demoQaHomePage.clickOnElements().clickOnRadioButtonDrop()
                .verifyNoRadioButtonIsDisabled()
                .clickOnYesRadioButton()
                .verifyResultMessage("Yes")
                .clickOnImpressiveRadioButton()
                .verifyResultMessage("Impressive")
                .clickOnWebTablesDropDown();
}
    @AfterEach
    public void tareDown(){
        quitDriver();
    }
}

