package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.jv.Lan;
import org.example.pageobject.pages.LanguagePage;

import static org.example.stepdefinitions.BaseSteps.webDriver;


public class LanguagePageSteps {
    LanguagePage languagePage = new LanguagePage(webDriver);
    @When("User clicks on Deutsch - DE")
    public void user_clicks_on_deutsch_de_and_on_anderungen_speichern() {
        languagePage.clickOnGerman();
    }
    @When("User clicks on anderungen speichern")
    public void user_clicks_on_anderungen_speichern() {
        languagePage.clickOnSaveSettings();
    }
    @Then("The text indicating the language changes from English to Deutsch")
    public void the_text_indicating_the_language_changes_from_english() {
        languagePage.waitForLanguageLabel();
    }
}
