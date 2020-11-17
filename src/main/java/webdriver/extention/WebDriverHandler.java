package webdriver.extention;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.Implementation.DriverManager;

public class WebDriverHandler {

    public static void waitForElementToBeDisplayed(WebElement element) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriverInstance(), 10);
        wait.until(driver -> {
            try
            {
                return isDisplayedAndEnabled(element);
            }
            catch (Exception e)
            {
                return false;
            }
        });
    }

    public static Boolean isDisplayedAndEnabled(WebElement element) {
        return element.isEnabled() && element.getAttribute("disabled") == null && element.isDisplayed();
    }

    public static void moveToElement(WebElement element) {
        Actions mover = new Actions(DriverManager.getWebDriverInstance());
        mover.moveToElement(element).build().perform();
    }

    public static void moveToElementAndClick(WebElement element) {
        Actions mover = new Actions(DriverManager.getWebDriverInstance());
        mover.moveToElement(element).click().build().perform();
    }
}
