package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnCallSchedulingPage extends PetalHomePage{

    @FindBy(css = "div[class='cta-content test'] > a[class='cta_button ']")
    protected WebElement talkToAnExpertButton;

    @FindBy(css = "div[class='o-container'] > div > h3 > div > div > div[id] > b")
    protected WebElement keyBenefitsHeader;

    @FindBy(css = "div[class='o-container'] > ul > li:nth-child(1) > div")
    protected WebElement keyBenefitOne;

    @FindBy(css = "div[class='o-container'] > ul > li:nth-child(2) > div")
    protected WebElement keyBenefitTwo;

    @FindBy(css = "div[class='o-container'] > ul > li:nth-child(3) > div")
    protected WebElement keyBenefitThree;

    @FindBy(css = "div[class='o-container'] > ul > li:nth-child(4) > div")
    protected WebElement keyBenefitFour;

    public OnCallSchedulingPage(WebDriver driver) {
        super(driver);
    }

    public boolean getTalkToAnExpertButtonAvailability(){
        return isTheElementDisplayed(talkToAnExpertButton);
    }

    public void scrollToKeyBenefitsHeader(){
        scrollElementIntoView(keyBenefitsHeader);
        stopExecution(1);
    }

    public boolean getKeyBenefitOneAvailability(){
        scrollElementIntoView(keyBenefitOne);
        stopExecution(1);
        return isTheElementDisplayed(keyBenefitOne);
    }

    public boolean getKeyBenefitTwoAvailability(){
        scrollElementIntoView(keyBenefitTwo);
        stopExecution(1);
        return isTheElementDisplayed(keyBenefitTwo);
    }

    public boolean getKeyBenefitThreeAvailability(){
        scrollElementIntoView(keyBenefitThree);
        stopExecution(1);
        return isTheElementDisplayed(keyBenefitThree);
    }

    public boolean getKeyBenefitFourAvailability(){
        scrollElementIntoView(keyBenefitFour);
        stopExecution(1);
        return isTheElementDisplayed(keyBenefitFour);
    }
}
