package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.logger.Logger;
import webdriver.extention.WebDriverHandler;

import java.util.List;

public class VacanciesPage extends BasePage {
    @FindBy(how = How.ID, using = "menu-item-3249")
    private WebElement automationVacancyItem;
    @FindBy(how = How.XPATH, using = "//div[./h1[text() = 'Test Automation Engineer']]//ul[1]/li")
    private List<WebElement> profSkillsParagraph;

    public void clickAutomationVacancyItem() {
        Logger.info("Clicking \"Test Automation Engineer\" vacancy");
        WebDriverHandler.waitForElementToBeDisplayed(automationVacancyItem);
        automationVacancyItem.click();
    }

    public int getProfSkillsParagraphSize() {
        try {
            return profSkillsParagraph.size();
        }
        catch (NullPointerException e)
        {
            e.getStackTrace();
            return 0;
        }
    }
}
