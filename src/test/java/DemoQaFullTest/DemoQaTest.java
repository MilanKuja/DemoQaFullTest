package DemoQaFullTest;

import DemoQaElementsDropDown.DemoQaTextBox;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoQaTest extends DemoQaTextBox {

    @BeforeEach
    public void startUp(){
        openUrl("https://demoqa.com/text-box");
    }


    @Test
    public void testing(){
        DemoQaTextBox demoQaTextBox = new DemoQaTest();
        demoQaTextBox.clickOnElements();


    }


    @AfterEach
    public void tareDown(){
        quitDriver();
    }




}
