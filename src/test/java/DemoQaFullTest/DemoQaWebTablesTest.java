package DemoQaFullTest;

import DemoQaPages.DemoQaHomePage;
import XpathLocators.XpathLocators;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoQaWebTablesTest extends DemoQaHomePage{
    @BeforeEach
    public void startUp(){openUrl("https://demoqa.com/");}



    @Test
    public void testing(){
        DemoQaHomePage demoQaHomePage = new DemoQaHomePage();

        demoQaHomePage.clickOnElements().clickOnWebTablesDrop()
        //WebTalbes
                .clickOnDeleteRecord(1).clickOnEditRecord(2)
                .deleteInput(XpathLocators.addFirstNameInput).typeFirstName("Gavrilo")
                .deleteInput(XpathLocators.addLastNameInput).typeLastName("Ilic")
                .deleteInput(XpathLocators.addEmailInput).typeEmail("crnigavra@gmail.com")
                .deleteInput(XpathLocators.addAgeInput).typeAge("4")
                .deleteInput(XpathLocators.addSalaryInput).typeSalary("35000")
                .deleteInput(XpathLocators.addDepartmantInput).typeDepartmant("Kucni pas").clickOnSubmitButton()
                .clickOnDeleteRecord(3)
                .clicOnAddButton()
                .typeFirstName("Milutin")
                .typeLastName("Ilic")
                .typeEmail("zutimica@gmail.com")
                .typeAge("5")
                .typeSalary("800000")
                .typeDepartmant("Gazda na kucu").clickOnSubmitButton()
                .searchRecord("Gavrilo")
                .clickOnFirstNameHeader()
                .clickOnButtonsDrop();
    }

    @AfterEach
    public void tareDown(){
        quitDriver();
    }
}

