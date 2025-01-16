package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class PartnershipPage extends PetalHomePage{

    @FindBy(css = "div > div[class='o-container']")
    protected WebElement partnersContainerBlock;

    @FindBy(css = "ul[class='accordion-list'] > li:nth-child(1) > div > h3 > button > div")
    protected WebElement microsoftPartner;

    @FindBy(css = "ul[class='accordion-list'] > li:nth-child(2) > div > h3 > button > div")
    protected WebElement technationCanadaPartner;

    @FindBy(css = "ul[class='accordion-list'] > li:nth-child(3) > div > h3 > button > div")
    protected WebElement dedalusPartner;

    @FindBy(css = "ul[class='accordion-list'] > li:nth-child(4) > div > h3 > button > div")
    protected WebElement zorgiSmarterCarePartner;

    public PartnershipPage(WebDriver driver) {
        super(driver);
    }

    public void scrollToListedPartnersSection(){
        waitForVisibility(partnersContainerBlock);
        scrollElementIntoView(partnersContainerBlock);
        stopExecution(1);
    }

    public List<String> getPartnersName(){
        List<String> partnerNameContainer = new ArrayList<>();
        partnerNameContainer.add(microsoftPartner.getText());
        partnerNameContainer.add(technationCanadaPartner.getText());
        partnerNameContainer.add(dedalusPartner.getText());
        partnerNameContainer.add(zorgiSmarterCarePartner.getText());
        return partnerNameContainer;
    }
}
