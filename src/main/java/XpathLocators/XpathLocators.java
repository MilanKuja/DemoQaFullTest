package XpathLocators;

public class XpathLocators  {
    //Home page:
    public static final String elementsCard = "//div[@class = 'card-body']//h5[text() = 'Elements']";
    //DropDown View:
    public static final String elementsDropDown = "//div[normalize-space(text())='Elements']";
    public static final String textBoxDrop = "//li[@id = 'item-0']//span[text() = 'Text Box']";
    public static final String checkBoxDrop = "//li[@id = 'item-1']//span[text() = 'Check Box']";
    public static final String radioButtonDrop = "//li[@id = 'item-2']//span[text() = 'Radio Button']";
    public static final String webTablesDrop = "//li[@id = 'item-3']//span[text() = 'Web Tables']";
    public static final String buttonsDrop = "//li[@id = 'item-4']//span[text() = 'Buttons']";
    public static final String linksDrop = "//li[@id = 'item-5']//span[text() = 'Links']";
    public static final String brokenLinksDrop = "//li[@id = 'item-6']//span[text() = 'Broken Links - Images']";
    public static final String UploadAndDownloadDrop = "//li[@id = 'item-7']//span[text() = 'Upload and Download']";



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
    public static final String homeExpandButton = "//span[@title = 'Home']/preceding-sibling::span[contains(@class, 'rc-tree-switcher rc-tree-switcher')]";
    public static final String homeCheckBox = "//span[@title = 'Home']/preceding-sibling::span[contains(@class, 'rc-tree-checkbox')]";
    //Desktop:
    public static final String desktopExpandButton = "//span[@title = 'Desktop']/preceding-sibling::span[contains(@class, 'rc-tree-switcher rc-tree-switcher')]";
    public static final String desktopCheckBox = "//span[@title = 'Desktop']/preceding-sibling::span[contains(@class, 'rc-tree-checkbox')]";
    public static final String notesCheckBox = "//span[@title = 'Notes']/preceding-sibling::span[contains(@class, 'rc-tree-checkbox')]";
    public static final String commandsCheckBox = "//span[@title = 'Commands']/preceding-sibling::span[contains(@class, 'rc-tree-checkbox')]";
    //Documents
    public static final String documentsExpandButton = "//span[@title = 'Documents']/preceding-sibling::span[contains(@class, 'rc-tree-switcher rc-tree-switcher')]";
    public static final String documentsCheckBox = "//span[@title = 'Documents']/preceding-sibling::span[contains(@class, 'rc-tree-checkbox')]";
    public static final String workSpaceCheckBox = "//span[@title = 'WorkSpace']/preceding-sibling::span[contains(@class, 'rc-tree-checkbox')]";
    public static final String officeCheckBox = "//span[@title = 'Office']/preceding-sibling::span[contains(@class, 'rc-tree-checkbox')]";
    //Documents WorkSpace
    public static final String workSpaceExpandButton = "//span[@title = 'WorkSpace']/preceding-sibling::span[contains(@class, 'rc-tree-switcher rc-tree-switcher')]";
    public static final String reactWorkSpaceCheckBox = "//span[@title = 'React']/preceding-sibling::span[contains(@class, 'rc-tree-checkbox')]";
    public static final String angularWorkSpaceCheckBox =  "//span[@title = 'Angular']/preceding-sibling::span[contains(@class, 'rc-tree-checkbox')]";
    public static final String veuWorkSpaceCheckBox =  "//span[@title = 'Veu']/preceding-sibling::span[contains(@class, 'rc-tree-checkbox')]";
    //Documents Office
    public static final String officeExpandButton = "//span[@title = 'Office']/preceding-sibling::span[contains(@class, 'rc-tree-switcher rc-tree-switcher')]";
    public static final String publicOfficeCheckBox = "//span[@title = 'Public']/preceding-sibling::span[contains(@class, 'rc-tree-checkbox')]";
    public static final String privateOfficeCheckBox = "//span[@title = 'Private']/preceding-sibling::span[contains(@class, 'rc-tree-checkbox')]";
    public static final String classifiedOfficeCheckBox = "//span[@title = 'Classified']/preceding-sibling::span[contains(@class, 'rc-tree-checkbox')]";
    public static final String generalOfficeCheckBox = "//span[@title = 'General']/preceding-sibling::span[contains(@class, 'rc-tree-checkbox')]";
    //Downloads
    public static final String downloadsExpandButton = "//span[@title = 'Downloads']/preceding-sibling::span[contains(@class, 'rc-tree-switcher rc-tree-switcher')]";
    public static final String downloadsCheckBox = "//span[@title = 'Downloads']/preceding-sibling::span[contains(@class, 'rc-tree-checkbox')]";
    public static final String wordFileCheckBox = "//span[@title = 'Word File.doc']/preceding-sibling::span[contains(@class, 'rc-tree-checkbox')]";
    public static final String excelFileCheckBox = "//span[@title = 'Excel File.doc']/preceding-sibling::span[contains(@class, 'rc-tree-checkbox')]";
    //Resoult
    public static final String resultText = "//div[@id = 'result']";
    //Plus and Minus expands
    public static final String plusExpandAll = "//button[@aria-label= 'Expand all']";
    public static final String minusCollapseAll = "//button[@aria-label= 'Collapse all']";

