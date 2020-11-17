package webdriver;

public class WebDriverInstantiationException extends RuntimeException {
    private static final long serialVersionUID = -1691668615381069260L;
    public WebDriverInstantiationException(String errorMessage) {
        super("WebDriver instance was not created due to the error: " + errorMessage);
    }
}
