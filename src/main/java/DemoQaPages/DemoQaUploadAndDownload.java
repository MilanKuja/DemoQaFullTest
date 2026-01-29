package DemoQaPages;

import XpathLocators.XpathLocators;

public class DemoQaUploadAndDownload extends DemoQaHomePage{
    public DemoQaUploadAndDownload clickOnDownloadButton(){
        click(XpathLocators.downloadButton);
        return this;
    }

}
