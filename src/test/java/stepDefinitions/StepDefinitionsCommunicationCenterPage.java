package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.CommunicationCenterPage;
import pages.PetalHomePage;
import util.TestDataMapper;

import java.util.Map;

import static stepDefinitions.BaseSteps.driver;

public class StepDefinitionsCommunicationCenterPage {

    private static Map<String, String> userData = (Map<String, String>) TestDataMapper.getTestData().
            get("communicationModuleTestData");

    @Step("the user clicks on communication center module button")
    @When("the user clicks on communication center module button")
    public void the_user_clicks_on_communication_center_module_button() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        petalHomePage.navigateToCommunicationCenterModule();
    }

    @Step("the user is navigated to communication center module page")
    @Then("the user is navigated to communication center module page")
    public void the_user_is_navigated_to_communication_center_module_page() {
        CommunicationCenterPage communicationCenterPage = PageFactory.initElements(driver,
                CommunicationCenterPage.class);
        Assert.assertTrue(communicationCenterPage.getCurrentPageURL().contains(userData.get("pageURLValue")));
    }

    @Step("the user is able to see talk to an expert button present in communication center page")
    @Then("the user is able to see talk to an expert button present in communication center page")
    public void the_user_is_able_to_see_talk_to_an_expert_button_present_in_communication_center_page() {
        CommunicationCenterPage communicationCenterPage = PageFactory.initElements(driver,
                CommunicationCenterPage.class);
        Assert.assertTrue(communicationCenterPage.getTalkToAnExpertButtonAvailability());
    }

    @Step("the user scrolls down to key benefits section in communication center page")
    @When("the user scrolls down to key benefits section in communication center page")
    public void the_user_scrolls_down_to_key_benefits_section_in_communication_center_page() {
        CommunicationCenterPage communicationCenterPage = PageFactory.initElements(driver,
                CommunicationCenterPage.class);
        communicationCenterPage.scrollToKeyBenefitsSection();
    }

    @Step("the user is able to see the first key benefit in communication center page")
    @Then("the user is able to see the first key benefit in communication center page")
    public void the_user_is_able_to_see_the_first_key_benefit_in_communication_center_page() {
        CommunicationCenterPage communicationCenterPage = PageFactory.initElements(driver,
                CommunicationCenterPage.class);
        Assert.assertTrue(communicationCenterPage.getFirstKeyBenefitAvailability());
    }

    @Step("the user is able to see the second key benefit in communication center page")
    @Then("the user is able to see the second key benefit in communication center page")
    public void the_user_is_able_to_see_the_second_key_benefit_in_communication_center_page() {
        CommunicationCenterPage communicationCenterPage = PageFactory.initElements(driver,
                CommunicationCenterPage.class);
        Assert.assertTrue(communicationCenterPage.getSecondKeyBenefitAvailability());
    }

    @Step("the user is able to see the third key benefit in communication center page")
    @Then("the user is able to see the third key benefit in communication center page")
    public void the_user_is_able_to_see_the_third_key_benefit_in_communication_center_page() {
        CommunicationCenterPage communicationCenterPage = PageFactory.initElements(driver,
                CommunicationCenterPage.class);
        Assert.assertTrue(communicationCenterPage.getThirdKeyBenefitAvailability());
    }

    @Step("the user is able to see the fourth key benefit in communication center page")
    @Then("the user is able to see the fourth key benefit in communication center page")
    public void the_user_is_able_to_see_the_fourth_key_benefit_in_communication_center_page() {
        CommunicationCenterPage communicationCenterPage = PageFactory.initElements(driver,
                CommunicationCenterPage.class);
        Assert.assertTrue(communicationCenterPage.getFourthKeyBenefitAvailability());
    }

    @Step("the user is able to see the fifth key benefit in communication center page")
    @Then("the user is able to see the fifth key benefit in communication center page")
    public void the_user_is_able_to_see_the_fifth_key_benefit_in_communication_center_page() {
        CommunicationCenterPage communicationCenterPage = PageFactory.initElements(driver,
                CommunicationCenterPage.class);
        Assert.assertTrue(communicationCenterPage.getFifthKeyBenefitAvailability());
    }

}
