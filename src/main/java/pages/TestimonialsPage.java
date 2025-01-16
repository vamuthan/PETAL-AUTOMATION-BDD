package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class TestimonialsPage extends PetalHomePage{

    @FindBy(css = "a[href='#list'] > span:nth-child(3) > span:nth-child(2) > span")
    protected WebElement seeWhoWeHelpedButton;

    @FindBy(css = "#list > li:nth-child(1) > article > div:nth-child(2) > h2 > div")
    protected WebElement groupeSaneCHCTestimonial;

    @FindBy(css = "#list > li:nth-child(2) > article > div:nth-child(2) > h2 > div")
    protected WebElement vancouverGeneralHospitalTestimonial;

    @FindBy(css = "#list > li:nth-child(3) > article > div:nth-child(2) > h2 > div")
    protected WebElement jewishGeneralHospitalTestimonial;

    @FindBy(css = "#list > li:nth-child(4) > article > div:nth-child(2) > h2 > div")
    protected WebElement CHUMTestimonial;

    @FindBy(css = "#list > li:nth-child(5) > article > div:nth-child(2) > h2 > div")
    protected WebElement vitaliteHealthNetworkTestimonial;

    @FindBy(css = "#list > li:nth-child(6) > article > div:nth-child(2) > h2 > div")
    protected WebElement quebecMinistryOfHealthAndSocialServiceTestimonial;

    @FindBy(css = "#list > li:nth-child(7) > article > div:nth-child(2) > h2 > div")
    protected WebElement centreHospitalierLeVinatierTestimonial;

    public TestimonialsPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToSeeWhoWeHelpedSection(){
        waitForElementToBeClickable(seeWhoWeHelpedButton);
        seeWhoWeHelpedButton.click();
    }

    public List<String> getTestimonialsName(){
        List<String> testimonialNameContainer = new ArrayList<>();
        scrollElementIntoView(groupeSaneCHCTestimonial);
        testimonialNameContainer.add(getTextContentJS(groupeSaneCHCTestimonial));
        scrollElementIntoView(vancouverGeneralHospitalTestimonial);
        testimonialNameContainer.add(getTextContentJS(vancouverGeneralHospitalTestimonial));
        scrollElementIntoView(jewishGeneralHospitalTestimonial);
        testimonialNameContainer.add(getTextContentJS(jewishGeneralHospitalTestimonial));
        scrollElementIntoView(CHUMTestimonial);
        testimonialNameContainer.add(getTextContentJS(CHUMTestimonial));
        scrollElementIntoView(vitaliteHealthNetworkTestimonial);
        testimonialNameContainer.add(getTextContentJS(vitaliteHealthNetworkTestimonial));
        scrollElementIntoView(quebecMinistryOfHealthAndSocialServiceTestimonial);
        testimonialNameContainer.add(getTextContentJS(quebecMinistryOfHealthAndSocialServiceTestimonial));
        scrollElementIntoView(centreHospitalierLeVinatierTestimonial);
        testimonialNameContainer.add(getTextContentJS(centreHospitalierLeVinatierTestimonial));
        return testimonialNameContainer;
    }
}
