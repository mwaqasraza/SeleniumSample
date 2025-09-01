package com.digital.ui.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    private final By elementsTab = By.xpath("//div[@class='card mt-4 top-card']/div/h5[text()='Elements']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElementsTab() {
        return driver.findElement(elementsTab);
    }

    public void clickElementsTab() {
        getElementsTab().click();
    }
}