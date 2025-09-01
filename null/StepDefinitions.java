package null;



// StepDefinitions.java
package com.nisum.stepdefinitions;

import com.nisum.pages.DemoQAPage;
import com.nisum.pages.ElementsPage;
import com.nisum.pages.TextBoxPage;
import com.nisum.utils.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {

    private WebDriver driver;
    private DemoQAPage demoQAPage;
    private ElementsPage elementsPage;
    private TextBoxPage textBoxPage;

    public StepDefinitions() {
        driver = WebDriverUtils.getDriver();
        demoQAPage = new DemoQAPage(driver);
        elementsPage = new ElementsPage(driver);
        textBoxPage = new TextBoxPage(driver);
    }

    @Given("I am on the Demo QA page {string}")
    public void i_am_on_the_demo_qa_page(String url) {
        driver.get(url);
    }

    @When("I click on Elements tab")
    public void i_click_on_elements_tab() {
        demoQAPage.clickElementsTab();
    }

    @Then("I am navigated to page {string}")
    public void i_am_navigated_to_page(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @When("I click on Text Box link")
    public void i_click_on_text_box_link() {
        elementsPage.clickTextBoxLink();
    }

    @Then("I can see Text Box fields")
    public void i_can_see_text_box_fields() {
        Assert.assertTrue(textBoxPage.isTextBoxFieldsDisplayed());
    }

    @When("I enter {string} in the Full Name field")
    public void i_enter_in_the_full_name_field(String fullName) {
        textBoxPage.enterFullName(fullName);
    }

@And("I am on the Demo QA page {string}")
public void i_am_on_the_demo_qa_page(String url) {
    driver.get(url);
}
@And("I click on Elements tab")
public void i_click_on_elements_tab() {
    demoQAPage.clickElementsTab();
}
@And("I am navigated to page {string}")
public void i_am_navigated_to_page(String expectedUrl) {
    Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
}
@And("I click on Text Box link")
public void i_click_on_text_box_link() {
    elementsPage.clickTextBoxLink();
}
@And("I can see Text Box fields")
public void i_can_see_text_box_fields() {
    Assert.assertTrue(textBoxPage.isTextBoxFieldsDisplayed());
}
@And("I enter {string} in the Full Name field")
public void i_enter_in_the_full_name_field(String fullName) {
    textBoxPage.enterFullName(fullName);
}
@And("I enter {string} in the Current Address field")
public void i_enter_in_the_current_address_field(String currentAddress) {
    textBoxPage.enterCurrentAddress(currentAddress);
}}