package BaseMethods;

import DriverSetup.Driver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseMethods extends Driver {

    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    JavascriptExecutor js = (JavascriptExecutor) getDriver();

    //Click methods

    public void click(WebElement element){
        waitForElementToBeClickable(element);
        element.click();
    }

    public void actionClick(WebElement element){
        waitForElementToBeClickable(element);
        Actions actions = new Actions(getDriver());
        actions.click(element).perform();
    }

    public void rightClick(WebElement element){
        waitForElementToBeClickable(element);
        Actions actions = new Actions(getDriver());
        actions.contextClick(element).perform();
    }

    public void dubleClick(WebElement element){
        waitForElementToBeClickable(element);
        Actions actions = new Actions(getDriver());
        actions.doubleClick(element).perform();
    }

    public void actionClickJavaScript(String xpath){
        try {
            waitForElementLocatedBy(xpath);

            js.executeScript("arguments[0].scrollIntoView({block: 'ceneter'})", getDriver().findElement(By.xpath(xpath)));

            waitForElementToBeClickable(getDriver().findElement(By.xpath(xpath)));

            actionClick(getDriver().findElement(By.xpath(xpath)));

        } catch (Exception e){
            WebElement element = getDriver().findElement(By.xpath(xpath));
            js.executeScript("arguments[0].click();", element);
        }
    }

    //Wait methods

    public void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementToBeVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementNotVisible(WebElement element){
        wait.until(ExpectedConditions.invisibilityOf(element));
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

    //Verify methods

    public boolean elementIsVisible(WebElement element){
        boolean isVisible = true;
        try{
            waitForElementToBeVisible(element);
        } catch (Exception e){
            isVisible = false;
        } return isVisible;
    }

    public boolean elementIsNotVisible(WebElement element){
        boolean isNotVisible = true;
        try {
            waitForElementNotVisible(element);
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
}

