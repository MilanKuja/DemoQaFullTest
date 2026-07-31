package Cortech.CortechPagesRM;

import DriverSetup.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BaseTest extends Driver {

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

    public void sendKeys(String xpath, String text) {
        findElement(xpath).sendKeys(text); ;

    }

}
