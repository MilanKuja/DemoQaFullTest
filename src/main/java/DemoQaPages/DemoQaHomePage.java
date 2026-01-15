package DemoQaPages;

import BaseMethods.BaseMethods;
import XpathLocators.XpathLocators;


public class DemoQaHomePage extends BaseMethods {

    public DemoQaTextBoxPage clickOnElements(){
        click(XpathLocators.elementsCard);
        return new DemoQaTextBoxPage();

    }
}
