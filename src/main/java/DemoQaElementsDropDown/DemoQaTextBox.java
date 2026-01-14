package DemoQaElementsDropDown;

import BaseMethods.BaseMethods;

public class DemoQaTextBox extends BaseMethods {

    String elementsDropDown = "//div[normalize-space(text())='Elements']";




    public DemoQaTextBox clickOnElements(){
        click(elementsDropDown);
        return this;
    }
}
