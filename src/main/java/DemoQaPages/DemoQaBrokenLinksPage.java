package DemoQaPages;

import XpathLocators.XpathLocators;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DemoQaBrokenLinksPage extends DemoQaHomePage {

    public DemoQaBrokenLinksPage verifyBrokenImages() {

        List<WebElement> images = findElements(XpathLocators.imagesXpath);
        List<String> brokenImages = new ArrayList<>();

        for (WebElement img : images) {
            String src = img.getAttribute("src");

            // Optional: čekanje dok se slika učita (da pokrije lazy-load)
            try {
                WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
                wait.until(driver -> ((JavascriptExecutor) driver)
                        .executeScript("return arguments[0].complete;", img));
            } catch (Exception e) {
                // ako slika ne učita u 5s, možemo smatrati broken
                brokenImages.add(src + " (timeout)");
                continue;
            }

            // Soft assert: uhvati AssertionError iz BaseMethod
            try {
                verifyIsImageRendered(img, "Image is not rendered: " + src);
            } catch (AssertionError e) {
                brokenImages.add(src); // dodaj u listu
                System.out.println("Broken image detected: " + src);
            }
        }

        // Finalni assert koji failuje test ako ima broken images
        Assertions.assertTrue(
                brokenImages.isEmpty(),
                "Broken images found:\n" + brokenImages
        );

        return this;
    }

    public DemoQaUploadAndDownload clickOnUploadAndDownLoadDrop() {
        click(XpathLocators.UploadAndDownloadDrop);
        return new DemoQaUploadAndDownload();
    }


}
