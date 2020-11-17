package webdriver.Implementation;

import org.openqa.selenium.WebDriver;
import webdriver.BrowserConfiguration;

import java.util.concurrent.TimeUnit;


public class DriverManager {

    private static WebDriver driver;

    private DriverManager(){}

    public static WebDriver getWebDriverInstance() {
        if (driver == null) {
            driver = WebDriverFactory.initWebDriverInstance(BrowserConfiguration.getBrowser()).initWebDriverInstance();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeBrowser() {
        driver.quit();
        driver = null;
    }
}
