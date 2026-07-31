package CortechTestRM;

import Cortech.CortechPagesRM.Dialogs.AddEditCompanyDialog;
import Cortech.CortechPagesRM.SuperAdmin.Companies;
import Cortech.CortechPagesRM.SuperAdmin.Login;
import Cortech.CortechPagesRM.RMBaseTest;
import org.junit.jupiter.api.Test;

public class T001verifyAllInformationForCreatedCompany extends RMBaseTest {

    @Test
        public void testing() {
        Login loginpage = new Login(getDriver());
        loginpage.logInToSuperAdmin();

        Companies companies = new Companies(getDriver());
        companies.addCompany();

        AddEditCompanyDialog addEditCompanyDialog = new AddEditCompanyDialog(getDriver());
        addEditCompanyDialog.fillInFirstName("Misa").fillInLastName("Mikula")
                .fillInPhoneNumber("(111) 111-1111").fillInEmailAddress("mikula123@gmail.com")
                .fillInCompanyName("MIKULA TRANS LLC").fillInAddressInput("Svetozara Markovica 95")
                ;


    }






}
