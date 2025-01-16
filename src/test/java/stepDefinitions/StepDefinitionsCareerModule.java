package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.CareersPage;
import pages.PetalHomePage;
import util.TestDataMapper;
import java.util.Map;
import static stepDefinitions.BaseSteps.driver;

public class StepDefinitionsCareerModule {

    private static Map<String, String> userData = (Map<String, String>) TestDataMapper.getTestData().
            get("careerModuleTestData");

    @Step("the user clicks on careers module button")
    @When("the user clicks on careers module button")
    public void the_user_clicks_on_careers_module_button() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        petalHomePage.navigateToCareerModulePage();
    }

    @Step("the user is taken to careers module with a change in url")
    @Then("the user is taken to careers module with a change in url")
    public void the_user_is_taken_to_careers_module_with_a_change_in_url() {
        CareersPage careersPage = PageFactory.initElements(driver, CareersPage.class);
        Assert.assertTrue(careersPage.getCurrentPageURL().contains(userData.get("pageURLValue")));
    }

    @Step("the user scrolls down to job listings section")
    @When("the user scrolls down to job listings section")
    public void the_user_scrolls_down_to_job_listings_section() {
        CareersPage careersPage = PageFactory.initElements(driver, CareersPage.class);
        careersPage.scrollToCareerOpportunitiesSection();
    }

    @Step("the user sees the job filter tool")
    @Then("the user sees the job filter tool")
    public void the_user_sees_the_job_filter_tool() {
        CareersPage careersPage = PageFactory.initElements(driver, CareersPage.class);
        Assert.assertTrue(careersPage.getJobsFilterSectionAvailability());
    }

    @Step("the user see the available job listing")
    @Then("the user see the available job listing")
    public void the_user_see_the_available_job_listing() {
        CareersPage careersPage = PageFactory.initElements(driver, CareersPage.class);
        Assert.assertEquals(userData.get("jobOpeningsCount"), careersPage.getJobOpeningsCount());
    }
}
