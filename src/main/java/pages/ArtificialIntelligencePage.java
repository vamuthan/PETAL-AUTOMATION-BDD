package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArtificialIntelligencePage extends PetalHomePage{

    @FindBy(css = "article > div > h3 > div")
    protected WebElement firstPointHeading;

    @FindBy(css = "section[class='c-section'] > div:nth-child(1) h3 > div")
    protected WebElement secondPointHeading;

    @FindBy(css = "section[class='c-section'] > div:nth-child(2) h3 > div")
    protected WebElement thirdPointHeading;

    @FindBy(css = "section[class='c-section'] > div:nth-child(3) h3 > div")
    protected WebElement fourthPointHeading;

    public ArtificialIntelligencePage(WebDriver driver) {
        super(driver);
    }

    public void scrollToFirstPoint(){
        scrollElementIntoView(firstPointHeading);
        stopExecution(1);
    }

    public String getFirstPointHeading(){
        return getTextContentJS(firstPointHeading);
    }

    public void scrollToSecondPoint(){
        scrollElementIntoView(secondPointHeading);
        stopExecution(1);
    }

    public String getSecondPointHeading(){
        return getTextContentJS(secondPointHeading);
    }

    public void scrollToThirdPoint(){
        scrollElementIntoView(thirdPointHeading);
        stopExecution(1);
    }

    public String getThirdPointHeading(){
        return getTextContentJS(thirdPointHeading);
    }

    public void scrollToFourthPoint(){
        scrollElementIntoView(fourthPointHeading);
        stopExecution(1);
    }

    public String getFourthPointHeading(){
        return getTextContentJS(fourthPointHeading);
    }
}
