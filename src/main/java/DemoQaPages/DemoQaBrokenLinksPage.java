package DemoQaPages;

import XpathLocators.XpathLocators;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DemoQaBrokenLinksPage extends DemoQaHomePage{

    public DemoQaBrokenLinksPage verifyBrokenImages() {
        List<WebElement> images =
                findElements(XpathLocators.imagesXpath);
        List<String> brokenImages = new ArrayList<>();

        for (WebElement img : images) {
            String src = img.getAttribute("src");
            try {

                verifyIsImageRendered(img,
                        "Image is not rendared " + src);
            } catch (Exception e) {
                brokenImages.add("UI broken " + src);
            }
                int statusCode = getHttpResponseCode(src);

            try {
                verifyHttpStatus(statusCode, 200, "Broken image (HTTP): " + src);
            } catch (AssertionError e) {
                brokenImages.add("HTTP broken: " + src + " -> " + statusCode);
            }
        }

        Assertions.assertTrue(brokenImages.isEmpty(),
                "Broken images found: \n" + brokenImages);


        return this;
    }


}
