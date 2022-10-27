package org.example.pageobject.pages;

import org.example.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class LanguagePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"icp-language-settings\"]/div[5]/div/label/span/span")
    WebElement germanLanguage;
    @FindBy(xpath = "//*[@id=\"icp-save-button\"]/span")
    WebElement saveSettings;
    public LanguagePage(WebDriver webDriver){ super(webDriver);}
    public LanguagePage clickOnGerman(){
        germanLanguage.click();
        return this;
    }
    public LanguagePage clickOnSaveSettings(){
        saveSettings.click();
        return this;
    }
    public LanguagePage waitForHelloText() {

//        String expectedValues[] = {"DE","Deutsch"};
//        List<String> expectedValuesList = Arrays.asList(expectedValues);
        new WebDriverWait(webDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"),"Hallo, anmelden" ));

//        new WebDriverWait(webDriver, Duration.ofSeconds(5))
//                .until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[1]/span"), expectedValuesList.toString()));
        return this;
    }
}
