package pages;

import org.openqa.selenium.support.PageFactory;
import webdriver.Implementation.DriverManager;

public abstract class BasePage {

    public BasePage()    {
        PageFactory.initElements(DriverManager.getWebDriverInstance(), this);
    }

    protected void navigateToPage(String page){
        DriverManager.getWebDriverInstance().get(page);
    }

    protected void refreshPage() {
        DriverManager.getWebDriverInstance().navigate().refresh();
    }
}
