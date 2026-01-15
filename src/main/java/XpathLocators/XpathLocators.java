package XpathLocators;

public class XpathLocators  {
    //Home page:
    public static final String elementsCard = "//div[@class = 'card-body']//h5[text() = 'Elements']";
    //DropDown View:
    public static final String elementsDropDown = "//div[normalize-space(text())='Elements']";
    public static final String textBoxDrop = "//li[@id = 'item-0']//span[text() = 'Text Box']";



    //TextBox:
    public static final String fullNameInput = "//input[@id = 'userName']";
    public static final String emailInput = "//input[@id = 'userEmail']";


}


