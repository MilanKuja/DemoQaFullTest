package Cortech.CortechPagesRM.SuperAdmin;

import Cortech.CortechPagesRM.BaseTest;
import Cortech.CortechPagesRM.Labels.LogInLabels;
import org.openqa.selenium.WebDriver;
import resources.XpathLocators;

public class Login extends BaseTest {

    public Login(WebDriver driver) {
        super();
    }


    public Companies logInToSuperAdmin() {
        sendKeys(XpathLocators.logInInputField(LogInLabels.EMAIL), superAdminUserName);
        sendKeys(XpathLocators.logInInputField(LogInLabels.PASSWORD), superAdminPassword);
        click(XpathLocators.logInButton(LogInLabels.LOGIN));
        return new Companies(getDriver());

    }

}
