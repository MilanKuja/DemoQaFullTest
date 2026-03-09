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

    public DemoQaButtonsPage clickOnButtonsDrop(){
        click(XpathLocators.buttonsDrop);
        return new DemoQaButtonsPage();
    }

    public DemoQaLinksPage clickOnLinksDrop(){
        click(XpathLocators.linksDrop);
        return new DemoQaLinksPage();
    }

    public DemoQaBrokenLinksPage clickOnBrokenLinksDrop(){
        click(XpathLocators.brokenLinksDrop);
        return new DemoQaBrokenLinksPage();
    }

    public DemoQaUploadAndDownload clickOnUploadAndDownloadDrop(){
        click(XpathLocators.UploadAndDownloadDrop);
        return new DemoQaUploadAndDownload();
    }
}
