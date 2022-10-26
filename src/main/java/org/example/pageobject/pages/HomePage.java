package org.example.pageobject.pages;

import org.example.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    public static final String AMAZON_URL = "https://www.amazon.com/";
    @FindBy(xpath = "//a[@aria-label=\"Computers & Accessories\"]")
    WebElement computersCategory;
    @FindBy(xpath = "//div[@id=\"nav-belt\"]/div[3]/div/a/span")
    WebElement flagIcon;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage open() {
        webDriver.get(AMAZON_URL);
        webDriver.manage().deleteAllCookies();
        webDriver.manage().window().maximize();
        return this;
    }

    public ResultsPage clickComputersCategory(){
        computersCategory.click();
        return new ResultsPage(webDriver);
    }

    public LanguagePage clickOnFlagIcon(){
        flagIcon.click();
        return new LanguagePage(webDriver);
    }

    public HomePage waitForLanguageLabel() {
        new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.textToBe(By.xpath("//span[@class=\"icp-nav-language\"]"), "Deutsch"));
        return this;
    }
}
