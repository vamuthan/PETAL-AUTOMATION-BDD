package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.ArtificialIntelligencePage;
import pages.PetalHomePage;
import util.TestDataMapper;
import java.util.Map;
import static stepDefinitions.BaseSteps.driver;

public class StepDefinitionsArtificialIntelligenceModule {

    private static Map<String, String> userData = (Map<String, String>) TestDataMapper.getTestData().
            get("aiModuleTestData");

    @Step("the user clicks on Technology module dropdown")
    @When("the user clicks on Technology module dropdown")
    public void the_user_clicks_on_technology_module_dropdown() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        petalHomePage.clickOnTechnologySubModuleDropDown();
    }

    @Step("the user should see Technology module button")
    @Then("the user should see Technology module button")
    public void the_user_should_see_technology_module_button() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        Assert.assertTrue(petalHomePage.getTechnologyModuleButtonAvailability());
    }

    @Step("the user should see four sub module buttons of Technology module")
    @Then("the user should see four sub module buttons of Technology module")
    public void the_user_should_see_four_sub_module_buttons_of_technology_module() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        Assert.assertTrue(petalHomePage.getTechnologySubModulesAvailability());
    }

    @Step("the user clicks on Artificial intelligence module")
    @When("the user clicks on Artificial intelligence module")
    public void the_user_clicks_on_artificial_intelligence_module() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        petalHomePage.navigateToArtificialIntelligencePage();
    }

    @Step("the user should be navigated to Artificial intelligence page with the change in page url")
    @Then("the user should be navigated to Artificial intelligence page with the change in page url")
    public void the_user_should_be_navigated_to_artificial_intelligence_page_with_the_change_in_page_url() {
        ArtificialIntelligencePage artificialIntelligencePage = PageFactory.initElements(driver,
                ArtificialIntelligencePage.class);
        Assert.assertTrue(artificialIntelligencePage.getCurrentPageURL().contains(userData.get("pageURLValue")));
    }

    @Step("the user scrolls down to first key point")
    @When("the user scrolls down to first key point")
    public void the_user_scrolls_down_to_first_key_point() {
        ArtificialIntelligencePage artificialIntelligencePage = PageFactory.initElements(driver,
                ArtificialIntelligencePage.class);
        artificialIntelligencePage.scrollToFirstPoint();
    }

    @Step("the user should see all the important information of first key point")
    @Then("the user should see all the important information of first key point")
    public void the_user_should_see_all_the_important_information_of_first_key_point() {
        ArtificialIntelligencePage artificialIntelligencePage = PageFactory.initElements(driver,
                ArtificialIntelligencePage.class);
        Assert.assertEquals(userData.get("firstPointHeading"), artificialIntelligencePage.getFirstPointHeading());
    }

    @Step("the user scrolls down to second key point")
    @When("the user scrolls down to second key point")
    public void the_user_scrolls_down_to_second_key_point() {
        ArtificialIntelligencePage artificialIntelligencePage = PageFactory.initElements(driver,
                ArtificialIntelligencePage.class);
        artificialIntelligencePage.scrollToSecondPoint();
    }

    @Step("the user should see all the important information of second key point")
    @Then("the user should see all the important information of second key point")
    public void the_user_should_see_all_the_important_information_of_second_key_point() {
        ArtificialIntelligencePage artificialIntelligencePage = PageFactory.initElements(driver,
                ArtificialIntelligencePage.class);
        Assert.assertEquals(userData.get("secondPointHeading"), artificialIntelligencePage.getSecondPointHeading());
    }

    @Step("the user scrolls down to third key point")
    @When("the user scrolls down to third key point")
    public void the_user_scrolls_down_to_third_key_point() {
        ArtificialIntelligencePage artificialIntelligencePage = PageFactory.initElements(driver,
                ArtificialIntelligencePage.class);
        artificialIntelligencePage.scrollToThirdPoint();
    }

    @Step("the user should see all the important information of third key point")
    @Then("the user should see all the important information of third key point")
    public void the_user_should_see_all_the_important_information_of_third_key_point() {
        ArtificialIntelligencePage artificialIntelligencePage = PageFactory.initElements(driver,
                ArtificialIntelligencePage.class);
        Assert.assertEquals(userData.get("thirdPointHeading"), artificialIntelligencePage.getThirdPointHeading());
    }

    @Step("the user scrolls down to fourth point")
    @When("the user scrolls down to fourth point")
    public void the_user_scrolls_down_to_fourth_point() {
        ArtificialIntelligencePage artificialIntelligencePage = PageFactory.initElements(driver,
                ArtificialIntelligencePage.class);
        artificialIntelligencePage.scrollToFourthPoint();
    }

    @Step("the user should see all the important information of fourth key point")
    @Then("the user should see all the important information of fourth key point")
    public void the_user_should_see_all_the_important_information_of_fourth_key_point() {
        ArtificialIntelligencePage artificialIntelligencePage = PageFactory.initElements(driver,
                ArtificialIntelligencePage.class);
        Assert.assertEquals(userData.get("fourthPointHeading"), artificialIntelligencePage.getFourthPointHeading());
    }
}
