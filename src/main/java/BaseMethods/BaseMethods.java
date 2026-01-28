package BaseMethods;

import DriverSetup.Driver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class BaseMethods extends Driver {

    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    JavascriptExecutor js = (JavascriptExecutor) getDriver();

    //Click methods

    public void click(String xpath){
        waitForElementToBeClickable(xpath);
        findElement(xpath).click();

    }

    public void actionClick(String xpath){
        waitForElementToBeClickable(xpath);
        Actions actions = new Actions(getDriver());
        actions.click(findElement(xpath)).perform();
    }

    public void rightClick(String xpath){
        waitForElementToBeClickable(xpath);
        Actions actions = new Actions(getDriver());
        actions.contextClick(findElement(xpath)).perform();
    }

    public void doubleClick(String xpath){
        waitForElementToBeClickable(xpath);
        Actions actions = new Actions(getDriver());
        actions.doubleClick(findElement(xpath)).perform();
    }

    public void actionClickJavaScript(String xpath){
        try {
            waitForElementLocatedBy(xpath);

            js.executeScript("arguments[0].scrollIntoView({block: 'ceneter'})", findElement(xpath));

            waitForElementToBeClickable(xpath);

            actionClick(xpath);

        } catch (Exception e){
            WebElement element = findElement(xpath);
            js.executeScript("arguments[0].click();", element);
        }
    }

    //Wait methods

    public void waitForElementToBeClickable(String xpath) {
        wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.xpath(xpath))));
    }

    public void waitForElementToBeVisible(String xpath){
        wait.until(ExpectedConditions.visibilityOf(findElement(xpath)));
    }

    public void waitForElementNotVisible(String xpath){
        wait.until(ExpectedConditions.invisibilityOf(findElement(xpath)));
    }

    public void waitForElementLocatedBy (String xpath){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public void waitForElementNotLocatedBy (String xpath){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
    }

    public void waitForPresenceOfElement(String string){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(string)));
    }


    //Get methods

    public String getText (String xpath){
        waitForElementLocatedBy(xpath);
        return findElement(xpath).getText().replace("\n", "").trim();
    }


    public String getTextWithSpace (String xpath){
        waitForElementLocatedBy(xpath);
        return findElement(xpath).getText().replace("\n"," ").trim();
    }

    public String getAttribute(String xpath, String attribute){
        waitForElementLocatedBy(xpath);
        return findElement(xpath).getAttribute(attribute);
    }


    //Scroll methods

    public void scrollToElementCenter(String xpath){
        js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});",findElement(xpath));
    }

    public void scrollBy(int x, int y){
        js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
    }

    public void scrollToTop(){
        js.executeScript("window.scrollTo(0, 0)");
    }

    public void scrollToBottom(){
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    //Verify methods

    public boolean elementIsVisible(String xpath){
        boolean isVisible = true;
        try{
            waitForElementToBeVisible(xpath);
        } catch (Exception e){
            isVisible = false;
        } return isVisible;
    }

    public boolean elementIsNotVisible(String xpath){
        boolean isNotVisible = true;
        try {
            waitForElementNotVisible(xpath);
        } catch (Exception e) {
            isNotVisible = false;
        } return isNotVisible;
    }

    public void verifyElementIsDisabled(String xpath){
        waitForPresenceOfElement(xpath);
        Assertions.assertFalse(findElement(xpath).isEnabled(), "Element is enabled");

    }

    public void verifyPlaceHolder(String xpath, String text){
        waitForElementToBeVisible(xpath);
        Assertions.assertEquals(text, getAttribute(xpath, "placeholder"), "Placeholder text is not correct!!");

    }

    public void verifyText(String xpath, String text, String message){
        waitForElementLocatedBy(xpath);
        Assertions.assertEquals(text, getText(xpath), "Text is not correct");
    }

    public void verifyTexts(String xpath, String text, String message){
        waitForElementToBeVisible(xpath);
        Assertions.assertEquals(text, getTextWithSpace(xpath), "Text is not correct");
    }

    public void verifyCheckBoxChecked(String xpath, String attribute, String contains, String message){
        waitForElementToBeVisible(xpath);
        Assertions.assertTrue(findElement(xpath).getAttribute(attribute).contains(contains), message);
    }

    public void verifyResponse(String xpath, String text, String message) {
        waitForPresenceOfElement(xpath);
        Assertions.assertTrue(getText(xpath).contains(text)
                , message);
    }

    public void verifyHttpStatus(int actual, int expected, String message) {
        Assertions.assertEquals(expected, actual, message);
    }

    public void verifyIsImageRendered(WebElement image, String message) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();

        boolean isRendered = (Boolean) js.executeScript(
                "return arguments[0].complete && arguments[0].naturalWidth > 0;",
                image
        );



    }



    //Other methods

    public void openUrl(String url){
        createDriver();
        getDriver().navigate().to(url);

    }

    public void sendKeys(String xpath, String string){
        waitForElementToBeVisible(xpath);
        findElement(xpath).sendKeys(string);
    }

    public void clearInput(String xpath){
        findElement(xpath).click();
        findElement(xpath).sendKeys(Keys.CONTROL + "a");
        findElement(xpath).sendKeys(Keys.BACK_SPACE);
    }

    public void isSortedAlphabetically(String xpath, int totalColumns) {
        for (int col = 1; col <= totalColumns; col++) {

            // XPath za kolonu 'col' u svim redovima
            String columnXpath = xpath + "[" + col + "]";

            waitForPresenceOfElement(xpath);
            List<WebElement> elements = findElements(xpath);

            List<String> actual = elements.stream()
                    .map(WebElement::getText)
                    .filter(text -> !text.isBlank())
                    .toList();

            List<String> expected = new ArrayList<>(actual);
            expected.sort(String.CASE_INSENSITIVE_ORDER);

            Assertions.assertEquals(expected, actual, "Podaci nisu rasporedjeni po abecedi");

        }
    }

    public String  switchToNewTab(){
        String originalTab = getDriver().getWindowHandle();
        Set<String> allTabs = getDriver().getWindowHandles();
        for (String tab : allTabs) {
            if (!tab.equals(originalTab)) {
                getDriver().switchTo().window(tab);
                break;
            }
        }
        return originalTab;
    }

    public void closeTabAndReturnTo(String originalTab) {
        getDriver().close();
        getDriver().switchTo().window(originalTab);
    }

    public void addValuePlusMinus(String string, String plusXpath, String minusXpath, int targetValue) {
        WebElement element = getDriver().findElement(By.xpath(string));
        int currentValue = Integer.parseInt(element.getText().trim());

        String directionXpath = targetValue > currentValue ? plusXpath : minusXpath;

        while(currentValue != targetValue){
            getDriver().findElement(By.xpath(directionXpath)).click();
            currentValue = Integer.parseInt(element.getText().trim());
            directionXpath = targetValue > currentValue ? plusXpath : minusXpath;
        }
    }

    public void moveSliderToValueLeftAndRight(String xpath, int targetValue){
        WebElement slider = getDriver().findElement(By.xpath(xpath));

        int currentValue = Integer.parseInt(slider.getAttribute("value"));
        int step = Integer.parseInt(slider.getAttribute("step"));

        Keys direction = targetValue > currentValue ? Keys.ARROW_RIGHT : Keys.ARROW_LEFT;

        while (currentValue != targetValue){
            slider.sendKeys(direction);
            currentValue = Integer.parseInt(Objects.requireNonNull(slider.getDomAttribute("value")));
        }
    }

    public void moveSliderToValueUpAndDown(String xpath, int targetValue){
        WebElement slider = getDriver().findElement(By.xpath(xpath));

        int currentValue = Integer.parseInt(slider.getAttribute("value"));
        int step = Integer.parseInt(slider.getAttribute("step"));

        Keys direction = targetValue > currentValue ? Keys.ARROW_UP : Keys.ARROW_DOWN;

        while (currentValue != targetValue){
            slider.sendKeys(direction);
            currentValue = Integer.parseInt(Objects.requireNonNull(slider.getDomAttribute("value")));
        }
    }

    public WebElement findElement(String xpath){
        return  getDriver().findElement(By.xpath(xpath));
    }

    public List<WebElement> findElements(String xpath) {
        return getDriver().findElements(By.xpath(xpath));
    }

    public int getHttpResponseCode(String url) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.connect();

            return connection.getResponseCode();

        } catch (Exception e) {
            return -1; //request nije uspeo
        }

    }


}

