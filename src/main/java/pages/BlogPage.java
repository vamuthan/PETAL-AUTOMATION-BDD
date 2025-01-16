package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class BlogPage extends PetalHomePage{

    @FindBy(css = "div[class='section'] div[class='row-fluid']")
    protected WebElement blogPostContainer;

    @FindBy(css = "nav > ul")
    protected WebElement paginationContainer;

    @FindBy(css = "nav > ul > li:last-child > a")
    protected WebElement rightArrowButton;

    @FindBy(css = "nav > ul > li:first-child > a")
    protected WebElement leftArrowButton;

    @FindBy(css = "li[class='active'] > a")
    protected WebElement activePaginationWebElement;

    @FindBy(css = "div[class='section'] div[class='row-fluid'] h3 > a")
    protected List<WebElement> individualPostHeadingContainer;

    @FindBy(css = "h1 > span")
    protected WebElement postHeadingValue;

    public BlogPage(WebDriver driver) {
        super(driver);
    }

    public boolean getBlogPostContainerAvailability(){
        return isTheElementDisplayed(blogPostContainer);
    }

    public boolean getPaginationAvailability(){
        return isTheElementDisplayed(paginationContainer);
    }

    public void clickOnNextPageButton(){
        waitForElementToBeClickable(rightArrowButton);
        rightArrowButton.click();
    }

    public void clickOnPreviousPageButton(){
        waitForElementToBeClickable(leftArrowButton);
        leftArrowButton.click();
    }

    public int getActivePaginationElementNumber(){
        isTheElementDisplayed(activePaginationWebElement);
        return Integer.parseInt(getTextContentJS(activePaginationWebElement));
    }

    public void scrollToIntendedPost(String postHeadingValue){
        isTheElementDisplayed(blogPostContainer);
        individualPostHeadingContainer.stream().filter(currentElement -> getTextContentJS(currentElement).
                equals(postHeadingValue)).forEach(this::scrollElementIntoView);
    }

    public boolean getIntendedPostAvailability(String postHeadingValue){
        isTheElementDisplayed(blogPostContainer);
        return individualPostHeadingContainer.stream().
                anyMatch(currentElement -> getTextContentJS(currentElement).equals(postHeadingValue));
    }

    public void clickOnIntendedPost(String postHeadingValue){
        isTheElementDisplayed(blogPostContainer);
        individualPostHeadingContainer.stream().filter(currentElement -> getTextContentJS(currentElement).
                equals(postHeadingValue)).findFirst().ifPresent(currentElement -> {
            waitForElementToBeClickable(currentElement);
            currentElement.click();
        });
    }

    public String getPostHeadingValue(){
        isTheElementDisplayed(postHeadingValue);
        return getTextContentJS(postHeadingValue);
    }
}
