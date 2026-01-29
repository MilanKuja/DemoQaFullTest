package DemoQaPages;

import XpathLocators.XpathLocators;

public class DemoQaUploadAndDownload extends DemoQaHomePage{
    public DemoQaUploadAndDownload clickOnDownloadButton(){
        click(XpathLocators.downloadButton);
        renameDownloadedTmpCrDownloadFile("samplefile.jpeg", 10);
        return this;
    }

}
