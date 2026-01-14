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

    public void actionClickJavaScript(String string){
        try {
            waitForElementLocatedBy(string);

            js.executeScript("arguments[0].scrollIntoView({block: 'ceneter'})", getDriver().findElement(By.xpath(string)));

            waitForElementToBeClickable(getDriver().findElement(By.xpath(string)));

            actionClick(getDriver().findElement(By.xpath(string)));

        } catch (Exception e){
            WebElement element = getDriver().findElement(By.xpath(string));
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

    public void waitForElementLocatedBy (String string){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(string)));
    }

    public void waitForElementNotLocatedBy (String string){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(string)));
    }


    //Get methods

    public String getText (String string){
        waitForElementLocatedBy(string);
        return getDriver().findElement(By.xpath(string)).getText().trim();
    }

    public String getStringAttribute(String string, String attribute){
        waitForElementLocatedBy(string);
        return getDriver().findElement(By.xpath(string)).getAttribute(attribute);
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


    //Other methods
}
