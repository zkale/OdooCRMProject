package com.Odoo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private static WebDriver driver;
    // you can't do like this if constructor is private:
    // Driver obj = new Driver();
    private Driver() {
    }
    // if switch statements complains on string parameter
    // change java version to 7+, better at least 8
    // file - project structure
    public static WebDriver get() {
        if (driver == null) {
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    // if browser type is wrong, stop and trow exception
                    // no browser will be opened
                    throw new RuntimeException("Wrong browser type!");
            }
        }
        return driver;
    }
    public static void close() {
        // if driver still exists
        if (driver != null);
        // close all browsers
        driver.quit();
        // destroy driver object, ready for garbage collector (gb)
        driver = null;
    }
}
