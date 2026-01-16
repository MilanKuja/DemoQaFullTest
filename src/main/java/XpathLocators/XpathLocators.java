package XpathLocators;

public class XpathLocators  {
    //Home page:
    public static final String elementsCard = "//div[@class = 'card-body']//h5[text() = 'Elements']";
    //DropDown View:
    public static final String elementsDropDown = "//div[normalize-space(text())='Elements']";
    public static final String textBoxDrop = "//li[@id = 'item-0']//span[text() = 'Text Box']";
    public static final String checkBoxDrop = "//li[@id = 'item-1']//span[text() = 'Check Box']";



    //TextBox:
    public static final String fullNameInput = "//input[@id = 'userName']";
    public static final String emailInput = "//input[@id = 'userEmail']";
    public static final String currentAddressInput = "//textarea[@id = 'currentAddress']";
    public static final String permanentAddressInput = "//textarea[@id = 'permanentAddress']";
    public static final String fullNameTextLabel = "//label[@id = 'userName-label']";
    public static final String emailLabel = "//label[@id = 'userEmail-label']";
    public static final String currentAddressLabel = "//label[@id = 'currentAddress-label']";
    public static final String permanentAddressLabel = "//label[@id = 'permanentAddress-label']";
    public static final String textBoxHeader = "//h1[@class = 'text-center']";
    public static final String submitButton = "//button[@id = 'submit']";
    public static final String nameOutput = "//p[@id = 'name']";
    public static final String emailOutput = "//p[@id = 'email']";
    public static final String currentAddressOutput = "//p[@id = 'currentAddress']";
    public static final String permanentAddressOutput = "//p[@id = 'permanentAddress']";

    //CheckBox:
    public static final String homeDropDownButton = "//label[@for='tree-node-home']/preceding-sibling::button";
    public static final String homeCheckBox = "//label[@for = 'tree-node-home']//span[@class = 'rct-checkbox']";
    public static final String desktopCheckBox = "//label[@for='tree-node-desktop']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    public static final String documentsCheckBox = "//label[@for='tree-node-documents']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    public static final String downloadsCheckBox = "//label[@for='tree-node-downloads']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    public static final String resoultText = "//div[@id = 'result']";
}


