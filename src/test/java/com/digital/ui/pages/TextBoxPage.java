package com.digital.ui.pages;



















// TextBoxPage.java
package com.nisum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage {

    private WebDriver driver;

    // Global By Locators
    private final By fullNameField = By.id("userName");


    // Constructor
    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    // Public getter methods for each element
    public WebElement getFullNameField() {
        return driver.findElement(fullNameField);
    }

    // Public action methods for page related actions
    public void enterFullName(String fullName) {
        getFullNameField().sendKeys(fullName);
    }

    public boolean isTextBoxFieldsDisplayed() {
        try {
            return getFullNameField().isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }

    }

private final By currentAddressField = By.id("currentAddress");private final By submitButton = By.id("submit");//modified existing method
public WebElement getFullNameField() {
    return driver.findElement(fullNameField);
}//modified existing method
public void enterFullName(String fullName) {
    getFullNameField().sendKeys(fullName);
}//new method
public WebElement getCurrentAddressField() {
    return driver.findElement(currentAddressField);
}//new method
public void enterCurrentAddress(String currentAddress) {
    getCurrentAddressField().sendKeys(currentAddress);
}//new method
public WebElement getSubmitButton() {
    return driver.findElement(submitButton);
}//new method
public void clickSubmitButton() {
    getSubmitButton().click();
}//modified existing method
public boolean isTextBoxFieldsDisplayed() {
    try {
        return getFullNameField().isDisplayed() && getCurrentAddressField().isDisplayed();
    } catch (org.openqa.selenium.NoSuchElementException e) {
        return false;
    }
}}