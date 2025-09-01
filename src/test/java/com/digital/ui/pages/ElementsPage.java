package com.digital.ui.pages;





// ElementsPage.java
package com.nisum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {

    private WebDriver driver;

    // Global By Locators
    private final By textBoxLink = By.id("item-0");

    // Constructor
    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Public getter methods for each element
    public WebElement getTextBoxLink() {
        return driver.findElement(textBoxLink);
    }

    // Public action methods for page related actions
    public void clickTextBoxLink() {
        getTextBoxLink().click();
    }
//modified existing method
public WebElement getTextBoxLink() {
    return driver.findElement(textBoxLink);
}//modified existing method
public void clickTextBoxLink() {
    getTextBoxLink().click();
}}