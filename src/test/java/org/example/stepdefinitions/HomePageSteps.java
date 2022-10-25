package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import org.example.pageobject.pages.HomePage;
import org.openqa.selenium.WebDriver;

import static org.example.stepdefinitions.BaseSteps.PAGES_STORAGE;
import static org.example.stepdefinitions.BaseSteps.webDriver;

public class HomePageSteps {
    HomePage homePage;
    @Given("User is on {string}")
    public void user_is_on(String pageName) {
        homePage = new HomePage(webDriver);
        homePage.open();
        //PAGES_STORAGE.put(pageName, homePage);

    }
    @Given("User clicks on Computers and Accessories category on Home page")
    public void user_clicks_on_category_on() {
        homePage.clickComputersCategory();
    }
}
