package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.ExperienceSupportPage;
import pages.PetalHomePage;
import util.TestDataMapper;
import java.util.Map;
import static stepDefinitions.BaseSteps.driver;

public class StepDefinitionsExperienceSupportModule {

    private static Map<String, String> userData = (Map<String, String>) TestDataMapper.getTestData().
            get("experienceSupportModuleTestData");

    @Step("the user clicks on experience and support button.")
    @When("the user clicks on experience and support button.")
    public void the_user_clicks_on_experience_and_support_button() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        petalHomePage.navigateToExperienceSupportPage();
    }

    @Step("the user is navigated to a experience support page with change in page url.")
    @Then("the user is navigated to a experience support page with change in page url.")
    public void theUserIsNavigatedToAExperienceSupportPageWithChangeInPageUrl() {
        ExperienceSupportPage experienceSupportPage = PageFactory.initElements(driver, ExperienceSupportPage.class);
        Assert.assertTrue(experienceSupportPage.getCurrentPageURL().contains(userData.get("pageURLValue")));
    }

    @Step("the user scrolls down to procedure section.")
    @When("the user scrolls down to procedure section.")
    public void the_user_scrolls_down_to_procedure_section() {
        ExperienceSupportPage experienceSupportPage = PageFactory.initElements(driver, ExperienceSupportPage.class);
        experienceSupportPage.navigateToProceduresSection();
    }

    @Step("the user reads all the procedures listed.")
    @Then("the user reads all the procedures listed.")
    public void the_user_reads_all_the_procedures_listed() {
        ExperienceSupportPage experienceSupportPage = PageFactory.initElements(driver, ExperienceSupportPage.class);
        Assert.assertEquals(userData.get("procedureContainer"), experienceSupportPage.getProcedureContent());
    }
}
