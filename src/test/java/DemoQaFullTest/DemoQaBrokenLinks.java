package DemoQaFullTest;

import DemoQaPages.DemoQaHomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoQaBrokenLinks extends DemoQaHomePage {

    @BeforeEach
    public void startUp(){openUrl("https://demoqa.com/");}



    @Test
    public void testing(){
        DemoQaHomePage demoQaHomePage = new DemoQaHomePage();

        demoQaHomePage.clickOnElements().clickOnBrokenLinksDrop()
                .clickOnBrokenLinksDrop().verifyBrokenImages()

        ;
    }

    @AfterEach
    public void tareDown(){
        quitDriver();
    }
}
