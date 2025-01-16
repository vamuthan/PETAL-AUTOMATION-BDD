package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WebPage {

    protected WebDriver driver;
    protected WebDriverWait webDriverWait;
    protected JavascriptExecutor javascriptExecutor;
    protected Actions actions;

    public WebPage(WebDriver driver){
        this.driver = driver;
        javascriptExecutor = (JavascriptExecutor) driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }

    public void stopExecution(int seconds){
        try{
            Thread.sleep(TimeUnit.SECONDS.toMillis(seconds));
        }
        catch (InterruptedException e) {
            System.out.println("An exception has occured");
        }
    }

    public void waitForVisibility(WebElement element){
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToBeClickable(WebElement element) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public boolean isTheElementDisplayed(WebElement element){
        return element.isDisplayed();
    }

    public String getCurrentPageURL() {
        return driver.getCurrentUrl();
    }

    public void hoverOverElement(WebElement element){
        actions.moveToElement(element).perform();
    }

    public void scrollElementIntoView(WebElement element){
        javascriptExecutor.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
    }

    public String getTextContentJS(WebElement element){
        return (String) javascriptExecutor.executeScript("return arguments[0].textContent;", element);
    }

    public void changeWindowTabs(){
        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandleContainer = driver.getWindowHandles();
        windowHandleContainer.stream().filter(currentValue -> ! currentValue.equals(currentWindowHandle)).
                forEach(currentValue -> driver.switchTo().window(currentValue));
    }
}
