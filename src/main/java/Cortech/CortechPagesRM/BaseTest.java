package Cortech.CortechPagesRM;

import DriverSetup.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest extends Driver {

    protected WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(3));

    protected Actions getActions() {
        return new Actions(getDriver());
    }

    protected WebElement findElement(String xpath) {
        return getDriver().findElement(By.xpath(xpath));
    }

    public void actionClick(String xpath) {
        WebElement element = findElement(xpath);
        getActions().click(element).perform();
    }

    public void click(String xpath) {
        WebElement element = findElement(xpath);
        element.click();
    }

    public void clickButtonAndWait(String xpath, String xpathWait) {
        WebElement element = findElement(xpath);
        element.click();
        waitForElementLocatedBy(xpathWait);
    }


    public void sendKeys(String xpath, String text) {
        findElement(xpath).sendKeys(text);
        ;
    }

    public void waitForElementLocatedBy(String xpath) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public void scrollToElement(String xpath) {
        getActions().scrollToElement(findElement(xpath)).perform();
    }




    //AddEditCompanyDialog







}
