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

    public DemoQaButtonsPage rightClickRightClickButton() {
        rightClick(XpathLocators.rightClickButton);
        return this;
    }

    public DemoQaButtonsPage veirfyRightClickMessage(String text) {
        verifyText(XpathLocators.rightClickMessage,
                text,
                "Right click message is not correct!!");
        return this;
    }

    public DemoQaButtonsPage clickOnClickMeButton() {
        click(XpathLocators.clickMeButton);
        return this;
    }

    public DemoQaButtonsPage verifyClickMeButtonMessage(String text) {
        verifyText(XpathLocators.clickMeMessage,
                text,
                "Click me message is not correct!!");
        return this;
    }

    public DemoQaLinksPage clickOnLinksDropDown() {
        click(XpathLocators.linksDrop);
        return new DemoQaLinksPage();
    }
}
