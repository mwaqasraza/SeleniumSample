package com.digital.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage {

    private WebDriver driver;

    private final By fullNameField = By.id("userName");
    private final By emailField = By.id("userEmail");
    private final By currentAddressField = By.id("currentAddress");
    private final By permanentAddressField = By.id("permanentAddress");
    private final By submitButton = By.id("submit");
    private final By nameOutput = By.id("name");
    private final By emailOutput = By.id("email");
    private final By currentAddressOutput = By.id("currentAddress");
    private final By permanentAddressOutput = By.id("permanentAddress");

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFullNameField() {
        return driver.findElement(fullNameField);
    }

    public WebElement getEmailField() {
        return driver.findElement(emailField);
    }

    public WebElement getCurrentAddressField() {
        return driver.findElement(currentAddressField);
    }

    public WebElement getPermanentAddressField() {
        return driver.findElement(permanentAddressField);
    }

    public WebElement getSubmitButton() {
        return driver.findElement(submitButton);
    }

    public WebElement getNameOutput() { return driver.findElement(nameOutput);}

    public WebElement getEmailOutput() { return driver.findElement(emailOutput);}

    public WebElement getCurrentAddressOutput() { return driver.findElement(currentAddressOutput);}

    public WebElement getPermanentAddressOutput() { return driver.findElement(permanentAddressOutput);}


    public void enterFullName(String fullName) {
        getFullNameField().sendKeys(fullName);
    }

    public void enterEmail(String email) {
        getEmailField().sendKeys(email);
    }

    public void enterCurrentAddress(String currentAddress) {
        getCurrentAddressField().sendKeys(currentAddress);
    }

    public void enterPermanentAddress(String permanentAddress) {
        getPermanentAddressField().sendKeys(permanentAddress);
    }

    public void clickSubmitButton() {
        getSubmitButton().click();
    }

    public String getNameOutputText() { return getNameOutput().getText();}

    public String getEmailOutputText() { return getEmailOutput().getText();}

    public String getCurrentAddressOutputText() { return getCurrentAddressOutput().getText();}

    public String getPermanentAddressOutputText() { return getPermanentAddressOutput().getText();}

}