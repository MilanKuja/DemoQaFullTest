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

    public DemoQaLinksPage verifyResponse(String response) {
        verifyResponse(XpathLocators.responseLink,
                response,
                "Response message is not 201.");
        return this;
    }

    public DemoQaLinksPage clickOnCreatedLink() {
        click(XpathLocators.createdLink);
        return this;
    }


    public DemoQaLinksPage clickOnNoContent() {
        click(XpathLocators.noContentLink);
        return this;
    }

    public DemoQaLinksPage clickOnMoved() {
        click(XpathLocators.movedLink);
        return this;
    }

    public DemoQaLinksPage clickOnBadRequest() {
        click(XpathLocators.badRequestLink);
        return this;
    }

    public DemoQaLinksPage clickOnUnauthorized() {
        click(XpathLocators.unauthorizedLink);
        return this;
    }

    public DemoQaLinksPage clickOnForbidden() {
        click(XpathLocators.forbiddendLink);
        return this;
    }

    public DemoQaLinksPage clickOnNotFound() {
        click(XpathLocators.notFoundLink);
        return this;
    }




}
