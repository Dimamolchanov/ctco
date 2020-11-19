package webdriver.Implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import webdriver.Abstraction.IWebDriverInstanceInit;

public class ChromeWebdriverInstance implements IWebDriverInstanceInit {
    public static final String VERSION_CHROME_DRIVER = "87.0.4280.20";
    @Override
    public WebDriver initWebDriverInstance() {
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().browserVersion(VERSION_CHROME_DRIVER).setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        return new ChromeDriver(chromeOptions);
    }
}
