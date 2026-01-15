package DriverSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;

public class Driver  {
    private static final String CHROME_DRIVER = "webdriver.chrome.driver";

    private static WebDriver driver;

    protected static void setDriver(WebDriver driver) {
        Driver.driver = driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static List<String> createDriver() {
        if (getDriver() == null) {
            try {
                InputStream inputStream = Driver.class.getClassLoader().getResourceAsStream("chromedriver.exe");

                if (inputStream == null) {
                    throw new RuntimeException("chromedriver.exe nije pronadjen u rescorces");
                }

                File tempFile = File.createTempFile("chromedriver", ".exe");
                tempFile.deleteOnExit();

                try (FileOutputStream out = new FileOutputStream(tempFile)) {
                    inputStream.transferTo(out);
                }

                System.setProperty(CHROME_DRIVER, tempFile.getAbsolutePath());
            } catch (Exception e) {
                throw new RuntimeException("Greska prilikom preuzimanja chromedriver.exe iz resources", e);
            }

            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            options.addArguments("start-maximized");
            options.addArguments("--disable-notifications");

            driver = new ChromeDriver(options);
            setDriver(driver);
        }
        return null;
    }

    public static void quitDriver() {
        if (getDriver() != null) {
            getDriver().quit();
            setDriver(null);

        }
    }
}
