package webdriver;

import static utils.PropertiesLoader.getProperty;

public class BrowserConfiguration {
    public enum BrowserType {
        FIREFOX,
        CHROME,
        REMOTE
    }

    public static BrowserType getBrowser() {
        switch (getProperty("browserName")) {
            case "CHROME":
                return BrowserType.CHROME;
            case "FIREFOX":
                return BrowserType.FIREFOX;
            default:
                return BrowserType.REMOTE;
        }
    }

}
