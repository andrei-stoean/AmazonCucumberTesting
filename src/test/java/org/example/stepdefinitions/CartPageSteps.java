package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageobject.pages.CartPage;
import org.testng.Assert;

import static org.example.stepdefinitions.BaseSteps.webDriver;

public class CartPageSteps {
    CartPage cartPage = new CartPage(webDriver);
    @When("User clicks on Delete")
    public void user_clicks_on_delete() {
        cartPage.deleteItem();
    }
    @Then("Text appears {string}")
    public void text_appears(String string) {
        cartPage.waitForCartStatusText();
    }
    @Then("the subtotal price is {string}")
    public void the_subtotal_price_is(String expectedPrice) {
        String actualPrice = cartPage.getPrice();
        Assert.assertEquals(actualPrice,expectedPrice,"Actual and Expected Prices are not the same");
    }
}
