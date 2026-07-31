package DriverSetup;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Driver {

    @Getter
    private static WebDriver driver;

    public static void createDriver(){

            if (getDriver() == null) {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            options.addArguments("start-maximized");
            options.addArguments("--disable-notifications");

            Map<String, Object> prefs = new HashMap<>();
            prefs.put("download.default_directory",
                    System.getProperty("user.dir") + "/downloads");
            prefs.put("download.prompt_for_download", false);
            prefs.put("safebrowsing.enabled", true);

            options.setExperimentalOption("prefs", prefs);

            driver = new ChromeDriver(options);
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null
            ;

        }
    }




}