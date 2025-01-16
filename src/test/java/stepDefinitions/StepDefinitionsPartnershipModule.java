package stepDefinitions;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.PartnershipPage;
import pages.PetalHomePage;
import util.TestDataMapper;
import java.util.Map;

import static stepDefinitions.BaseSteps.driver;

public class StepDefinitionsPartnershipModule {

    private static Map<String, String> userData = (Map<String, String>) TestDataMapper.getTestData().
            get("partnershipModuleTestData");

    @Step("the user clicks on partnership module button")
    @When("the user clicks on partnership module button")
    public void the_user_clicks_on_partnership_module_button() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        petalHomePage.navigateToPartnershipModulePage();
    }

    @Step("the user is navigated to partnership module page with a change in url")
    @Then("the user is navigated to partnership module page with a change in url")
    public void the_user_is_navigated_to_partnership_module_page_with_a_change_in_url() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        Assert.assertTrue(petalHomePage.getCurrentPageURL().contains(userData.get("pageURLValue")));
    }

    @Step("the user scrolls down to Join our Partners section")
    @When("the user scrolls down to Join our Partners section")
    public void the_user_scrolls_down_to_join_our_partners_section() {
        PartnershipPage partnershipPage = PageFactory.initElements(driver, PartnershipPage.class);
        partnershipPage.scrollToListedPartnersSection();
    }

    @Step("the user see four displayed partners")
    @Then("the user see four displayed partners")
    public void the_user_see_four_displayed_partners() {
        PartnershipPage partnershipPage = PageFactory.initElements(driver, PartnershipPage.class);
        Assert.assertEquals(userData.get("partnersNameContainer"), partnershipPage.getPartnersName());
    }

}
