package com.digital.ui.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {

    private WebDriver driver;

    private final By textBoxLink = By.id("item-0");

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getTextBoxLink() {
        return driver.findElement(textBoxLink);
    }

    public void clickTextBoxLink() {
        getTextBoxLink().click();
    }
}