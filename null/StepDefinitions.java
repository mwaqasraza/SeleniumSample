package null;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;

public class StepDefinitions {

    private WebDriver driver;
    private HomePage homePage;
    private ElementsPage elementsPage;
    private TextBoxPage textBoxPage;

    public StepDefinitions() {
        // Initialize WebDriver and Page Objects
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        elementsPage = new ElementsPage(driver);
        textBoxPage = new TextBoxPage(driver);
    }

    @Given("I am on the Demo QA page {string}")
    public void iAmOnTheDemoQAPage(String url) {
        driver.get(url);
    }

    @When("I click on {string} tab")
    public void iClickOnTab(String tabName) {
        if (tabName.equals("Elements")) {
            homePage.clickElementsTab();
        } else {
            // Handle other tabs if needed
            System.out.println("Unhandled tab: " + tabName);
        }
    }

    @Then("I am navigated to page {string}")
    public void iAmNavigatedToPage(String expectedUrl) {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, currentUrl);
    }

    @When("I click on Text Box link")
    public void iClickOnTextBoxLink() {
        elementsPage.clickTextBoxLink();
    }

    @Then("I can see Text Box fields")
    public void iCanSeeTextBoxFields() {
        Assert.assertTrue(textBoxPage.isFullNameFieldDisplayed());
        Assert.assertTrue(textBoxPage.isEmailFieldDisplayed());
        Assert.assertTrue(textBoxPage.isCurrentAddressFieldDisplayed());
        Assert.assertTrue(textBoxPage.isPermanentAddressFieldDisplayed());
    }

    @When("I enter {string} in the Full Name field")
    public void iEnterInTheFullNameField(String fullName) {
        textBoxPage.enterFullName(fullName);
    }

    @And("I enter {string} in the Email field")
    public void iEnterInTheEmailField(String email) {
        textBoxPage.enterEmail(email);
    }

    @And("I enter {string} in the Current Address field")
    public void iEnterInTheCurrentAddressField(String currentAddress) {
        textBoxPage.enterCurrentAddress(currentAddress);
    }

    @And("I enter {string} in the Permanent Address field")
    public void iEnterInThePermanentAddressField(String permanentAddress) {
        textBoxPage.enterPermanentAddress(permanentAddress);
    }

    @And("I click the Submit button")
    public void iClickTheSubmitButton() {
        textBoxPage.clickSubmitButton();
    }


    // Example of handling different parameters in a single step definition (if needed)
    @When("I click {string}")
    public void iClick(String element) {
        if (element.equals("Home.Login")) {
            // Code to click the login button on the home page
            System.out.println("Clicking Home.Login");
        } else if (element.equals("SomeOtherButton")) {
            // Code to click some other button
            System.out.println("Clicking SomeOtherButton");
        } else {
            System.out.println("Unknown element to click: " + element);
        }
    }
}