package com.digital.ui.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage {

    private WebDriver driver;

    private final By fullNameField = By.id("userName");
    private final By emailField = By.id("userEmail");

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFullNameField() {
        return driver.findElement(fullNameField);
    }

    public WebElement getEmailField() {
        return driver.findElement(emailField);
    }

    public boolean textBoxFieldsAreDisplayed() {
        return getFullNameField().isDisplayed() && getEmailField().isDisplayed();
    }

    public void enterFullName(String fullName) {
        getFullNameField().sendKeys(fullName);
    }

    public void enterEmail(String email) {
        getEmailField().sendKeys(email);
    }
}