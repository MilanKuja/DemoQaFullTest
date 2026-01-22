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


}
