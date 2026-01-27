package DemoQaPages;

import XpathLocators.XpathLocators;

public class DemoQaLinksPage extends DemoQaHomePage {
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

    public DemoQaLinksPage clickOnCreatedLink() throws InterruptedException {
        click(XpathLocators.createdLink);
        Thread.sleep(500);
        return this;
    }

    public DemoQaLinksPage clickOnNoContent() throws InterruptedException {
        actionClick(XpathLocators.noContentLink);
        Thread.sleep(500);
        return this;
    }

    public DemoQaLinksPage clickOnMoved() throws InterruptedException {
        click(XpathLocators.movedLink);
        Thread.sleep(500);
        return this;
    }

    public DemoQaLinksPage clickOnBadRequest() throws InterruptedException {
        click(XpathLocators.badRequestLink);
        Thread.sleep(500);
        return this;
    }

    public DemoQaLinksPage clickOnUnauthorized() throws InterruptedException {
        click(XpathLocators.unauthorizedLink);
        Thread.sleep(500);
        return this;
    }

    public DemoQaLinksPage clickOnForbidden() throws InterruptedException {
        click(XpathLocators.forbiddenLink);
        Thread.sleep(500);
        return this;
    }

    public DemoQaLinksPage clickOnNotFound() throws InterruptedException {
        click(XpathLocators.notFoundLink);
        Thread.sleep(500);
        return this;
    }

    public DemoQaLinksPage verifyResponseForCreated() {
        verifyResponse(XpathLocators.responseLink,
                "201",
                "Response message is not 201");
        return this;
    }

    public DemoQaLinksPage verifyResponseForNoContent() {
        verifyResponse(XpathLocators.responseLink,
                "204",
                "Response message is not 204");
        return this;
    }

    public DemoQaLinksPage verifyResponseForMoved() {
        verifyResponse(XpathLocators.responseLink,
                "301",
                "Response message is not 301");
        return this;
    }


    public DemoQaLinksPage verifyResponseForBadRequest() {
        verifyResponse(XpathLocators.responseLink,
                "400",
                "Response message is not 400");
        return this;
    }

    public DemoQaLinksPage verifyResponseForUnauthorized() {
        verifyResponse(XpathLocators.responseLink,
                "401",
                "Response message is not 401");
        return this;
    }

    public DemoQaLinksPage verifyResponseForForbidden() {
        verifyResponse(XpathLocators.responseLink,
                "403",
                "Response message is not 403");
        return this;
    }

    public DemoQaLinksPage verifyResponseForNotFound() {
        verifyResponse(XpathLocators.responseLink,
                "404",
                "Response message is not 404");
        return this;
    }





}
