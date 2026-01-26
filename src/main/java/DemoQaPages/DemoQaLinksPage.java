package DemoQaPages;

import XpathLocators.XpathLocators;

public class DemoQaLinksPage extends DemoQaHomePage{
    private String mainTab;

    public DemoQaLinksPage clickOnSimpleLink() {
        click(XpathLocators.simpleLink);
        mainTab = switchToNewTab();
        return this;
    }

    public DemoQaLinksPage returnToMainTab() {
        closeTabAndReturnTo(mainTab);
        return this;
    }

    public DemoQaLinksPage  clickOnDynamicLink() {
        click(XpathLocators.dynamicLink);
        mainTab = switchToNewTab();
        return this;
    }
}
