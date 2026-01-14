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

import java.time.Duration;
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

    public void dubleClick(String xpath){
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
        return getDriver().findElement(By.xpath(xpath)).getText().trim();
    }

    public String getAttribute(String xpath, String attribute){
        waitForElementLocatedBy(xpath);
        return getDriver().findElement(By.xpath(xpath)).getAttribute(attribute);
    }


    //Scroll methods

    public void scrollToElementCenter(WebElement element){
        js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});",element);
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

    public void verifyElementIsDisabled(String string){
        waitForPresenceOfElement(string);
        Assertions.assertFalse(getDriver().findElement(By.xpath(string)).isEnabled(), "Element is enabled");

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

    public void switchToNewTab(){
        String originalTab = getDriver().getWindowHandle();
        Set<String> allTabs = getDriver().getWindowHandles();
        for (String tab : allTabs) {
            if (!tab.equals(originalTab)) {
                getDriver().switchTo().window(tab);
                break;
            }
        }
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

    public WebElement findElement(String string){
        return  getDriver().findElement(By.xpath(string));
    }


}

