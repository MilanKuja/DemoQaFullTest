package CortechTestRM;

import Cortech.CortechPagesRM.Login;
import Cortech.CortechPagesRM.RMBaseTest;
import org.junit.jupiter.api.Test;

public class T001verifyAllInformationForCreatedCompany extends RMBaseTest {

    @Test
        public void testing() {
        Login loginpage = new Login(getDriver());
        loginpage.logInToSuperAdmin();


    }






}
