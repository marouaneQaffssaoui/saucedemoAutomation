package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CartPage;
import pages.ProductsPage;
import utils.DriverFactory;

public class CartSteps {
    WebDriver driver = DriverFactory.getDriver();

    ProductsPage productsPage = new ProductsPage(driver);
    CartPage cartPage = new CartPage(driver);

    @And("user adds product to cart")
    public void addProduct(){
        productsPage.addProductToCart();
    }
    @And("user opens cart")
    public void openCart() {
        productsPage.openCart();
    }
    @Then("product should appear in cart")
    public void verifyCart() {
        Assert.assertTrue(cartPage.isItemDiplayed());
    }
}
