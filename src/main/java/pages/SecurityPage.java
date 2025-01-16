package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecurityPage extends PetalHomePage{

    @FindBy(css = "div > div:nth-child(3) section  > div:nth-child(1) > div:nth-child(2) > h3 > div > div > div")
    protected WebElement firstPointHeading;

    @FindBy(css = "div > div:nth-child(3) section  > div:nth-child(2) > div:nth-child(2) > h3 > div > div > div")
    protected WebElement secondPointHeading;

    @FindBy(css = "div > div:nth-child(3) section  > div:nth-child(3) > div:nth-child(2) > h3 > div > div > div")
    protected WebElement thirdPointHeading;

    @FindBy(css = "div > div:nth-child(3) section  > div:nth-child(4) > div:nth-child(2) > h3 > div > div > div")
    protected WebElement fourthPointHeading;

    @FindBy(css = "div > div:nth-child(4) article > div > h3 > div")
    protected WebElement fifthPointHeading;

    @FindBy(css = "div > div:nth-child(6) article > div > h3 > div")
    protected WebElement sixthPointHeading;

    @FindBy(css = "div > div:nth-child(7) section  > div:nth-child(1) > div:nth-child(2) > h3 > div > div > div")
    protected WebElement seventhPointHeading;

    @FindBy(css = "div > div:nth-child(7) section  > div:nth-child(2) > div:nth-child(2) > h3 > div > div > div")
    protected WebElement eighthPointHeading;

    @FindBy(css = "div > div:nth-child(7) section  > div:nth-child(3) > div:nth-child(2) > h3 > div > div > div")
    protected WebElement ninthPointHeading;

    @FindBy(css = "div > div:nth-child(7) section  > div:nth-child(4) > div:nth-child(2) > h3 > div > div > div")
    protected WebElement tenthPointHeading;

    @FindBy(css = "div > div:nth-child(7) section  > div:nth-child(5) > div:nth-child(2) > h3 > div > div > div")
    protected WebElement eleventhPointHeading;

    public SecurityPage(WebDriver driver) {
        super(driver);
    }

    public void scrollToFirstPointHeading(){
        scrollElementIntoView(firstPointHeading);
        stopExecution(1);
    }

    public String getFirstPointHeading(){
        return getTextContentJS(firstPointHeading);
    }

    public void scrollToSecondPointHeading(){
        scrollElementIntoView(secondPointHeading);
        stopExecution(1);
    }

    public String getSecondHeading(){
        return getTextContentJS(secondPointHeading);
    }

    public void scrollToThirdPointHeading(){
        scrollElementIntoView(thirdPointHeading);
        stopExecution(1);
    }

    public String getThirdPointHeading(){
        return getTextContentJS(thirdPointHeading);
    }

    public void scrollToFourthPointHeading(){
        scrollElementIntoView(fourthPointHeading);
        stopExecution(1);
    }

    public String getFourthPointHeading(){
        return getTextContentJS(fourthPointHeading);
    }

    public void scrollToFifthPointHeading(){
        scrollElementIntoView(fifthPointHeading);
        stopExecution(1);
    }

    public String getFifthPointHeading(){
        return getTextContentJS(fifthPointHeading);
    }

    public void scrollToSixthPointHeading(){
        scrollElementIntoView(sixthPointHeading);
        stopExecution(1);
    }

    public String getSixthPointHeading(){
        return getTextContentJS(sixthPointHeading);
    }

    public void scrollToSeventhPointHeading(){
        scrollElementIntoView(seventhPointHeading);
        stopExecution(1);
    }

    public String getSeventhPointHeading(){
        return getTextContentJS(seventhPointHeading);
    }

    public void scrollToEightPointHeading(){
        scrollElementIntoView(eighthPointHeading);
        stopExecution(1);
    }

    public String getEighthPointHeading(){
        return getTextContentJS(eighthPointHeading);
    }

    public void scrollToNinthPointHeading(){
        scrollElementIntoView(ninthPointHeading);
        stopExecution(1);
    }

    public String getNinthPointHeading(){
        return getTextContentJS(ninthPointHeading);
    }

    public void scrollToTenthPointHeading(){
        scrollElementIntoView(tenthPointHeading);
        stopExecution(1);
    }

    public String getTenthPointHeading(){
        return getTextContentJS(tenthPointHeading);
    }

    public void scrollToEleventhPointHeading(){
        scrollElementIntoView(eleventhPointHeading);
        stopExecution(1);
    }

    public String getEleventhPointHeading(){
        return getTextContentJS(eleventhPointHeading);
    }
}
