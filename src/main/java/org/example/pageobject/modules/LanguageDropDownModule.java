package org.example.pageobject.modules;

import org.example.pageobject.BasePage;
import org.example.pageobject.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LanguageDropDownModule extends BasePage {
    @FindBy(xpath = "//span[@class=\"nav-text\"]/i")
    WebElement germanLanguage;

    public LanguageDropDownModule(WebDriver webDriver) {
        super(webDriver);
    }



}
