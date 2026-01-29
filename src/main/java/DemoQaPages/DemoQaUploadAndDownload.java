package DemoQaPages;

import XpathLocators.XpathLocators;
import Configs.Config;

public class DemoQaUploadAndDownload extends DemoQaHomePage{
    public DemoQaUploadAndDownload clickOnDownloadButton(){
        click(XpathLocators.downloadButton);
        renameDownloadedTmpCrDownloadFile("samplefile.jpeg", 10);
        return this;
    }

    public DemoQaUploadAndDownload uploadFile() {
        findElement(XpathLocators.uploadButton).sendKeys(Config.downloadPath + "/sampleFile.jpeg");
        return this;
    }

    public DemoQaUploadAndDownload verifyUploadedFile(String fileName) {
        verifyUploadedFile(fileName, XpathLocators.uplodedFileName, "Expected file was not uploaded");
        return this;
    }

}
