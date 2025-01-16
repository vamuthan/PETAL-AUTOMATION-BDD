package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.BlogPage;
import pages.PetalHomePage;
import util.TestDataMapper;
import java.util.Map;
import static stepDefinitions.BaseSteps.driver;

public class StepDefinitionsBlogModule {

    private static Map<String, String> userData = (Map<String, String>) TestDataMapper.getTestData().
            get("blogModuleTestData");

    @Step("the user clicks on Blog button at the top right corner")
    @When("the user clicks on Blog button at the top right corner")
    public void the_user_clicks_on_blog_button_at_the_top_right_corner() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        petalHomePage.navigateToBlogModule();
    }

    @Step("the user can see list of blog post")
    @Then("the user can see list of blog post")
    public void the_user_can_see_list_of_blog_post() {
        BlogPage blogPage = PageFactory.initElements(driver, BlogPage.class);
        Assert.assertTrue(blogPage.getBlogPostContainerAvailability());
    }

    @Step("the user can see the pagination option located below the blog post container")
    @Then("the user can see the pagination option located below the blog post container")
    public void the_user_can_see_the_pagination_option_located_below_the_blog_post_container() {
        BlogPage blogPage = PageFactory.initElements(driver, BlogPage.class);
        Assert.assertTrue(blogPage.getPaginationAvailability());
    }

    @Step("the user clicks on next page arrow symbol")
    @When("the user clicks on next page arrow symbol")
    public void the_user_clicks_on_next_page_arrow_symbol() {
        BlogPage blogPage = PageFactory.initElements(driver, BlogPage.class);
        blogPage.clickOnNextPageButton();
    }

    @Step("the user is navigated to new page")
    @Then("the user is navigated to new page")
    public void the_user_is_navigated_to_new_page() {
        BlogPage blogPage = PageFactory.initElements(driver, BlogPage.class);
        Assert.assertEquals(userData.get("activePaginationElements"), blogPage.getActivePaginationElementNumber());
    }

    @Step("the user scrolls to the intended post.")
    @When("the user scrolls to the intended post.")
    public void theUserScrollsToTheIntendedPost() {
        BlogPage blogPage = PageFactory.initElements(driver, BlogPage.class);
        blogPage.scrollToIntendedPost(userData.get("blogPostHeadingValue"));
    }

    @Step("the user should be able to see the post availability")
    @Then("the user should be able to see the post availability")
    public void theUserShouldBeAbleToSeeThePostAvailability() {
        BlogPage blogPage = PageFactory.initElements(driver, BlogPage.class);
        Assert.assertTrue(blogPage.getIntendedPostAvailability(userData.get("blogPostHeadingValue")));
    }

    @Step("the user click on the intended post")
    @When("the user click on the intended post")
    public void the_user_click_on_the_intended_post() {
        BlogPage blogPage = PageFactory.initElements(driver, BlogPage.class);
        blogPage.clickOnIntendedPost(userData.get("blogPostHeadingValue"));
    }

    @Step("the user reads the title of the blogs post and makes sure it is the intended post")
    @Then("the user reads the title of the blogs post and makes sure it is the intended post")
    public void the_user_reads_the_title_of_the_blogs_post_and_makes_sure_it_is_the_intended_post() {
        BlogPage blogPage = PageFactory.initElements(driver, BlogPage.class);
        Assert.assertEquals(userData.get("blogPostHeadingValue"), blogPage.getPostHeadingValue());
    }
}
