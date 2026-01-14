package BaseMethods;

import DriverSetup.Driver;
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


    //Verify methods


    //Other methods
}
