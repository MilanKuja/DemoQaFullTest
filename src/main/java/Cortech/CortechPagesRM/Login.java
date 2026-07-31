package Cortech.CortechPagesRM;

import org.openqa.selenium.WebDriver;
import resources.XpathLocators;

public class Login extends BaseTest{

    private String superAdminUserName = "admin@routemate.ai";
    private String superAdminPassword = "boki";

    public Login(WebDriver driver) {
        super();
    }


    public Login logInToSuperAdmin() {
        sendKeys(XpathLocators.logInInputField(LogInLabels.EMAIL), superAdminUserName);
        sendKeys(XpathLocators.logInInputField(LogInLabels.PASSWORD), superAdminPassword);
        click(XpathLocators.logInButton(LogInLabels.LOGIN));
        return this;

    }

}
