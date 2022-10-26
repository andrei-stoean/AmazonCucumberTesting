package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import org.example.pageobject.pages.HomePage;
import org.example.pageobject.pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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

    @Given("User added and item in cart")
    public void user_added_and_item_in_cart() {
        homePage = new HomePage(webDriver);
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
}
