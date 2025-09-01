package null;



import com.nisum.pages.ElementsPage;
import com.nisum.pages.HomePage;
import com.nisum.pages.TextBoxPage;
import com.nisum.utils.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {

    private WebDriver driver;
    private HomePage homePage;
    private ElementsPage elementsPage;
    private TextBoxPage textBoxPage;

    public StepDefinitions() {
        driver = WebDriverUtils.getDriver();
        homePage = new HomePage(driver);
        elementsPage = new ElementsPage(driver);
        textBoxPage = new TextBoxPage(driver);
    }

    @Given("I am on the Demo QA page {string}")
    public void i_am_on_the_demo_qa_page(String url) {
        driver.get(url);
    }

    @When("I click on Elements tab")
    public void i_click_on_elements_tab() {
        homePage.clickElementsTab();
    }

    @Then("I am navigated to page {string}")
    public void i_am_navigated_to_page(String expectedUrl) {
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
    }

    @When("I click on Text Box link")
    public void i_click_on_text_box_link() {
        elementsPage.clickTextBoxLink();
    }

    @Then("I can see Text Box fields")
    public void i_can_see_text_box_fields() {
        Assert.assertTrue(textBoxPage.textBoxFieldsAreDisplayed());
    }

    @When("I enter {string} in the Full Name field")
    public void i_enter_in_the_full_name_field(String fullName) {
        textBoxPage.enterFullName(fullName);
    }

    @When("I enter {string} in the Email field")
    public void i_enter_in_the_email_field(String email) {
        textBoxPage.enterEmail(email);
    }

    @Then("I can see Text Box fields")
    public void i_can_see_text_box_fields() {
        Assert.assertTrue(textBoxPage.textBoxFieldsAreDisplayed());
    }

    @When("I enter {string} in the Full Name field")
    public void i_enter_in_the_full_name_field(String fullName) {
        textBoxPage.enterFullName(fullName);
    }
}