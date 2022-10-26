package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageobject.pages.HomePage;
import org.example.pageobject.pages.ProductPage;
import org.testng.Assert;

import static org.example.stepdefinitions.BaseSteps.webDriver;

public class HomePageSteps {
    HomePage homePage = new HomePage(webDriver);
    @Given("User is on Home Page")
    public void user_is_on() {

        homePage.open();
    }
    @Given("User clicks on Computers and Accessories category on Home page")
    public void user_clicks_on_category_on() {
        homePage.clickComputersCategory();
    }

    @Given("User added and item in cart")
    public void user_added_and_item_in_cart() {

        homePage.open()
                .clickComputersCategory()
                .clickOnItem();

        ProductPage productPage = new ProductPage(webDriver);

        productPage.addToCart();

        String actualCartNumber = productPage.getCartNumber();
        String actualCartMessage = productPage.getAddToCartMessage();

        Assert.assertEquals(actualCartMessage, "Added to Cart", "Added to Cart message not present");
        Assert.assertEquals(actualCartNumber, "1", "Cart number is not\"1\"");
    }
    @When("User hovers on the flag icon in the top menu bar")
    public void userHoversOnFlagIcon() {
        homePage.hoverOnFlagIcon();
    }
    @When("User clicks on Deutsch - DE")
    public void user_clicks_on() {
        homePage.clickOnGerman();
    }
    @Then("The text indicating the language changes from English to Deutsch")
    public void the_text_indicating_the_language_changes_from_english() {
        homePage.waitForLanguageLabel();
    }
}
