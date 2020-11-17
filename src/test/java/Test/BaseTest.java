package Test;

import org.junit.After;
import org.junit.Before;
import utils.logger.Logger;
import webdriver.Implementation.DriverManager;

import static utils.PropertiesLoader.getProperty;

public class BaseTest {
    @Before
    public void setUp()    {
        Logger.setLoggerLevel(Integer.parseInt(getProperty("loggerLevel")));
        Logger.debug("Starting webdriver instance");
        DriverManager.getWebDriverInstance();

    }

    @After
    public void tearDown(){
        Logger.debug("Stopping webdriver instace");
        DriverManager.closeBrowser();
    }
}
