package webdriver.Implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import webdriver.Abstraction.IWebDriverInstanceInit;

public class FirefoxWebdriverInstance implements IWebDriverInstanceInit {
    @Override
    public WebDriver initWebDriverInstance() {
        return new FirefoxDriver();
    }
}
