package DemoQaPages;

import XpathLocators.XpathLocators;

public class DemoQaLinksPage extends DemoQaHomePage{

    public DemoQaLinksPage clickOnSimpleLink(){
        click(XpathLocators.simpleLink);
        switchToNewTab();
        return this;
    }
}
