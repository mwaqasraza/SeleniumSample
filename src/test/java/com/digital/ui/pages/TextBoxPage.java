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

}