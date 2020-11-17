package webdriver.Implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import webdriver.Abstraction.IWebDriverInstanceInit;

public class ChromeWebdriverInstance implements IWebDriverInstanceInit {
    @Override
    public WebDriver initWebDriverInstance() {
        //please update the absolute path for your local directory
        System.setProperty("webdriver.chrome.driver", "c:\\MYFILES\\automation\\CT_DEV_TEST\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        return new ChromeDriver(chromeOptions);
    }
}
