package XpathLocators;

public class XpathLocators  {
    //Home page:
    public static final String elementsCard = "//div[@class = 'card-body']//h5[text() = 'Elements']";
    //DropDown View:
    public static final String elementsDropDown = "//div[normalize-space(text())='Elements']";
    public static final String textBoxDrop = "//li[@id = 'item-0']//span[text() = 'Text Box']";
    public static final String checkBoxDrop = "//li[@id = 'item-1']//span[text() = 'Check Box']";
    public static final String radioButtonDrop = "//li[@id = 'item-2']//span[text() = 'Radio Button']";



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
    public static final String homeExpandButton = "//label[@for='tree-node-home']/preceding-sibling::button";
    public static final String homeCheckBox = "//label[@for='tree-node-home']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    //Desktop:
    public static final String desktopExpandButton = "//label[@for='tree-node-desktop']/preceding-sibling::button";
    public static final String desktopCheckBox = "//label[@for='tree-node-desktop']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    public static final String notesCheckBox = "//label[@for='tree-node-notes']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    public static final String commandsCheckBox = "//label[@for='tree-node-commands']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    //Documents
    public static final String documentsExpandButton = "//label[@for='tree-node-documents']/preceding-sibling::button";
    public static final String documentsCheckBox = "//label[@for='tree-node-documents']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    public static final String workSpaceCheckBox = "//label[@for='tree-node-workspace']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    public static final String officeCheckBox = "//label[@for='tree-node-office']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    //Documents WorkSpace
    public static final String workSpaceExpandButton = "//label[@for='tree-node-workspace']/preceding-sibling::button";
    public static final String reactWorkSpaceCheckBox = "//label[@for='tree-node-react']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    public static final String angularWorkSpaceCheckBox =  "//label[@for='tree-node-angular']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    public static final String veuWorkSpaceCheckBox =  "//label[@for='tree-node-vue']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    //Documents Office
    public static final String officeExpandButton = "//label[@for='tree-node-office']/preceding-sibling::button";
    public static final String publicOfficeCheckBox = "//label[@for='tree-node-react']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    public static final String privateOfficeCheckBox = "//label[@for='tree-node-react']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    public static final String classifiedOfficeCheckBox = "//label[@for='tree-node-react']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    public static final String generalOffice = "//label[@for='tree-node-react']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    //Downloads
    public static final String downloadsExpandButton = "//label[@for='tree-node-downloads']/preceding-sibling::button";
    public static final String downloadsCheckBox = "//label[@for='tree-node-downloads']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    public static final String wordFileCheckBox = "//label[@for='tree-node-wordFile']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    public static final String excelFileCheckBox = "//label[@for='tree-node-excelFile']//span[contains(@class,'rct-checkbox')]//*[local-name()='svg']";
    //Resoult
    public static final String resultText = "//div[@id = 'result']";
    //Plus and Minus expands
    public static final String plusExpandAll = "//button[@aria-label= 'Expand all']";
    public static final String minusCollapseAll = "//button[@aria-label= 'Collapse all']";

    //Radio Buttons
    public static final String radioYesButton = "//label[@for = 'yesRadio']";
    public static final String radioNoButton = "//input[@id = 'noRadio']";
    public static final String radioImpressiveButton = "//label[@for = 'impressiveRadio']";
    public static final String radioButtonResultMessage = "//p//span[@class = 'text-success']";



}


