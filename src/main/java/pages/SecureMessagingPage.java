package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureMessagingPage extends PetalHomePage{

    @FindBy(css = "div[class='cta-content test'] a")
    protected WebElement talkToAnExpertButton;

    @FindBy(css = "div[class='o-container'] > ul")
    protected WebElement keyBenefitsSection;

    @FindBy(css = "div[class='o-container'] > ul > li:nth-child(1)")
    protected WebElement firstKeyBenefit;

    @FindBy(css = "div[class='o-container'] > ul > li:nth-child(2)")
    protected WebElement secondKeyBenefit;

    @FindBy(css = "div[class='o-container'] > ul > li:nth-child(3)")
    protected WebElement thirdKeyBenefit;

    @FindBy(css = "div[class='o-container'] > ul > li:nth-child(4)")
    protected WebElement fourthKeyBenefit;

    public SecureMessagingPage(WebDriver driver) {
        super(driver);
    }

    public boolean getTalkToAnExpertButtonAvailability(){
        return isTheElementDisplayed(talkToAnExpertButton);
    }

    public boolean getKeyBenefitsSectionAvailability(){
        return isTheElementDisplayed(keyBenefitsSection);
    }

    public boolean getFirstKeyBenefitAvailability(){
        scrollElementIntoView(firstKeyBenefit);
        stopExecution(1);
        return isTheElementDisplayed(firstKeyBenefit);
    }

    public boolean getSecondKeyBenefitAvailability(){
        scrollElementIntoView(secondKeyBenefit);
        stopExecution(1);
        return isTheElementDisplayed(secondKeyBenefit);
    }

    public boolean getThirdKeyBenefitAvailability(){
        scrollElementIntoView(thirdKeyBenefit);
        stopExecution(1);
        return isTheElementDisplayed(thirdKeyBenefit);
    }

    public boolean getFourthKeyBenefitAvailability(){
        scrollElementIntoView(fourthKeyBenefit);
        stopExecution(1);
        return isTheElementDisplayed(fourthKeyBenefit);
    }
}
