package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import webdriver.extention.WebDriverHandler;

import static utils.PropertiesLoader.getProperty;

public class HomePage extends BasePage {

    @FindBy(how = How.ID, using = "menu-item-127")
    private WebElement careersNavMenuItem;
    @FindBy(how = How.ID, using = "menu-item-131")
    private WebElement vacanciesSubNavMenuItem;

    public void openHomePage(){
        navigateToPage(getProperty("baseUrl"));
    }

    public VacanciesPage openVacanciesPage(){
        expandCareersNavMenu();
        clickVacanciesSubMenuItem();
        return new VacanciesPage();
    }

    public void expandCareersNavMenu(){
        WebDriverHandler.waitForElementToBeDisplayed(careersNavMenuItem);
        WebDriverHandler.moveToElement(careersNavMenuItem);
    }

    public void clickVacanciesSubMenuItem(){
        WebDriverHandler.waitForElementToBeDisplayed(vacanciesSubNavMenuItem);
        WebDriverHandler.moveToElementAndClick(vacanciesSubNavMenuItem);
    }
}
