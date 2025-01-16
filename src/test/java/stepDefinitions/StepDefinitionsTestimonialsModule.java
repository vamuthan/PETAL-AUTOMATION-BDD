package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.PetalHomePage;
import pages.TestimonialsPage;
import util.TestDataMapper;
import java.util.Map;
import static stepDefinitions.BaseSteps.driver;

public class StepDefinitionsTestimonialsModule{

    private static Map<String, String> userData = (Map<String, String>) TestDataMapper.getTestData().
            get("testimonialsTestData");

    @Step("the user clicks on customer success module dropdown")
    @When("the user clicks on customer success module dropdown")
    public void the_user_clicks_on_customer_success_module_dropdown() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        petalHomePage.clickOnCustomerSuccessModuleDropDown();
    }

    @Step("the user see customer success success button from the dropdown.")
    @Then("the user see customer success success button from the dropdown.")
    public void the_user_see_customer_success_success_button_from_the_dropdown() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        Assert.assertTrue(petalHomePage.getCustomerSuccessButtonAvailability());
    }

    @Step("the user see three sub module buttons from the dropdown.")
    @Then("the user see three sub module buttons from the dropdown.")
    public void the_user_see_three_sub_module_buttons_from_the_dropdown() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        Assert.assertEquals(userData.get("customerSuccessSubmoduleContainerSize"), petalHomePage.
                getCustomerSuccessSubModuleContainerSize());
    }

    @Step("the user clicks on our customers module button")
    @When("the user clicks on our customers module button")
    public void the_user_clicks_on_our_customers_module_button() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        petalHomePage.navigateToTestimonialsPage();
    }

    @Step("the user is navigated to a new page with change in page url.")
    @Then("the user is navigated to a new page with change in page url.")
    public void the_user_is_navigated_to_a_new_page_with_change_in_page_url() {
        TestimonialsPage testimonialsPage = PageFactory.initElements(driver, TestimonialsPage.class);
        Assert.assertTrue(testimonialsPage.getCurrentPageURL().contains(userData.get("pageURLValue")));
    }

    @Step("the user clicks on see who we helped button")
    @When("the user clicks on see who we helped button")
    public void the_user_clicks_on_see_who_we_helped_button() {
        TestimonialsPage testimonialsPage = PageFactory.initElements(driver, TestimonialsPage.class);
        testimonialsPage.navigateToSeeWhoWeHelpedSection();
    }

    @Step("the user see that the page scrolls down to the list of customer testimonials")
    @Then("the user see that the page scrolls down to the list of customer testimonials")
    public void the_user_see_that_the_page_scrolls_down_to_the_list_of_customer_testimonials() {
        TestimonialsPage testimonialsPage = PageFactory.initElements(driver, TestimonialsPage.class);
        Assert.assertEquals(userData.get("testimonialsNamesContainer"), testimonialsPage.getTestimonialsName());
    }
}
