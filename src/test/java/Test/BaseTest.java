package Test;

import org.junit.After;
import org.junit.Before;
import webdriver.Implementation.DriverManager;

public class BaseTest {
    @Before
    public void setUp()    {
        DriverManager.getWebDriverInstance();
    }

    @After
    public void tearDown(){
        DriverManager.CloseBrowser();
    }
}
