package Test;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.VacanciesPage;

public class CTDTest extends BaseTest {
    @Test
    public void verifyProfSkillsAmountForAutomation() {
        HomePage homePage = new HomePage();
        homePage.openHomePage();
        VacanciesPage vacanciesPage = homePage.openVacanciesPage();
        vacanciesPage.clickAutomationVacancyItem();
        Assert.assertEquals("Failed! Number of points in the Paragraph should equals to 5", 5, vacanciesPage.getProfSkillsParagraphSize());

    }
}
