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
    @Then("The Hello, sign in text changes to Hallo, anmelden")
    public void hello_sign_in_changes_to_hallo_anmelden() {
        languagePage.waitForHelloText();
    }
}
