package org.example.pageobject.pages;

import org.example.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends BasePage {
    @FindBy(xpath = "//*[contains(text(),'Seagate Portable')]")
    WebElement openItem;

    public ResultsPage(WebDriver webDriver) {
        super(webDriver);
    }
    public ProductPage clickOnItem() {
        openItem.click();
        return new ProductPage(webDriver);
    }
}
