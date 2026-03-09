package stepDefinitions;


import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.ProductsPage;
import utils.DriverFactory;

public class LoginSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    ProductsPage productsPage = new ProductsPage(driver);

    @Given("user is on login page")
    public void userOpenLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }
    @When("user enters username {string}")
    public void enterUserName(String userName) {
        loginPage.enterUsername(userName);
    }
    @And("user enters password {string}")
    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }
    @And("user clicks login")
    public void clickLogin(){
        loginPage.clickButton();
    }
    @Then("user should see products page")
    public void redirectToProductsPage() {
        Assert.assertTrue(productsPage.isProductsPageDisplayed());
    }
}
