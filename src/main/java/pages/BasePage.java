package pages;

import org.openqa.selenium.support.PageFactory;
import utils.logger.Logger;
import webdriver.Implementation.DriverManager;

import static utils.PropertiesLoader.getProperty;

public abstract class BasePage {

    public BasePage() {
        Logger.debug(String.format("Initialising elements for '%s' page", this.toString()));
        PageFactory.initElements(DriverManager.getWebDriverInstance(), this);
    }

    protected void navigateToPage(String page) {
        DriverManager.getWebDriverInstance().get(page);
    }

    protected void refreshPage() {
        Logger.debug(String.format("Refreshing '%s' page", this.toString()));
        DriverManager.getWebDriverInstance().navigate().refresh();
    }
}
