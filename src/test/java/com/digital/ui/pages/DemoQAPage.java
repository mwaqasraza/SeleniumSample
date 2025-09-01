package com.digital.ui.pages;









// DemoQAPage.java
package com.nisum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQAPage {

    private WebDriver driver;

    // Global By Locators
    private final By elementsTab = By.xpath("//div[@class='card mt-4 top-card'][1]");

    // Constructor
    public DemoQAPage(WebDriver driver) {
        this.driver = driver;
    }

    // Public getter methods for each element
    public WebElement getElementsTab() {
        return driver.findElement(elementsTab);
    }

    // Public action methods for page related actions
    public void clickElementsTab() {
        getElementsTab().click();
    }
//modified existing method
public WebElement getElementsTab() {
    return driver.findElement(elementsTab);
}//modified existing method
public void clickElementsTab() {
    getElementsTab().click();
}//new methodpublic String getDemoQAPageUrl() {    return "https://demoqa.com/";}//new method
public void navigateToDemoQAPage() {
    driver.get(getDemoQAPageUrl());
}}