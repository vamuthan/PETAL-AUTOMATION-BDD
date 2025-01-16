package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.PetalHomePage;
import util.TestDataMapper;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Set;

public class BaseSteps {

    protected static RemoteWebDriver driver;
    protected static ChromeOptions chromeOptions;
    protected static String executionMode;
    protected static String browserType;
    protected static final String LT_USERNAME = System.getProperty("lt_username");
    protected static final String LT_ACCESS_KEY = System.getProperty("lt_access_key");
    protected static final String GRID_URL = "@hub.lambdatest.com/wd/hub";

    @Step("Performing base setup.")
    @BeforeAll
    public static void setUp(){
        executionMode = System.getProperty("executionMode", "local");
        browserType = System.getProperty("browserType", "chrome");
        if(executionMode.equalsIgnoreCase("lambdatest")){
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", "edge");
            capabilities.setCapability("browserVersion", "131.0");
            capabilities.setCapability("platformName", "Windows 11");
            try {
                driver = new RemoteWebDriver(new URL("https://" + LT_USERNAME + ":" + LT_ACCESS_KEY + GRID_URL),
                        capabilities);
            } catch (MalformedURLException e) {
                System.out.println("Invalid grid URL");
            } catch (Exception e) {
                System.out.println("Failed to initialize RemoteWebDriver: " + e.getMessage());
            }
        }
        else{
            switch (browserType) {
                case "chrome":
                    chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--start-maximized");
                    driver = new ChromeDriver(chromeOptions);
                    break;

                case "firefox":
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    break;

                case "edge":
                    driver = new EdgeDriver();
                    driver.manage().window().maximize();
                    break;

                default:
                    throw new IllegalArgumentException("Unsupported browser type: " + browserType);
            }
        }
        driver.get("https://www.petal-health.com");
        BaseSteps baseSteps = new BaseSteps();
        baseSteps.loadTestData();
    }

    @Step("Loading Test data.")
    public void loadTestData(){
        TestDataMapper testDataMapper = new TestDataMapper();
        testDataMapper.mapTestData();
    }

    @Step("the user is logged into the application and in the home page")
    @Given("the user is logged into the application and in the home page")
    public void the_user_is_logged_into_the_application_and_in_the_home_page() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        Map<String, String> userData = (Map<String, String>) TestDataMapper.getTestData().
                get("baseTestTestData");
        Assert.assertTrue(petalHomePage.getCurrentPageURL().contains(userData.get("pageURLValue")));
    }

    @Step("the user clicks on company module button")
    @When("the user clicks on company module button")
    public void the_user_clicks_on_company_module_button() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        petalHomePage.clickOnCompanyModuleDropDownButton();
    }

    @Step("the user sees a dropdown containing company module button")
    @Then("the user sees a dropdown containing company module button")
    public void the_user_sees_a_dropdown_containing_company_module_button() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        Assert.assertTrue(petalHomePage.getCompanyModuleButtonAvailability());
    }

    @Step("the user see a dropdown containing further four module options")
    @Then("the user see a dropdown containing further four module options")
    public void the_user_see_a_dropdown_containing_further_four_module_options() {
        PetalHomePage petalHomePage = PageFactory.initElements(driver, PetalHomePage.class);
        Map<String, String> userData = (Map<String, String>) TestDataMapper.getTestData().
                get("baseTestTestData");
        Assert.assertEquals(userData.get("optionContainerSize"), petalHomePage.getCompanySubModuleContainerSize());
    }

    @Step("Performing method setup.")
    @After
    public void testMethodSetup(){
        driver.get("https://www.petal-health.com");
        closeInactiveWindows();
    }

    @Step("closing inactive windows.")
    public void closeInactiveWindows() {
        String activeWindowHandle = driver.getWindowHandle();
        Set<String> windowHandleContainer = driver.getWindowHandles();
        for (String currentWindowHandle : windowHandleContainer) {
            if(!currentWindowHandle.equals(activeWindowHandle)) {
                driver.switchTo().window(currentWindowHandle);
                driver.close();
            }
        }
        driver.switchTo().window(activeWindowHandle);
    }

    @Step("Performing tear down actions.")
    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
