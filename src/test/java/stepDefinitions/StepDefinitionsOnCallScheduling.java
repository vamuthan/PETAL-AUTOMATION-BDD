package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.checkerframework.checker.fenum.qual.SwingSplitPaneOrientation;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.OnCallSchedulingPage;
import pages.PetalHomePage;
import util.TestDataMapper;
import java.util.Map;
import static stepDefinitions.BaseSteps.driver;

public class StepDefinitionsOnCallScheduling {

    private static Map<String, String> userData = (Map<String, String>) TestDataMapper.getTestData().
            get("onCallSchedulingTestData");

    @Step("the user clicks on solution drop down menu")
    @When("the user clicks on solution drop down menu")
    public void the_user_clicks_on_solution_drop_down_menu() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        petalHomePage.clickOnSolutionsDropDownButton();
    }

    @Step("the user is able to see solutions module button")
    @Then("the user is able to see solutions module button")
    public void the_user_is_able_to_see_solutions_module_button() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        Assert.assertTrue(petalHomePage.getSolutionsModuleButtonAvailability());
    }

    @Step("the user is able to see capacity module button and all the sub module buttons")
    @Then("the user is able to see capacity module button and all the sub module buttons")
    public void the_user_is_able_to_see_capacity_module_button_and_all_the_sub_module_buttons() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        Assert.assertTrue(petalHomePage.getCapacityModuleButtonAndAllSubModuleButtonAvailability());
    }

    @Step("the user is able to see care coordination module button and all the sub module buttons")
    @Then("the user is able to see care coordination module button and all the sub module buttons")
    public void the_user_is_able_to_see_care_coordination_module_button_and_all_the_sub_module_buttons() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        Assert.assertTrue(petalHomePage.getCareCoordinationModuleButtonAndAllSubModuleButtonAvailability());
    }

    @Step("the user clicks on on-call scheduling button")
    @When("the user clicks on on-call scheduling button")
    public void the_user_clicks_on_on_call_scheduling_button() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        petalHomePage.navigateToOnCallSchedulingModule();
    }

    @Step("the user is navigated to on-call scheduling page with the change in the page url")
    @Then("the user is navigated to on-call scheduling page with the change in the page url")
    public void the_user_is_navigated_to_on_call_scheduling_page_with_the_change_in_the_page_url() {
        OnCallSchedulingPage onCallSchedulingPage = PageFactory.initElements(driver, OnCallSchedulingPage.class);
        Assert.assertTrue(onCallSchedulingPage.getCurrentPageURL().contains(userData.get("pageURLValue")));
    }

    @Step("the user is able to see talk to an expert button present")
    @Then("the user is able to see talk to an expert button present")
    public void the_user_is_able_to_see_talk_to_an_expert_button_present() {
        OnCallSchedulingPage onCallSchedulingPage = PageFactory.initElements(driver, OnCallSchedulingPage.class);
        Assert.assertTrue(onCallSchedulingPage.getTalkToAnExpertButtonAvailability());
    }

    @Step("the  user scrolls down to key benefits section")
    @When("the  user scrolls down to key benefits section")
    public void the_user_scrolls_down_to_key_benefits_section() {
        OnCallSchedulingPage onCallSchedulingPage = PageFactory.initElements(driver, OnCallSchedulingPage.class);
        onCallSchedulingPage.scrollToKeyBenefitsHeader();
    }

    @Step("the user is able to see the first key benefit.")
    @Then("the user is able to see the first key benefit.")
    public void the_user_is_able_to_see_the_first_key_benefit() {
        OnCallSchedulingPage onCallSchedulingPage = PageFactory.initElements(driver, OnCallSchedulingPage.class);
        Assert.assertTrue(onCallSchedulingPage.getKeyBenefitOneAvailability());
    }

    @Step("the user is able to see the second key benefit.")
    @Then("the user is able to see the second key benefit.")
    public void the_user_is_able_to_see_the_second_key_benefit() {
        OnCallSchedulingPage onCallSchedulingPage = PageFactory.initElements(driver, OnCallSchedulingPage.class);
        Assert.assertTrue(onCallSchedulingPage.getKeyBenefitTwoAvailability());
    }

    @Step("the user is able to see the third key benefit.")
    @Then("the user is able to see the third key benefit.")
    public void the_user_is_able_to_see_the_third_key_benefit() {
        OnCallSchedulingPage onCallSchedulingPage = PageFactory.initElements(driver, OnCallSchedulingPage.class);
        Assert.assertTrue(onCallSchedulingPage.getKeyBenefitThreeAvailability());
    }

    @Step("the user is able to see the fourth key benefit.")
    @Then("the user is able to see the fourth key benefit.")
    public void the_user_is_able_to_see_the_fourth_key_benefit() {
        OnCallSchedulingPage onCallSchedulingPage = PageFactory.initElements(driver, OnCallSchedulingPage.class);
        Assert.assertTrue(onCallSchedulingPage.getKeyBenefitFourAvailability());
    }
}
