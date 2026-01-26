package DemoQaPages;

import XpathLocators.XpathLocators;

public class DemoQaButtonsPage extends DemoQaHomePage{

    public DemoQaButtonsPage doubleClickButtonDoubleClick() {
        doubleClick(XpathLocators.doubleClickButton);
        return this;
    }

    public DemoQaButtonsPage verifyDoubleClickMessage(String text){
        verifyText(XpathLocators.doubleClickMessage,
                text,
                "Doubleclick message is not correct!!");
        return this;
    }
}
