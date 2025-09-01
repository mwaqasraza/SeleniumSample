package com.digital.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQaHomePage {

    private WebDriver driver;

    private final By elementsTab = By.xpath("//div[@class='card mt-4 top-card'][1]");

    public DemoQaHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElementsTab() {
        return driver.findElement(elementsTab);
    }

    public void clickElementsTab() {
        getElementsTab().click();
    }
}