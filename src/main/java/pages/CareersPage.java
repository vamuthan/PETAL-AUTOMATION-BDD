package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CareersPage extends PetalHomePage{

    @FindBy(css = "section > div > div > ul")
    protected WebElement jobsFiltersOutline;

    @FindBy(css = "#career-items > div > div > div:not([class*='load-more'])")
    protected List<WebElement> jobOpeningsContainer;

    public CareersPage(WebDriver driver) {
        super(driver);
    }

    public void scrollToCareerOpportunitiesSection(){
        waitForVisibility(jobsFiltersOutline);
        scrollElementIntoView(jobsFiltersOutline);
        stopExecution(2);
    }

    public boolean getJobsFilterSectionAvailability(){
        return isTheElementDisplayed(jobsFiltersOutline);
    }

    public int getJobOpeningsCount(){
        return jobOpeningsContainer.size();
    }
}
