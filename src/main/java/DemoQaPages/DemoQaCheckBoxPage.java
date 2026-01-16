package DemoQaPages;

import XpathLocators.XpathLocators;

public class DemoQaCheckBoxPage extends DemoQaTextBoxPage {

    public DemoQaCheckBoxPage clickOnHomeExtandButton() {
        click(XpathLocators.homeDropDownButton);
        return this;
    }

    public DemoQaCheckBoxPage clickOnHomeCheckBox() {
        click(XpathLocators.homeCheckBox);
        return this;
    }

    public DemoQaCheckBoxPage verifyAllCheckBoxesAreCheck() {
        verifyCheckBoxChecked(XpathLocators.desktopCheckBox, "class", "rct-icon-check");
        verifyCheckBoxChecked(XpathLocators.documentsCheckBox, "class", "rct-icon-check");
        verifyCheckBoxChecked(XpathLocators.downloadsCheckBox, "class", "rct-icon-check");
        return this;
    }
}
