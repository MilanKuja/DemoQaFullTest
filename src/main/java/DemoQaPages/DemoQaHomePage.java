package DemoQaPages;

import BaseMethods.BaseMethods;
import XpathLocators.XpathLocators;



public class DemoQaHomePage extends BaseMethods {

    public DemoQaTextBoxPage clickOnElements(){
        click(XpathLocators.elementsCard);
        return new DemoQaTextBoxPage();

    }
    public DemoQaRadioButtonPage clickOnRadioButtonDrop(){
        click(XpathLocators.radioButtonDrop);
        return new DemoQaRadioButtonPage();
    }

    public DemoQaWebTablesPage clickOnWebTablesDrop(){
        click(XpathLocators.webTablesDrop);
        return new DemoQaWebTablesPage();
    }
}
