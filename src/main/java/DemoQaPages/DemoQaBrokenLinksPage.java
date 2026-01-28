package DemoQaPages;

import XpathLocators.XpathLocators;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DemoQaBrokenLinksPage extends DemoQaHomePage{

    public DemoQaBrokenLinksPage verifyBrokenImages() {
        List<WebElement> images = findElements(XpathLocators.imagesXpath);

        for (WebElement img : images) {
            String src = img.getAttribute("src");

            if (src == null || src.isEmpty()) {
                System.out.println("Image is without src");
                continue;
            }

            int statusCode = getHttpResponseCode(src);

            verifyHttpStatus(statusCode,
                    200,
                    "Broken image " + src);
        }
        return this;
    }


}
