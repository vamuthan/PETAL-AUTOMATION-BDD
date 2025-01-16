package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class PetalHomePage extends WebPage{

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(3)")
    protected WebElement customerSuccessModuleDropdownButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(4)")
    protected WebElement companyModuleButtonDropDown;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(4) > ul > li:nth-child(1) > ul > li")
    protected WebElement companyModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(4) > ul > li:nth-child(2) > ul > li")
    protected List<WebElement> companySubModuleContainer;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(4) > ul > li:nth-child(2) > ul > li:nth-child(2)")
    protected WebElement careersModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(4) > ul > li:nth-child(3) > ul > li:nth-child(2)")
    protected WebElement partnershipModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(3) > ul > li:nth-child(1)")
    protected WebElement customerSuccessButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(3) > ul > li:nth-child(2) > ul > li:nth-child(1)")
    protected WebElement ourCustomersButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(3) > ul > li:nth-child(2) > ul > li")
    protected List<WebElement> customerSuccessSubModuleContainer;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(3) > ul > li:nth-child(2) > ul > li:nth-child(2)")
    protected WebElement experienceAndSupportButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(3) > ul > li:nth-child(3) > ul > li")
    protected WebElement professionalServicesButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(2)")
    protected WebElement technologyModuleDropDownButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(2) > ul > li:nth-child(1)")
    protected WebElement technologyModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(2) > ul > li:nth-child(2) > ul > li:nth-child(1)")
    protected WebElement artificialIntelligenceModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(2) > ul > li:nth-child(2) > ul > li:nth-child(2)")
    protected WebElement securityModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(2) > ul > li:nth-child(3) > ul > li:nth-child(1)")
    protected WebElement interoperabilityModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(2) > ul > li:nth-child(3) > ul > li:nth-child(2)")
    protected WebElement cloudComputingModuleButton;

    @FindBy(css = "div[class='ryt_bx'] > ul > li:nth-child(1) > a")
    protected WebElement blogModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(1)")
    protected WebElement solutionsDropDownButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(1) a")
    protected WebElement solutionsModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(1) a")
    protected WebElement capacityManagementModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(3) a")
    protected WebElement onCallSchedulingModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(4) a")
    protected WebElement communicationCenterModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(5) a")
    protected WebElement secureMessagingModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(1) a")
    protected WebElement careCoordinationModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(2) a")
    protected WebElement primaryCareModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(3) a")
    protected WebElement specialityCareModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(4) a")
    protected WebElement immunizationModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(5) a")
    protected WebElement referralsAndWaitListModuleButton;

    @FindBy(css = "#navbarScroll > span > div > ul > li:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(6) a")
    protected WebElement patientSelfSchedulingModuleButton;

    public PetalHomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnCompanyModuleDropDownButton(){
        waitForElementToBeClickable(companyModuleButtonDropDown);
        hoverOverElement(companyModuleButtonDropDown);
        companyModuleButtonDropDown.click();
    }

    public boolean getCompanyModuleButtonAvailability(){
        waitForVisibility(companyModuleButton);
        return isTheElementDisplayed(companyModuleButton);
    }

    public int getCompanySubModuleContainerSize(){
        return companySubModuleContainer.size();
    }

    public void navigateToCareerModulePage(){
        waitForElementToBeClickable(careersModuleButton);
        careersModuleButton.click();
    }

    public void navigateToPartnershipModulePage(){
        waitForElementToBeClickable(partnershipModuleButton);
        partnershipModuleButton.click();
    }

    public void clickOnCustomerSuccessModuleDropDown(){
        waitForElementToBeClickable(customerSuccessModuleDropdownButton);
        customerSuccessModuleDropdownButton.click();
    }

    public boolean getCustomerSuccessButtonAvailability(){
        waitForElementToBeClickable(customerSuccessButton);
        return isTheElementDisplayed(customerSuccessButton);
    }

    public int getCustomerSuccessSubModuleContainerSize(){
        return customerSuccessSubModuleContainer.size();
    }

    public void navigateToTestimonialsPage(){
        waitForElementToBeClickable(ourCustomersButton);
        ourCustomersButton.click();
    }

    public void navigateToExperienceSupportPage(){
        waitForElementToBeClickable(experienceAndSupportButton);
        experienceAndSupportButton.click();
    }

    public void clickOnTechnologySubModuleDropDown(){
        waitForElementToBeClickable(technologyModuleDropDownButton);
        technologyModuleDropDownButton.click();
    }

    public boolean getTechnologyModuleButtonAvailability(){
        return isTheElementDisplayed(technologyModuleButton);
    }

    public boolean getTechnologySubModulesAvailability(){
        return isTheElementDisplayed(artificialIntelligenceModuleButton) && isTheElementDisplayed(securityModuleButton)
                && isTheElementDisplayed(interoperabilityModuleButton) &&
                isTheElementDisplayed(cloudComputingModuleButton);
    }

    public void navigateToArtificialIntelligencePage(){
        waitForElementToBeClickable(artificialIntelligenceModuleButton);
        artificialIntelligenceModuleButton.click();
    }

    public void navigateToSecurityPage(){
        waitForElementToBeClickable(securityModuleButton);
        securityModuleButton.click();
    }

    public void navigateToBlogModule(){
        scrollElementIntoView(blogModuleButton);
        waitForElementToBeClickable(blogModuleButton);
        blogModuleButton.click();
        changeWindowTabs();
    }

    public void clickOnSolutionsDropDownButton(){
        isTheElementDisplayed(solutionsDropDownButton);
        solutionsDropDownButton.click();
    }
    public boolean getSolutionsModuleButtonAvailability(){
        return isTheElementDisplayed(solutionsModuleButton);
    }

    public boolean getCapacityModuleButtonAndAllSubModuleButtonAvailability(){
        return isTheElementDisplayed(capacityManagementModuleButton) &&
                isTheElementDisplayed(onCallSchedulingModuleButton) &&
                isTheElementDisplayed(communicationCenterModuleButton) &&
                isTheElementDisplayed(secureMessagingModuleButton);
    }

    public boolean getCareCoordinationModuleButtonAndAllSubModuleButtonAvailability(){
        return isTheElementDisplayed(careCoordinationModuleButton) && isTheElementDisplayed(primaryCareModuleButton) &&
                isTheElementDisplayed(specialityCareModuleButton) && isTheElementDisplayed(immunizationModuleButton) &&
                isTheElementDisplayed(referralsAndWaitListModuleButton) &&
                isTheElementDisplayed(patientSelfSchedulingModuleButton);
    }

    public void navigateToOnCallSchedulingModule(){
        waitForElementToBeClickable(onCallSchedulingModuleButton);
        onCallSchedulingModuleButton.click();
    }

    public void navigateToCommunicationCenterModule(){
        waitForElementToBeClickable(communicationCenterModuleButton);
        communicationCenterModuleButton.click();
    }

    public void navigateToSecureMessagingModule(){
        waitForElementToBeClickable(secureMessagingModuleButton);
        secureMessagingModuleButton.click();
    }
}
