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
                .verifyPlaceHolderFullName("Full Name").verifyPlaceHolderEmail("name@example.com").verifyPlaceholderCurrentAddress("Current Address")
                .verifyHeaderTextBox("Text Box").verifyLabelFullName("Full Name").verifyLabelEmail("Email").verifyLabelCurrentAddress("Current Address").verifyLabelPermanentAddress("Permanent Address")
                .verifySubmitButtonText("Submit")
                .typeFullNameText("Gavrilo Ilic").typeEmailText("crnigavrilo@gmail.com").typeCurrentAddressText("Zikice Jovanovica Spanca 15").typePermanentAddressText("Svetozara Markovica 88").clickSubmitButton()
                .verifyFirstNameOutput("Gavrilo Ilic").verifyEmailOutput("crnigavrilo@gmail.com").verifyCurrentAddressOutput("Zikice Jovanovica Spanca 15").verifyPermanentAddressOutput("Svetozara Markovica 88")
                .clickOnCheckBoxDropDown()
                .clickOnHomeExtandButton().clickOnHomeCheckBox().verifyAllCheckBoxesAreCheck().verifyResoultText();

    }


    @AfterEach
    public void tareDown(){
        quitDriver();
    }




}