    //Radio Buttons
    public static final String radioYesButton = "//label[@for = 'yesRadio']";
    public static final String radioNoButton = "//input[@id = 'noRadio']";
    public static final String radioImpressiveButton = "//label[@for = 'impressiveRadio']";
    public static final String radioButtonResultMessage = "//span[@class = 'text-success']";

    //WebTables
    public static final String addButton = "//button[@id = 'addNewRecordButton']";
    public static final String searchFiled = "//input[@id = 'searchBox']";
    public static final String searchButton = "//div[contains(@class, 'group-append')]";
    public static String editRecord(int recordNumber) {
        return "//span[@id='edit-record-" + recordNumber + "']";
    }
    public static String deleteRecord(int recordNumber) {
        return "//span[@id='delete-record-" + recordNumber + "']";
    }
    public static final String rows = "//div[@class='rt-tr-group']//div[@class='rt-td']";
    //Column header
    public static final String firstNameColumnHeader = "//tr//th[text() ='First Name']";
    public static final String lastNameColumnHeader = "//div[contains(@role, 'columnheader')]//div[text() ='Last Name']";
    public static final String ageColumnHeader = "//div[contains(@role, 'columnheader')]//div[text() ='Age']";
    public static final String emailColumnHeader = "//div[contains(@role, 'columnheader')]//div[text() ='Email']";
    public static final String salaryColumnHeader = "//div[contains(@role, 'columnheader')]//div[text() ='Salary']";
    public static final String departmentColumnHeader = "//div[contains(@role, 'columnheader')]//div[text() ='Department']";
    public static final String actiionColumnHeader = "//div[contains(@role, 'columnheader')]//div[text() ='Action']";
    //Add button
    public static final String addFirstNameInput = "//input[@id = 'firstName']";
    public static final String addLastNameInput = "//input[@id = 'lastName']";
    public static final String addEmailInput = "//input[@id = 'userEmail']";
    public static final String addAgeInput = "//input[@id = 'age']";
    public static final String addSalaryInput = "//input[@id = 'salary']";
    public static final String addDepartmantInput = "//input[@id = 'department']";
    //Labels
    public static final String addFirstNameLabel = "//label[@id = 'firstName-label']";
    public static final String addLastNameLabel = "//label[@id = 'lastName-label']";
    public static final String addEmailLabel = "//label[@id = 'userEmail-label']";
    public static final String addAgeLabel = "//label[@id = 'age-label']";
    public static final String addSalaryLabel = "//label[@id = 'salary-label']";
    public static final String addDepartmantLabel = "//label[@id = 'department-label']";
    public static final String addSubmitButton = "//button[@id = 'submit']";

    //Buttons
    public static final String doubleClickButton = "//button[@id = 'doubleClickBtn']";
    public static final String rightClickButton = "//button[@id = 'rightClickBtn']";
    public static final String clickMeButton = "//button[text() = 'Click Me']";
    public static final String doubleClickMessage = "//p[@id = 'doubleClickMessage']";
    public static final String rightClickMessage = "//p[@id = 'rightClickMessage']";
    public static final String clickMeMessage = "//p[@id = 'dynamicClickMessage']";


    //Links
    public static final String simpleLink = "//a[@id = 'simpleLink']";
    public static final String dynamicLink = "//a[@id = 'dynamicLink']";
    //Api sending links
    public static final String createdLink = "//a[@id = 'created']";
    public static final String noContentLink = "//a[@id = 'no-content']";
    public static final String movedLink = "//a[@id = 'moved']";
    public static final String badRequestLink = "//a[@id = 'bad-request']";
    public static final String unauthorizedLink = "//a[@id = 'unauthorized']";
    public static final String forbiddenLink = "//a[@id = 'forbidden']";
    public static final String notFoundLink = "//a[@id = 'invalid-url']";
    public static final String responseLink = "//p[@id = 'linkResponse']";

    //Broken Links-Images
    public static final String imagesXpath = "//img";
            // "//div[@class = 'col-12 mt-4 col-md-6']//img[contains(@src, 'images')]";

    //Upload and Download
    public static final String downloadButton = "//a[@id = 'downloadButton']";
    public static final String uploadButton = "//input[@id = 'uploadFile']";
    public static final String uplodedFileName = "//p[@id = 'uploadedFilePath']";

}


