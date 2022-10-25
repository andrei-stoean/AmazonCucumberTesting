package org.example.stepdefinitions;

import io.cucumber.java.en.When;
import org.example.pageobject.pages.ResultsPage;

import static org.example.stepdefinitions.BaseSteps.webDriver;

public class ResultsPageSteps {
    ResultsPage resultsPage;
    @When("User clicks on Seagate Portable 2TB External Hard Drive on Results Page")
    public void user_clicks_on_product() {
        resultsPage = new ResultsPage(webDriver);
        resultsPage.clickOnItem();
    }

}
