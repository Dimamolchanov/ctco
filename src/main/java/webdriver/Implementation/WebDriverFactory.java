package webdriver.Implementation;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import webdriver.Abstraction.IWebDriverInstanceInit;
import webdriver.BrowserConfiguration;
import webdriver.WebDriverInstantiationException;

public class WebDriverFactory {

    public static IWebDriverInstanceInit initWebDriverInstance(BrowserConfiguration.BrowserType browserType)
    {
        switch (browserType)
        {
            case CHROME:
                //add log("Setting up Chrome");
                return new ChromeWebdriverInstance();
            case FIREFOX:
                //add log("Setting up Firefox");
                return new FirefoxWebdriverInstance();
            case REMOTE:
                //TO DO implement remote webdriver
                throw new NotImplementedException();
            default:
                throw new WebDriverInstantiationException("Unsupported browser!");
        }
    }
}
