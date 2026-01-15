package DemoQaFullTest;

import DemoQaPages.DemoQaHomePage;
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
                .clickOnTextBoxDrop()
                .verifyPlaceHolderFullName("Full Name")
                .verifyPlaceHolderEmail("name@example.com");


    }


    @AfterEach
    public void tareDown(){
        quitDriver();
    }




}
