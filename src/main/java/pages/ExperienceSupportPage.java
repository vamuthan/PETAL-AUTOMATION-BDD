package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class ExperienceSupportPage extends PetalHomePage{

    @FindBy(css = "section[class='dark_bg_color colors']")
    protected WebElement procedureContainer;

    @FindBy(css = "ul[class='accordion-list'] > li:nth-child(1) h3 > button > div")
    protected WebElement stepOneContent;

    @FindBy(css = "ul[class='accordion-list'] > li:nth-child(2) h3 > button > div")
    protected WebElement stepTwoContent;

    @FindBy(css = "ul[class='accordion-list'] > li:nth-child(3) h3 > button > div")
    protected WebElement stepThreeContent;

    @FindBy(css = "ul[class='accordion-list'] > li:nth-child(4) h3 > button > div")
    protected WebElement stepFourContent;

    @FindBy(css = "ul[class='accordion-list'] > li:nth-child(5) h3 > button > div")
    protected WebElement stepFiveContent;

    @FindBy(css = "ul[class='accordion-list'] > li:nth-child(6) h3 > button > div")
    protected WebElement stepSixContent;

    public ExperienceSupportPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToProceduresSection(){
        waitForVisibility(procedureContainer);
        scrollElementIntoView(procedureContainer);
    }

    public List<String> getProcedureContent(){
        List<String> procedureContentContainer = new ArrayList<>();
        scrollElementIntoView(stepOneContent);
        procedureContentContainer.add(getTextContentJS(stepOneContent));
        scrollElementIntoView(stepTwoContent);
        procedureContentContainer.add(getTextContentJS(stepTwoContent));
        scrollElementIntoView(stepThreeContent);
        procedureContentContainer.add(getTextContentJS(stepThreeContent));
        scrollElementIntoView(stepFourContent);
        procedureContentContainer.add(getTextContentJS(stepFourContent));
        scrollElementIntoView(stepFiveContent);
        procedureContentContainer.add(getTextContentJS(stepFiveContent));
        scrollElementIntoView(stepSixContent);
        procedureContentContainer.add(getTextContentJS(stepSixContent));
        return procedureContentContainer;
    }
}
