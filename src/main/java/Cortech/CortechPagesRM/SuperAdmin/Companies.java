package Cortech.CortechPagesRM.SuperAdmin;

import Cortech.CortechPagesRM.BaseTest;
import Cortech.CortechPagesRM.Dialogs.AddEditCompanyDialog;
import Cortech.CortechPagesRM.Labels.CompaniesLabels;
import org.openqa.selenium.WebDriver;
import resources.XpathLocators;

public class Companies extends BaseTest {

    public Companies(WebDriver driver) {
        super();
    }

    public AddEditCompanyDialog addCompany() {
        waitForElementLocatedBy(XpathLocators.addCompaniesButton(CompaniesLabels.ADD_COMPANY));
        clickButtonAndWait(XpathLocators.addCompaniesButton(CompaniesLabels.ADD_COMPANY)
                , XpathLocators.superAdminDialog(CompaniesLabels.ADD_COMPANY));
        return new AddEditCompanyDialog(getDriver());
    }
}
