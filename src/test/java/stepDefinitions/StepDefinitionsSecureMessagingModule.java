package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.PetalHomePage;
import pages.SecureMessagingPage;
import util.TestDataMapper;
import java.util.Map;
import static stepDefinitions.BaseSteps.driver;

public class StepDefinitionsSecureMessagingModule {

    private static Map<String, String> userData = (Map<String, String>) TestDataMapper.getTestData().
            get("secureMessagingTestData");

    @Step("the user clicks on secure messaging module button")
    @When("the user clicks on secure messaging module button")
    public void the_user_clicks_on_secure_messaging_module_button() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        petalHomePage.navigateToSecureMessagingModule();
    }

    @Step("the user is navigated to secure messaging module with change in url.")
    @Then("the user is navigated to secure messaging module with change in url.")
    public void the_user_is_navigated_to_secure_messaging_module_with_change_in_url() {
        SecureMessagingPage secureMessagingPage = PageFactory.initElements(driver, SecureMessagingPage.class);
        Assert.assertTrue(secureMessagingPage.getCurrentPageURL().contains(userData.get("pageURLValue")));
    }

    @Step("the user is a able to see the talk to an expert button")
    @Then("the user is a able to see the talk to an expert button")
    public void the_user_is_a_able_to_see_the_talk_to_an_expert_button() {
        SecureMessagingPage secureMessagingPage = PageFactory.initElements(driver, SecureMessagingPage.class);
        Assert.assertTrue(secureMessagingPage.getTalkToAnExpertButtonAvailability());
    }

    @Step("the user navigates to key benefits section in secure messaging module")
    @When("the user navigates to key benefits section in secure messaging module")
    public void the_user_navigates_to_key_benefits_section_in_secure_messaging_module() {
        SecureMessagingPage secureMessagingPage = PageFactory.initElements(driver, SecureMessagingPage.class);
        Assert.assertTrue(secureMessagingPage.getKeyBenefitsSectionAvailability());
    }

    @Step("the user is able to see the first key benefit in secure messaging module")
    @Then("the user is able to see the first key benefit in secure messaging module")
    public void the_user_is_able_to_see_the_first_key_benefit_in_secure_messaging_module() {
        SecureMessagingPage secureMessagingPage = PageFactory.initElements(driver, SecureMessagingPage.class);
        Assert.assertTrue(secureMessagingPage.getFirstKeyBenefitAvailability());
    }

    @Step("the user is able to see the second key benefit in secure messaging module")
    @Then("the user is able to see the second key benefit in secure messaging module")
    public void the_user_is_able_to_see_the_second_key_benefit_in_secure_messaging_module() {
        SecureMessagingPage secureMessagingPage = PageFactory.initElements(driver, SecureMessagingPage.class);
        Assert.assertTrue(secureMessagingPage.getSecondKeyBenefitAvailability());
    }

    @Step("the user is able to see the third key benefit in secure messaging module")
    @Then("the user is able to see the third key benefit in secure messaging module")
    public void the_user_is_able_to_see_the_third_key_benefit_in_secure_messaging_module() {
        SecureMessagingPage secureMessagingPage = PageFactory.initElements(driver, SecureMessagingPage.class);
        Assert.assertTrue(secureMessagingPage.getThirdKeyBenefitAvailability());
    }

    @Step("the user is able to see the fourth key benefit in secure messaging module")
    @Then("the user is able to see the fourth key benefit in secure messaging module")
    public void the_user_is_able_to_see_the_fourth_key_benefit_in_secure_messaging_module() {
        SecureMessagingPage secureMessagingPage = PageFactory.initElements(driver, SecureMessagingPage.class);
        Assert.assertTrue(secureMessagingPage.getFourthKeyBenefitAvailability());
    }
}
