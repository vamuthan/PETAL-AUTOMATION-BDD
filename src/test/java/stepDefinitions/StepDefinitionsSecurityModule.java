package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.PetalHomePage;
import pages.SecurityPage;
import util.TestDataMapper;
import java.util.Map;
import static stepDefinitions.BaseSteps.driver;

public class StepDefinitionsSecurityModule {

    private static Map<String, String> userData = (Map<String, String>) TestDataMapper.getTestData().
            get("securityModuleTestData");

    @Step("the user clicks on security submodule button")
    @When("the user clicks on security submodule button")
    public void the_user_clicks_on_security_submodule_button() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        petalHomePage.navigateToSecurityPage();
    }

    @Step("the user should be navigated to security sub module page with change in url")
    @Then("the user should be navigated to security sub module page with change in url")
    public void the_user_should_be_navigated_to_security_sub_module_page_with_change_in_url() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        Assert.assertTrue(securityPage.getCurrentPageURL().contains(userData.get("pageURLValue")));
    }

    @Step("the user scrolls to first key point in security page")
    @When("the user scrolls to first key point in security page")
    public void the_user_scrolls_to_first_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        securityPage.scrollToFirstPointHeading();
    }

    @Step("the user should see first key point in security pag")
    @Then("the user should see first key point in security page")
    public void the_user_should_see_first_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        Assert.assertEquals(userData.get("firstPointHeading"), securityPage.getFirstPointHeading());
    }

    @Step("the user scrolls to second key point in security page")
    @When("the user scrolls to second key point in security page")
    public void the_user_scrolls_to_second_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        securityPage.scrollToSecondPointHeading();
    }

    @Step("the user should see second key point in security page")
    @Then("the user should see second key point in security page")
    public void the_user_should_see_second_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        Assert.assertEquals(userData.get("secondPointHeading"), securityPage.getSecondHeading());
    }

    @Step("the user scrolls to third key point in security page")
    @When("the user scrolls to third key point in security page")
    public void the_user_scrolls_to_third_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        securityPage.scrollToThirdPointHeading();
    }

    @Step("the user should see third key point in security page")
    @Then("the user should see third key point in security page")
    public void the_user_should_see_third_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        Assert.assertEquals(userData.get("thirdPointHeading"), securityPage.getThirdPointHeading());
    }

    @Step("the user scrolls to fourth key point in security page")
    @When("the user scrolls to fourth key point in security page")
    public void the_user_scrolls_to_fourth_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        securityPage.scrollToFourthPointHeading();
    }

    @Step("the user should see fourth key point in security page")
    @Then("the user should see fourth key point in security page")
    public void the_user_should_see_fourth_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        Assert.assertEquals(userData.get("fourthPointHeading"), securityPage.getFourthPointHeading());
    }

    @Step("the user scrolls to fifth key point in security page")
    @When("the user scrolls to fifth key point in security page")
    public void the_user_scrolls_to_fifth_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        securityPage.scrollToFifthPointHeading();
    }

    @Step("the user should see fifth key point in security page")
    @Then("the user should see fifth key point in security page")
    public void the_user_should_see_fifth_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        Assert.assertEquals(userData.get("fifthPointHeading"), securityPage.getFifthPointHeading());
    }

    @Step("the user scrolls to sixth key point in security page")
    @When("the user scrolls to sixth key point in security page")
    public void the_user_scrolls_to_sixth_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        securityPage.scrollToSixthPointHeading();
    }

    @Step("the user should see sixth key point in security page")
    @Then("the user should see sixth key point in security page")
    public void the_user_should_see_sixth_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        Assert.assertEquals(userData.get("sixthPointHeading"), securityPage.getSixthPointHeading());
    }

    @Step("the user scrolls to seventh key point in security page")
    @When("the user scrolls to seventh key point in security page")
    public void the_user_scrolls_to_seventh_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        securityPage.scrollToSeventhPointHeading();
    }

    @Step("the user should see seventh key point in security page")
    @Then("the user should see seventh key point in security page")
    public void the_user_should_see_seventh_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        Assert.assertEquals(userData.get("seventhPointHeading"), securityPage.getSeventhPointHeading());
    }

    @Step("the user scrolls to eighth key point in security page")
    @When("the user scrolls to eighth key point in security page")
    public void the_user_scrolls_to_eighth_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        securityPage.scrollToEightPointHeading();
    }

    @Step("the user should see eighth key point in security page")
    @Then("the user should see eighth key point in security page")
    public void the_user_should_see_eighth_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        Assert.assertEquals(userData.get("eightPointHeading"), securityPage.getEighthPointHeading());
    }

    @Step("the user scrolls to ninth key point in security page")
    @When("the user scrolls to ninth key point in security page")
    public void the_user_scrolls_to_ninth_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        securityPage.scrollToNinthPointHeading();
    }

    @Step("the user should see ninth key point in security page")
    @Then("the user should see ninth key point in security page")
    public void the_user_should_see_ninth_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        Assert.assertEquals(userData.get("ninthPointHeading"), securityPage.getNinthPointHeading());
    }

    @Step("the user scrolls to tenth key point in security page")
    @When("the user scrolls to tenth key point in security page")
    public void the_user_scrolls_to_tenth_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        securityPage.scrollToTenthPointHeading();
    }

    @Step("the user should see tenth key point in security page")
    @Then("the user should see tenth key point in security page")
    public void the_user_should_see_tenth_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        Assert.assertEquals(userData.get("tenthPointHeading"), securityPage.getTenthPointHeading());
    }

    @Step("the user scrolls to eleventh key point in security page")
    @When("the user scrolls to eleventh key point in security page")
    public void the_user_scrolls_to_eleventh_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        securityPage.scrollToEleventhPointHeading();
    }

    @Step("the user should see eleventh key point in security page")
    @Then("the user should see eleventh key point in security page")
    public void the_user_should_see_eleventh_key_point_in_security_page() {
        SecurityPage securityPage = PageFactory.initElements(driver, SecurityPage.class);
        Assert.assertEquals(userData.get("eleventhPointHeading"), securityPage.getEleventhPointHeading());
    }
}
