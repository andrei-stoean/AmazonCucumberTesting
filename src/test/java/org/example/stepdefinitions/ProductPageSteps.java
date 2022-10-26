package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageobject.pages.ProductPage;
import org.testng.Assert;

import static org.example.stepdefinitions.BaseSteps.webDriver;

public class ProductPageSteps {
    ProductPage productPage;

    @When("User clicks on Add to Cart on Product Page")
    public void user_clicks_on_add() {
        productPage = new ProductPage(webDriver);
        productPage.addToCart();
    }

    @Then("Cart number is {int} and a message {string} must appear on Product Page")
    public void message_must_appear_on_product_page(Integer number, String addedToCart) {
        String actualCartNumber = productPage.getCartNumber();
        String actualCartMessage = productPage.getAddToCartMessage();

        Assert.assertEquals(actualCartMessage, "Added to Cart", "Added to Cart message not present");
        Assert.assertEquals(actualCartNumber, "1", "Cart number is not\"1\"");
    }
    @Given("User clicks on Cart")
    public void user_clicks_on_cart() {
        productPage = new ProductPage(webDriver);
        productPage.clickOnCart();
    }
}
