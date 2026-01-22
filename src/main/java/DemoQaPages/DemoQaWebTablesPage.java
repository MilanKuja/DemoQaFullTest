package DemoQaPages;

import XpathLocators.XpathLocators;

public class DemoQaWebTablesPage extends DemoQaHomePage{

    public DemoQaWebTablesPage clicOnAddButton(){
        click(XpathLocators.addButton);
        return this;
    }

    public DemoQaWebTablesPage clickOnDeleteRecord(int record){
        click(XpathLocators.deleteRecord(record));
        return this;
    }

    public DemoQaWebTablesPage clickOnEditRecord(int record){
        click(XpathLocators.editRecord(record));
        return this;
    }

    public DemoQaWebTablesPage doubleClickInEditForm(String xpath){
        doubleClick(xpath);
        return this;
    }

    public DemoQaWebTablesPage typeFirstName(String string){
        sendKeys(XpathLocators.addFirstNameInput, string);
        return this;
    }

    public DemoQaWebTablesPage typeLastName(String string){
        sendKeys(XpathLocators.addLastNameInput, string);
        return this;
    }


    public DemoQaWebTablesPage typeEmail(String string){
        sendKeys(XpathLocators.addEmailInput, string);
        return this;
    }

    public DemoQaWebTablesPage typeAge(String string){
        sendKeys(XpathLocators.addAgeInput, string);
        return this;
    }

    public DemoQaWebTablesPage typeSalary(String string){
        sendKeys(XpathLocators.addSalaryInput, string);
        return this;
    }

    public DemoQaWebTablesPage typeDepartmant(String string){
        sendKeys(XpathLocators.addLastNameInput, string);
        return this;
    }

    public DemoQaWebTablesPage deleteInput(String xpath){
        clearInput(xpath);
        return this;
    }

    public DemoQaWebTablesPage clickOnSubmitButton(){
        click(XpathLocators.submitButton);
        return this;
    }



}
